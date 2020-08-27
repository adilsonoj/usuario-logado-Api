package br.mil.mar.amrj.ad06.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PessoaPk implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Column( name = "NR_NIP" )
	private Integer nrNip;	

	@Column( name = "CD_NIND" )
	private String cdNind;
	
	public Integer getNrNip() {
		return nrNip;
	}

	public void setNrNip(Integer nrNip) {
		this.nrNip = nrNip;
	}

	public String getCdNind() {
		return cdNind;
	}

	public void setCdNind(String cdNind) {
		this.cdNind = cdNind;
	}
	
}