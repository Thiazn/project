package com.mat.academyproject.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class Corso implements Serializable{
	private static final long serialVersionUID = 2477296052209617159L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codCorso;
	
	@Column(nullable = false)
	private String nomeCorso;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date dataInizioCorso;
	
	@Column
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date dataFineCorso;
	
	@Column(nullable = false)
	private double costoCorso;
	
	@Column(nullable = false)
	private String CommentiCorso;
	
	@Column(nullable = false)
	private String aulaCorso;
	
	@ManyToOne
	@JoinColumn(name = "cod_docente", nullable = false)
	private Docente docente;
	
	@ManyToMany
	@JoinTable(
			name = "corsisti_corsi",
			joinColumns = @JoinColumn(name = "cod_corso"),
			inverseJoinColumns = @JoinColumn(name = "cod_corsista")
			)
	private List<Corsista> corsisti = new ArrayList<>();
	
	
}
