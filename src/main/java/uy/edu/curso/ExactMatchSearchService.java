package uy.edu.curso;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExactMatchSearchService implements SearchService, InitializingBean, DisposableBean {
	
	

	public ExactMatchSearchService() {
		super();
	}

	public List<Integer> find(String searchObjectName, String searchInput) {
		//No se implementa el servico, se devuelve colección vacía
		 return Collections.emptyList();
	}

	public void destroy() throws Exception {
		System.out.println("Se invoca el callback al momento de destruir");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Se invoca el callback al momento de inicializar");
		
	}

}
