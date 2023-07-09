package uy.edu.curso.inheritance;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.core.io.ClassPathResource;

public class DefaultServiceLocator {

	private static IPersonaService personaService;

	private DefaultServiceLocator() {
	}

	public IPersonaService createPersonaServiceInstance(TipoPersona tipo) throws Exception {
		
		tipo = obtenerTipoPersona();
		
		switch (tipo) {
		case FISICA:
			personaService = new PersonaFisicaService();
			break;
		case JURIDICA:
			personaService = new PersonaJuridicaService();
			break;
		}

		return personaService;
	}
	
	private TipoPersona obtenerTipoPersona() throws IOException {
		Properties props = PropertiesLoaderUtils.loadProperties(new ClassPathResource("/config.properties"));
		return TipoPersona.valueOf((String) props.get("tipoServicio"));
	}
}