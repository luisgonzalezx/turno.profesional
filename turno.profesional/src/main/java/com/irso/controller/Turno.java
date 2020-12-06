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
public class Turno {

	@Autowired
	private Usuario usuario;

	// obtengo mi lista de cita

	@GetMapping("/cita")
	public Iterable<Turno> getturno() {
		return usuario.getAll();
	}

	// obtener un elemento de mi lista de cita
	@RequestMapping(method = RequestMethod.GET, path = "/turno/{Cod_turno}")
	public Turno turno(@PathVariable int Cod_turno) {
		return usuario.buscarPorCod_turno(Cod_turno);
		
		//@ExceptionHandler(UsuarioException.class)
		//public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
			//ErrorResponse error = new ErrorResponse();
			//error.setErrorCode(HttpStatus.PRECONDITION_FAILED.value());
			//error.setMessage(ex.getMessage());
			//return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
		//}
	}

	// crear una nueva cita

	@RequestMapping(method = RequestMethod.POST, path = "/turno")
	public Turno add(@RequestBody Turno turno) {
		return usuario.guardar(turno);
	}

	// borrar cita
	@RequestMapping(method = RequestMethod.DELETE, path = "/turno/{Cod_turno}")
	public void delete(@PathVariable int Cod_turno) {
		usuario.delete(Cod_turno);
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/turno/{Cod_turno}")
	public Turno add(@PathVariable int Cod_turno, @RequestBody Turno turno) {
		return usuario.updateTurno(Cod_turno, turno);
	}

}

