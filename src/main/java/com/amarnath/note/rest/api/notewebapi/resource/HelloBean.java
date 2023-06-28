package com.amarnath.note.rest.api.notewebapi.resource;

public class HelloBean {
	
	private String Message;

	public HelloBean(String message) {
		super();
		Message = message;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	@Override
	public String toString() {
		return "HelloBean [Message=" + Message + "]";
	}
	
	

}
