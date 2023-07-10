package uy.edu.curso.annotations;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AutowiredQualifierMain2 {
		
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("autowired-example.xml");
				

		//NOTA: Necesita que MotoServiceImpl y AutoServiceImpl tengan la anotacion @SoyUnAuto y @SoyUnaMoto		
		Optional<VehiculoService> vehiculoService = getBeanByTypeAndAnnotation(container, VehiculoService.class, SoyUnAuto.class);
		
		if (vehiculoService.isPresent()) {
			System.out.println("VehiculoService type: " + vehiculoService.get().getServiceName());
		}
		else {
			System.out.println("No se encontro el servicio requerido");
		}
		
		//Destruimos el container para ver como se invoca el metodo destroy
		((ClassPathXmlApplicationContext) container).close();
	}
	
	
	private static <T> Optional<T> getBeanByTypeAndAnnotation(ApplicationContext context, Class<T> clazz, Class<? extends Annotation> annotationType) {
	    Collection<T> beans = getBeansByTypeAndAnnotation(context, clazz, annotationType);
	    return beans.stream().findFirst();
	}
	
	private static <T> Collection<T>  getBeansByTypeAndAnnotation(ApplicationContext context, Class<T> clazz, Class<? extends Annotation> annotationType){
	    Map<String, T> typedBeans = context.getBeansOfType(clazz);
	    Map<String, Object> annotatedBeans = context.getBeansWithAnnotation(annotationType);
	    typedBeans.keySet().retainAll(annotatedBeans.keySet());
	    return typedBeans.values();
	}

}
