package uy.edu.curso.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import uy.edu.curso.annotations.AutowiredMessage;
import uy.edu.curso.annotations.MessageService;


@Configuration
@ComponentScan(basePackages = {"uy.edu.curso.configuration"})
public class AnnotationConfiguration {
	
	
	@Bean
	public AutowiredMessage AutowiredMessage() {
		return new AutowiredMessage();
	}
	
	@Bean
	public MessageService messageService() {
		return new MessageService();
	}
}


