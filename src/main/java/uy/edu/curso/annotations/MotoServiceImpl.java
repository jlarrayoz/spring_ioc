package uy.edu.curso.annotations;

import org.springframework.stereotype.Component;

@Component
@SoyUnaMoto
public class MotoServiceImpl implements VehiculoService {
	
	public String getServiceName() {
		return "MotoServiceImpl";
	}

}
