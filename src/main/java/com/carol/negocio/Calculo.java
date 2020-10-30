/**
 * 
 */
package com.carol.negocio;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.carol.datos.ConsultaDatos;
import com.carol.datos.IConsultaDatos;
import com.carol.dto.Persona;

/**
 * @author carol
 *
 */

@Component
public class Calculo implements ICalculo {
	@Autowired
	IConsultaDatos consultaDatos;
	
	@Override
	public  double calculoIMC(String nombre) throws IOException {
		//Usar clase datos
		//IConsultaDatos consultaDatos = new ConsultaDatos();
		Persona p = consultaDatos.consultarDatos(nombre); //Datos de la persona con el nombre introducido
		
		return (p.getPeso()/p.getAltura());
	}

}
