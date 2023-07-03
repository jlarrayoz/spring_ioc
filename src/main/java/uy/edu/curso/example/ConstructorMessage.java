package uy.edu.curso.example;

public class ConstructorMessage {
	
	private String message = null;
	
	public ConstructorMessage(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}


