package uy.edu.curso.annotations;


import org.springframework.stereotype.Component;

@Component
@SoyUnAuto
public class AutoServiceImpl implements VehiculoService {

	public String getServiceName() {
		return "AutoServiceImpl";
	}

}
