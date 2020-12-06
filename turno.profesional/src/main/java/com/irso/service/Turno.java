package com.irso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irso.model.Usuario;
import com.irso.repository.UserRepository;


@Service
public class Turno {
	
	@Autowired
	private UserRepository userRepository;

	public Iterable<Turno> getAll() {
		return userRepository.findAll();
	}

	public Turno guardar(Turno turno) {
		return userRepository.save(turno);
	}

	public Usuario buscarPorcodigocita(int Cod_turno) {
		return userRepository.findOne(Cod_turno);
	}

	public void delete(int Cod_turno) {
		userRepository.delete(Cod_turno);
	}

	public Turno updateCita(int Cod_turno, Turno turno) {
		Turno c = userRepository.findOne(Cod_turno);
		if(c!=null){
			c.setFecha_turno(turno.getFecha_turno());
		}
		return userRepository.save(c);
	}

}

