package uy.edu.curso.inheritance;

public class InscripcionService {
	
	private IPersonaService personaService;
	
	public InscripcionService(IPersonaService personaService) {
		this.personaService = personaService;
	}
	
	public void inscribirPersona(String identificador, String nombre) {
		System.out.println(personaService.getServiceName());
		personaService.inscribirPersona(identificador, nombre);
	}	
}
