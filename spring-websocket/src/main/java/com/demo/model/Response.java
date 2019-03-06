package com.demo.model;

public class Response {


	private String command;
	
	private User data;
	
	private boolean Success;

	public Response(String command, User data, boolean success) {
		super();
		command = command;
		this.data = data;
		Success = success;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		command = command;
	}

	public User getData() {
		return data;
	}

	public void setData(User data) {
		this.data = data;
	}

	public boolean Success() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}
	
	
	
}
