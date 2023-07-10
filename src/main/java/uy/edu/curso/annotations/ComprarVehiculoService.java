package uy.edu.curso.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComprarVehiculoService {
	
	@Autowired
	@SoyUnaMoto
	private VehiculoService service;
	
	public void comprar() {
		System.out.println(service.getServiceName());
	}
}
