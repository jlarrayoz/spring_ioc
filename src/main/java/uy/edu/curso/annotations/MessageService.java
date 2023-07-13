package uy.edu.curso.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PreDestroy;

@Service
public class MessageService {
	
	@Autowired
	private AutowiredMessage message;
	
	public void message() {
		message.hello();
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("CALLBACK DESTROY");
	}
}
