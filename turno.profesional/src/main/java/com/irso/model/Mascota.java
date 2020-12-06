package com.irso.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Mascota {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Cod_mascota;
	private String Nombre;
	private int Cod_UsuarioDNI;
	private String Especie;
	private String Fec_alta;

	
	public int getCod_mascota() {
		return Cod_mascota;
	}

	public void setCod_mascota(char Cod_mascota) {
		this.Cod_mascota = Cod_mascota;
}
	

public String getNombre() {
	return Nombre;
}

public void setNombre(String Nombre) {
	this.Nombre = Nombre;
}

public String getFec_alta() {
	return Fec_alta;
}

public void setFec_alta(String Fec_alta) {
	this.Fec_alta = Fec_alta;
}

public String getEspecie() {
	return Especie;
}

public void setEspecie(String Especie) {
	this.Especie = Especie;
}

public int getCod_UsuarioDNI() {
	return Cod_UsuarioDNI;
}

public void setCod_UsuarioDNI(int Cod_UsuarioDNI) {
	this.Cod_UsuarioDNI = Cod_UsuarioDNI;
}

}

