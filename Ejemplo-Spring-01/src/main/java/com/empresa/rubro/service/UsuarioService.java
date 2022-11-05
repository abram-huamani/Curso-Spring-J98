package com.empresa.rubro.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.empresa.rubro.models.Response;
import com.empresa.rubro.models.Usuario;


@Component
public class UsuarioService {
	public Response<Usuario> crearpersonaje() {
		
		Response<Usuario> response = new Response<>();

		boolean estadoCreacion = false;
		
		
		List<Usuario> perfil = new ArrayList<>();


		Usuario Datos = new Usuario();
		Datos.setNombre("Pinga");
		Datos.setApellido("Ancco");
		Datos.setHotmail("chamakito@hotmail.com");
		Datos.setClave("123");
		

		Usuario Datos2 = new Usuario();
		Datos2.setNombre("Pinga2");
		Datos2.setApellido("Ancco2");
		Datos2.setHotmail("chamakito2@hotmail.com");
		Datos2.setClave("123 2");


		perfil.add(Datos);	
		perfil.add(Datos2);	

		if(perfil.size() > 0) {
			estadoCreacion = true;
			response.setEstado(estadoCreacion);
			response.setMensaje("Creado CORRECTAMENTE");
			response.setData(perfil);
		} else {
			response.setEstado(estadoCreacion);
			response.setMensaje("SE PRODUJO UN ERROR TERRIBLE LO QUE PASARA");
		
			
		}

		
		return response;
	}
}
