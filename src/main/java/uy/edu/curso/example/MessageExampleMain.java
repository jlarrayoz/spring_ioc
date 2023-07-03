package uy.edu.curso.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class MessageExampleMain {
	
	public static void main(String[] args) {
		System.out.println("Inicializadon el contexto Spring ...");
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/defaultMessage-context.xml");
		
		System.out.println("El contexto Spring se inicializó...");
		
		
		System.out.println("Prueba de inyección por constructor...");
		ConstructorMessage consMessage = applicationContext.getBean("consMessage", ConstructorMessage.class);
		
		System.out.println("Mensaje:" + consMessage.getMessage());
		
		System.out.println("Prueba de inyección por setter...");
		SetterMessage setterMessage = applicationContext.getBean("setterMessage", SetterMessage.class);
		
		System.out.println("Mensaje:" + setterMessage.getMessage());
		
	}
}
