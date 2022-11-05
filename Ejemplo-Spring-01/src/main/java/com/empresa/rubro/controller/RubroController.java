package com.empresa.rubro.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.empresa.rubro.service.UsuarioService;


@Controller
@RequestMapping ("/app")
public class RubroController {
	
	@Value("${title.generic}")
	private String TitlePage;
	
	@Autowired
	private UsuarioService personaje = new UsuarioService();
	
	@GetMapping ({"/home","/inicio","/","/home", "/inicio"})
	public String HolaMundo(Model model){
		
		
		
			model.addAttribute("Titulopagina", TitlePage);
			model.addAttribute("Titulo", "Nombre Empresa");
			
			if (personaje.crearpersonaje().getEstado()) {
				
				model.addAttribute("Perfil", personaje.crearpersonaje().getData());
				
			}
			model.addAttribute("Estado", personaje.crearpersonaje().getMensaje());
	
			return "Home";
		
		
	
		
	}
}
