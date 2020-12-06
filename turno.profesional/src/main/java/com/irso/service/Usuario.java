package com.irso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irso.model.Usuario;
import com.irso.repository.UserRepository;

@Service
public class Usuario {

	@Autowired
	private UserRepository userRepository;

	public Iterable<Usuario> getAll() {
		return userRepository.findAll();
	}

	public Usuario guardar(Usuario usuario) {
		return userRepository.save(usuario);
	}

	public Usuario buscarPordni(int Cod_UsuarioDNI) {
		return userRepository.findOne(Cod_UsuarioDNI);
	}

	public void delete(int Cod_UsuarioDNI) {
		userRepository.delete(Cod_UsuarioDNI);
	}

	public Usuario updateUsuario(int Cod_UsuarioDNI, Usuario usuario) {
		Usuario u = userRepository.findOne(Cod_UsuarioDNI);
		if(u!=null){
			u.setnombre(usuario.getnombre());
		}
		return userRepository.save(u);
	}

}
