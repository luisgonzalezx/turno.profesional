package com.irso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.irso.model.Usuario;
import com.irso.service.Usuario;

@RestController

public class Mascota {

	
	@Autowired
	private Usuario usuario;

	// obtengo mi lista de mascota

	@GetMapping("/mascota")
	public Iterable<Mascota> getMascota() {
		return usuario.getAll();
	}

	// obtener un elemento de mi lista de mascota
	@RequestMapping(method = RequestMethod.GET, path = "/mascota/{Cod_mascota}")
	public Mascota mascota(@PathVariable char Cod_mascota) {
		return usuario.buscarPorcodigomascota(Cod_mascota);
		
	
	}

	// crear un nuevo elemento

	@RequestMapping(method = RequestMethod.POST, path = "/mascota")
	public Mascota add(@RequestBody Mascota mascota) {
		return usuario.guardar(mascota);
	}

	// borrar un elemento
	@RequestMapping(method = RequestMethod.DELETE, path = "/mascota/{Cod_mascota}")
	public void delete(@PathVariable char Cod_mascota) {
		usuario.delete(Cod_mascota);
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/mascota/{Cod_mascota}")
	public Mascota add(@PathVariable char Cod_mascota, @RequestBody Mascota mascota) {
		return usuario.updateMascota(Cod_mascota, mascota);
	}

}

