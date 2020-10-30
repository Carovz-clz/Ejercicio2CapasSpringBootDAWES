/**
 * 
 */
package com.carol.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.stereotype.Component;

import com.carol.dto.Persona;

/**
 * @author carol
 *
 */
@Component
public class ConsultaDatos implements IConsultaDatos {
	@Override
	public Persona consultarDatos(String nombre) throws IOException {
		File f = new File("C:\\Users\\201915\\FP\\servidor\\Personas.txt");
		BufferedReader lector = new BufferedReader(new FileReader(f));
		String linea;
		
		while((linea = lector.readLine()) != null) {
			if(linea.contains(nombre)) {
				//Si contiene el nombre devolvemos un objeto de la Clase persona que contiene los datos
				return recuperarDatosPersona(linea);
			}
		}
		
		lector.close();
		return null;
	}
	
	Persona recuperarDatosPersona(String linea) {
		String[] persona = linea.split("-");
		
		//Persona p = new Persona(persona[0], Float.parseFloat(persona[1]), Float.parseFloat(persona[2])/100);
		
		return new Persona(persona[0], Float.parseFloat(persona[1]), Float.parseFloat(persona[2])/100);
		
	}
}
