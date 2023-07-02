package uy.edu.curso.di;

import java.util.List;

import uy.edu.curso.SearchService;

public class LazyStudent {
    private final SearchService service;
    private final String nameOfTheTextBook;

    public LazyStudent(SearchService service, String nameOfTheTextBook) {
        this.service = service;
        this.nameOfTheTextBook = nameOfTheTextBook;
    }

    public List<Integer> findTheAnswer(String examQuestion) {
        return service.find(nameOfTheTextBook, examQuestion);
    }

	public String getNameOfTheTextBook() {
		return nameOfTheTextBook;
	}  
   
}