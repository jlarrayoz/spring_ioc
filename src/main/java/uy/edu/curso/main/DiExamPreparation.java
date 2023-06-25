package uy.edu.curso.main;

import uy.edu.curso.ExactMatchSearchService;
import uy.edu.curso.SearchService;
import uy.edu.curso.di.LazyStudent;

public class DiExamPreparation {
	
	public static void main(String[] args) {
		
		SearchService service = new ExactMatchSearchService();
		String nameOfTheTextBook = "Spring desde 0";
		
		LazyStudent student = new LazyStudent(service, nameOfTheTextBook);
		
		student.findTheAnswer("¿Qué hora es?");
	}

}
