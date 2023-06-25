package uy.edu.curso.basic;

import java.util.List;

import uy.edu.curso.ExactMatchSearchService;
import uy.edu.curso.SearchService;

public class LazyStudent {
    private final SearchService service;
    private final String nameOfTheTextBook;

    public LazyStudent() {
        this.service = new ExactMatchSearchService();
        this.nameOfTheTextBook = "Philosophy for dummies";
    }

    public List<Integer> findTheAnswer(String examQuestion) {
        return service.find(nameOfTheTextBook, examQuestion);
    }
}