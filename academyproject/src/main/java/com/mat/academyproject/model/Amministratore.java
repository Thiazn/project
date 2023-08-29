package com.mat.academyproject.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Amministratore implements Serializable{
	private static final long serialVersionUID = 1116106170266274699L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codAdmin;
	
	@Column(nullable = false)
	private String nomeAdmin;
	
	@Column(nullable = false)
	private String cognomeAdmin;
	
	@Column(nullable = false)
	private String role = "ADMIN";
	
	@Column(unique = true)
	private String username;
	
	@Column(nullable = false)
	private String password;
	
	@Column
	private boolean enabled=true;

	public long getCodAdmin() {
		return codAdmin;
	}

	public void setCodAdmin(long codAdmin) {
		this.codAdmin = codAdmin;
	}

	public String getNomeAdmin() {
		return nomeAdmin;
	}

	public void setNomeAdmin(String nomeAdmin) {
		this.nomeAdmin = nomeAdmin;
	}

	public String getCognomeAdmin() {
		return cognomeAdmin;
	}

	public void setCognomeAdmin(String cognomeAdmin) {
		this.cognomeAdmin = cognomeAdmin;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "Amministratore [codAdmin=" + codAdmin + ", nomeAdmin=" + nomeAdmin + ", cognomeAdmin=" + cognomeAdmin
				+ ", role=" + role + ", username=" + username + ", password=" + password + ", enabled=" + enabled + "]";
	}
}
