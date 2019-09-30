package com.eventosapp.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;


@Entity
public class Convidado {
	//private final static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long codigoconvidado;
	
	@NotEmpty
	private String rg;
	@NotEmpty
	private String nomeConvidado;
	
	@ManyToOne
	private Evento evento;


	public String getNomeConvidado() {
		return nomeConvidado;
	}

	public void setNomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public long getCodigoconvidado() {
		return codigoconvidado;
	}

	public void setCodigoconvidado(long codigoconvidado) {
		this.codigoconvidado = codigoconvidado;
	}

	
}
