package com.carol.controladores;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.carol.negocio.ICalculo;



@Controller
public class ControladorIMC {

	@Autowired
	ICalculo calculo;
	
	@RequestMapping("calculoimc")
	public String calculaNombreCoches(@RequestParam("nombre") String nombreRecibido, ModelMap model) throws IOException {
		
		//Calculo calculo = new Calculo();
		double imc = calculo.calculoIMC(nombreRecibido);
		
		model.addAttribute("imc", imc);
		
		return "vista";
		
	}
}
