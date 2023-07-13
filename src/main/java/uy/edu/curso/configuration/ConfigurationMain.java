package uy.edu.curso.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import uy.edu.curso.annotations.MessageService;

public class ConfigurationMain {
	public static void main(String[] args) {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationConfiguration.class);
		
		//Substituye al close manual
		ctx.registerShutdownHook();
		
		MessageService service = ctx.getBean(MessageService.class);
		
		service.message();
		
		//Destruimos el container para ver como se invoca el metodo destroy
		//ctx.close();
	}
}
