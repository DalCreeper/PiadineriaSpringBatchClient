package com.advancia.spring.batch.model;

public class Operation {
    private String operationtype;
    private String table;
    private String type;
    private String description;
    private String price;
    private String timestamp;
    
	public String getOperationtype() {
		return operationtype;
	}
	
	public void setOperationtype(String operationtype) {
		this.operationtype = operationtype;
	}
	
	public String getTable() {
		return table;
	}
	
	public void setTable(String table) {
		this.table = table;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
	
	public String getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}