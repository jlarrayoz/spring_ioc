package uy.edu.curso.annotations;

import org.springframework.stereotype.Component;

@Component
public class AutowiredMessage {
	
	public void hello() {
		System.out.println("Hola, soy el servicio autowired");
	}
	
	public void anotherMessage() {
		System.out.println("Hola, soy el metodo anotherMessage del servicio autowired");
	}

}
