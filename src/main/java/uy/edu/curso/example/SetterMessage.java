package uy.edu.curso.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class SetterMessage {
	
	private String message = null;

	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@PostConstruct
	public void inicializar() {
		System.out.println("+++++++ Setter inicializar callbsack");		
	}
	
	@PreDestroy
	public void destruir() {
		System.out.println("+++++++ Setter destruir callback");	
	}
}


