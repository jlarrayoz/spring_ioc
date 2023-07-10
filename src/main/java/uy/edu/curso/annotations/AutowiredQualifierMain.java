package uy.edu.curso.annotations;

import org.springframework.beans.factory.annotation.BeanFactoryAnnotationUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AutowiredQualifierMain {
		
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("autowired-example.xml");
				
		//VehiculoService vehiculoService = container.getBean("autos", VehiculoService.class);
		
		//NOTA: Necesita que MotoServiceImpl y AutoServiceImpl tengan la anotacion @Qualifier("autos") y @Qualifier("motos") para que funcione correctamente
		VehiculoService vehiculoService = BeanFactoryAnnotationUtils.qualifiedBeanOfType(container.getAutowireCapableBeanFactory(), VehiculoService.class, "autos");
		
		
		System.out.println("VehiculoService type: " + vehiculoService.getServiceName());
		
		//Destruimos el container para ver como se invoca el metodo destroy
		((ClassPathXmlApplicationContext) container).close();
	}
}
