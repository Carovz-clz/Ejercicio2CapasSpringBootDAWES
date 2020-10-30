package com.carol.datos;

import java.io.IOException;

import com.carol.dto.Persona;

public interface IConsultaDatos {

	Persona consultarDatos(String nombre) throws IOException;

}