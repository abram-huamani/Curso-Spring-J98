package com.empresa.rubro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.empresa.rubro.models.Usuario;


@Controller
@RequestMapping ("/app")
public class RubroController {
	
	@Value("${title.generic}")
	private String TitlePage;
	
	@GetMapping ({"/home","/inicio","/","/home", "/inicio"})
	public String HolaMundo(Model model){
		
		
			Usuario Datos = new Usuario();
			
			Datos.setNombre("Pinga");
			Datos.setApellido("Ancco");
			Datos.setHotmail("chamakito@hotmail.com");
			Datos.setClave("123");
			
		
			List<Usuario> perfil = new ArrayList<>();	
			perfil.add(Datos);
			
		
			model.addAttribute("Titulopagina", TitlePage);
			model.addAttribute("Titulo", "Nombre Empresa");
			model.addAttribute("Perfil", perfil);
			
			return "Home";
		
		
	
		
	}
}
