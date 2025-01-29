package com.advancia.spring.batch.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/batch")
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
    		String absolutePath = new ClassPathResource("PiadineriaAdvancia_operations.csv").getFile().getAbsolutePath();
            JobParameters parameters = new JobParametersBuilder()
                .addLong("time", System.currentTimeMillis())
                .addString("filePath", absolutePath)
                .toJobParameters();
            
            JobExecution execution = jobLauncher.run(job, parameters);
            
            model.addAttribute("jobName", job.getName());
            model.addAttribute("startTime", execution.getStartTime());
            model.addAttribute("endTime", execution.getEndTime() != null ? execution.getEndTime() : "In Progress");
            model.addAttribute("executionId", execution.getId());
            model.addAttribute("status", execution.getStatus());
            
            String exitDescription = execution.getExitStatus().getExitDescription();
            if(exitDescription == null || exitDescription.isEmpty()) {
                exitDescription = execution.getExitStatus().getExitCode();
            }
            model.addAttribute("exitStatus", exitDescription);
            model.addAttribute("stepsCompleted", execution.getStepExecutions());
        } catch(Exception e) {
            model.addAttribute("status", "FAILED");
            model.addAttribute("error", e.getMessage());
        }
        return "jobStatus";
    }
}

// http://localhost:8080/PiadineriaAdvanciaClientBatch/batch/startJob