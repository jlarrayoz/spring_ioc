package uy.edu.curso.inheritance;

public class PersonaFisicaService implements IPersonaService {

	public String getServiceName() {
		return "Soy el servicio de persona fisica";
	}

	public void inscribirPersona(String documento, String nombre) {
		System.out.println("Documento:" + documento + ", Nombre:" + nombre);
		
	}

}
