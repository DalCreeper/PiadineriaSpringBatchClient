package com.advancia.spring.batch.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/PiadineriaAdvanciaClientBatch/batch")
public class BatchController {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job job;
    
    @GetMapping("/startJob")
    public String getStartJobPage() {
        return "startJob";
    }
    
    @GetMapping("/start")
    public String startBatch(Model model) {
        try {
            JobParameters parameters = new JobParametersBuilder()
                .addLong("time", System.currentTimeMillis())
                .toJobParameters();
            JobExecution execution = jobLauncher.run(job, parameters);
            model.addAttribute("status", execution.getStatus());
        } catch(Exception e) {
            model.addAttribute("status", "FAILED");
            model.addAttribute("error", e.getMessage());
        }
        return "jobStatus";
    }
}

// http://localhost:8080/PiadineriaAdvanciaClientBatch/start