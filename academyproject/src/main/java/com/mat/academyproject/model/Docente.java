package com.mat.academyproject.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Docente implements Serializable{
	private static final long serialVersionUID = -7351693637517912368L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codDocente;
	
	private String nomeDocente;
	
	private String cognomeDocente;
	
	private String cvDocente;

	public long getCodDocente() {
		return codDocente;
	}

	public void setCodDocente(long codDocente) {
		this.codDocente = codDocente;
	}

	public String getNomeDocente() {
		return nomeDocente;
	}

	public void setNomeDocente(String nomeDocente) {
		this.nomeDocente = nomeDocente;
	}

	public String getCognomeDocente() {
		return cognomeDocente;
	}

	public void setCognomeDocente(String cognomeDocente) {
		this.cognomeDocente = cognomeDocente;
	}

	public String getCvDocente() {
		return cvDocente;
	}

	public void setCvDocente(String cvDocente) {
		this.cvDocente = cvDocente;
	}

	@Override
	public String toString() {
		return "Docente [codDocente=" + codDocente + ", nomeDocente=" + nomeDocente + ", cognomeDocente="
				+ cognomeDocente + ", cvDocente=" + cvDocente + "]";
	}
}
