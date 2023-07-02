package uy.edu.curso.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import uy.edu.curso.di.LazyStudent;

public class SpringExamPreparation {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");

		LazyStudent lazyStudent = (LazyStudent) container.getBean("student");
		System.out.println(lazyStudent.findTheAnswer("¿Funciona la inyección"));
		System.out.println(lazyStudent.getNameOfTheTextBook());
		
	}

}
