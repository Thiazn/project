package com.mat.academyproject.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Corsista implements Serializable{
	private static final long serialVersionUID = 9165374722941093876L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codCorsista;
	
	@Column(nullable = false)
	private String nomeCorsista;
	
	@Column(nullable = false)
	private String cognomeCorsista;
	
	@ManyToMany(mappedBy = "corsisti")
	private List<Corso> precedentiFormativi = new ArrayList <>();

	public long getCodCorsista() {
		return codCorsista;
	}

	public void setCodCorsista(long codCorsista) {
		this.codCorsista = codCorsista;
	}

	public String getNomeCorsista() {
		return nomeCorsista;
	}

	public void setNomeCorsista(String nomeCorsista) {
		this.nomeCorsista = nomeCorsista;
	}

	public String getCognomeCorsista() {
		return cognomeCorsista;
	}

	public void setCognomeCorsista(String cognomeCorsista) {
		this.cognomeCorsista = cognomeCorsista;
	}

	public List<Corso> getPrecedentiFormativi() {
		return precedentiFormativi;
	}

	public void setPrecedentiFormativi(List<Corso> precedentiFormativi) {
		this.precedentiFormativi = precedentiFormativi;
	}

	@Override
	public String toString() {
		return "Corsista [codCorsista=" + codCorsista + ", nomeCorsista=" + nomeCorsista + ", cognomeCorsista="
				+ cognomeCorsista + "]";
	}
	
	
	
}
