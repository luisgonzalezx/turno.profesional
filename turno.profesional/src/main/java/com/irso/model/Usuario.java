package com.irso.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Cod_UsuarioDNI;
	private String Nombre;
	private String Apellido;
	private String Direccion;
	private String Telefono;
	private String Email;
	private int Cod_mascota;

	
	public int getCod_UsuarioDNI() {
		return Cod_UsuarioDNI;
	}

	public void setCod_UsuarioDNI(int Cod_UsuarioDNI) {
		this.Cod_UsuarioDNI = Cod_UsuarioDNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String Apellido) {
		this.Apellido = Apellido;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String Direccion) {
		this.Direccion = Direccion;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String Telefono) {
		this.Telefono = Telefono;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public int getCod_mascota() {
		return Cod_mascota;
	}

	public void setCod_mascota(int Cod_mascota) {
		this.Cod_mascota = Cod_mascota;
	}
	
}
