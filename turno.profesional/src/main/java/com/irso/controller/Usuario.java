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
public class Usuario {

	@Autowired
	private Usuario usuario;

	// obtengo mi lista de usuarios

	@GetMapping("/usuario")
	public Iterable<Usuario> getUsuario() {
		return usuario.getAll();
	}

	// obtener un elemento de mi lista de usuario
	@RequestMapping(method = RequestMethod.GET, path = "/usuario/{Cod_UsuarioDNI}")
	public Usuario usuario(@PathVariable int Cod_UsuarioDNI) {
		return usuario.buscarPordni(Cod_UsuarioDNI);
		
		
	}

	// crear un nuevo elemento

	@RequestMapping(method = RequestMethod.POST, path = "/usuarios")
	public Usuario add(@RequestBody Usuario usuario) {
		return usuario.guardar(usuario);
	}

	// borrar un elemento
	@RequestMapping(method = RequestMethod.DELETE, path = "/usuario/{Cod_UsuarioDNI}")
	public void delete(@PathVariable int Cod_UsuarioDNI) {
		usuario.delete(Cod_UsuarioDNI);
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/usuario/{Cod_UsuarioDNI}")
	public Usuario add(@PathVariable int Cod_UsuarioDNI, @RequestBody Usuario usuario) {
		return usuario.updateUsuario(Cod_UsuarioDNI, usuario);
	}

}
