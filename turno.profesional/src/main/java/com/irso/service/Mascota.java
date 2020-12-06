package com.irso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irso.model.Usuario;
import com.irso.repository.UserRepository;

@Service

public class Mascota {

	@Autowired
	private UserRepository userRepository;

	public Iterable<Mascota> getAll() {
		return userRepository.findAll();
	}

	public Mascota guardar(Mascota mascota) {
		return userRepository.save(mascota);
	}

	public Mascota buscarPorcodigomascota(int Cod_mascota) {
		return userRepository.findOne(Cod_mascota);
	}

	public void delete(int Cod_mascota) {
		userRepository.delete(Cod_mascota);
	}

	public Mascota updateMascota(int Cod_mascota, Mascota mascota) {
		Mascota m = userRepository.findOne(Cod_mascota);
		if(m!=null){
			m.setnombre(mascota.getnombre());
		}
		return userRepository.save(m);
	}

}

