package uy.edu.curso.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AutowiredMain {
		
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("autowired-example.xml");
		
		MessageService service = container.getBean("messageService", MessageService.class);
		
		service.message();
		
		
		VehiculoService vehiculoService = container.getBean(VehiculoService.class);
		
		
		System.out.println("VehiculoService type: " + vehiculoService.getServiceName());
		
		//Destruimos el container para ver como se invoca el metodo destroy
		((ClassPathXmlApplicationContext) container).close();
	}
}
