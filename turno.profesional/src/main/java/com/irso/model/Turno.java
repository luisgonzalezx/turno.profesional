package com.irso.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Turno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Cod_turno;
	private int Cod_UsuarioDNI;
	private int Cod_mascota;
	private String tratamiento;
	private Date Fecha_turno;
	
	public int getCod_turno() {
		return Cod_turno;
	}

	public void setCod_turno(int Cod_turno) {
		this.Cod_turno = Cod_turno;
	}

	public int getCod_UsuarioDNI() {
		return Cod_UsuarioDNI;
	}

	public void setCod_UsuarioDNI(int Cod_UsuarioDNI) {
		this.Cod_UsuarioDNI = Cod_UsuarioDNI;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String Tratamiento) {
		this.tratamiento = Tratamiento;
		
	}
	
	public Date getFecha_turno() {
		return Fecha_turno;
	}

	public void setFecha_turno(Date Fecha_turno) {
		this.Fecha_turno = Fecha_turno;
	}
	
}
