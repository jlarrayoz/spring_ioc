package uy.edu.curso.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InscribirPersonaMain {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("inheritance-example.xml");
		
			
		InscripcionService service = container.getBean("inscripcionService", InscripcionService.class);
		
		
		service.inscribirPersona("5667432-1", "Jose Pedro Varela");
		
		//Destruimos el container para ver como se invoca el metodo destroy
		((ClassPathXmlApplicationContext) container).close();
	}
}
