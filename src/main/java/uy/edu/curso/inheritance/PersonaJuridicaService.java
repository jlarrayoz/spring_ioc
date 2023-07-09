package uy.edu.curso.inheritance;

public class PersonaJuridicaService implements IPersonaService {

	public String getServiceName() {
		return "Soy el servicio de persona juridica";
	}

	public void inscribirPersona(String rut, String nombreFantasia) {
		System.out.println("RUT:" + rut + ", Nombre fantasia:" + nombreFantasia);
	}
}
