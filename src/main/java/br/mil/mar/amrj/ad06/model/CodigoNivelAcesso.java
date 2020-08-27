package br.mil.mar.amrj.ad06.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADVU_CODI_NIVL_ACES")
public class CodigoNivelAcesso implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CD_NIVL_ACES")
	private Integer cdNivlAces;
	
	@Column(name = "ID_NIVL_ACES")
	private String idNivlAces;
	
	@Column(name = "DE_NIVL_ACES")
	private String deNivlAces;
	
	@Column(name = "CD_TIPO_NIVL_ACES")
	private Integer cdTipoNivlAces;

	public Integer getCdNivlAces() {
		return cdNivlAces;
	}

	public void setCdNivlAces(Integer cdNivlAces) {
		this.cdNivlAces = cdNivlAces;
	}

	public String getIdNivlAces() {
		return idNivlAces;
	}

	public void setIdNivlAces(String idNivlAces) {
		this.idNivlAces = idNivlAces;
	}

	public String getDeNivlAces() {
		return deNivlAces;
	}

	public void setDeNivlAces(String deNivlAces) {
		this.deNivlAces = deNivlAces;
	}

	public Integer getCdTipoNivlAces() {
		return cdTipoNivlAces;
	}

	public void setCdTipoNivlAces(Integer cdTipoNivlAces) {
		this.cdTipoNivlAces = cdTipoNivlAces;
	}
	
}
