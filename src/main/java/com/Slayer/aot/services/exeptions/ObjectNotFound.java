package com.Slayer.aot.services.exeptions;

public class ObjectNotFound extends RuntimeException {

	private static final long serialVersionUID = 1L;


	public ObjectNotFound(String message, Throwable cause) {
		super(message, cause);
	}

	public ObjectNotFound(String message) {
		super(message);
	}


}
