package uy.edu.curso.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

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
	
	@PostConstruct
	public void inicializar() {
		System.out.println("+++++++ Se invoca el callback annotation al momento de inicializar");		
	}
	
	@PreDestroy
	public void destruir() {
		System.out.println("+++++++ Se invoca el callback annotation al momento de destruir");	
	}
}


