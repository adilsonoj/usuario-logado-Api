package br.mil.mar.amrj.ad06.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NivelAcessoUsuarioPk implements Serializable{
	private static final long serialVersionUID = 1L;

	@Column(name = "NR_CPF_01")
	private String nrCpf01;

	@Column(name = "NR_CPF_02")
	private String nrCpf02;

	@Column(name = "NR_CPF_03")
	private String nrCpf03;

	@Column(name = "ID_DV_CPF")
	private String idDvCpf;
	
	public String getNrCpf01() {
		return nrCpf01;
	}

	public void setNrCpf01(String nrCpf01) {
		this.nrCpf01 = nrCpf01;
	}

	public String getNrCpf02() {
		return nrCpf02;
	}

	public void setNrCpf02(String nrCpf02) {
		this.nrCpf02 = nrCpf02;
	}

	public String getNrCpf03() {
		return nrCpf03;
	}

	public void setNrCpf03(String nrCpf03) {
		this.nrCpf03 = nrCpf03;
	}

	public String getIdDvCpf() {
		return idDvCpf;
	}

	public void setIdDvCpf(String idDvCpf) {
		this.idDvCpf = idDvCpf;
	}
}
