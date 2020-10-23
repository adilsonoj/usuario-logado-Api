package br.mil.mar.amrj.ad06.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "ADVU_CDTR_PRMT_SESS")
public class PermissaoAcesso implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_SESS")
	private String idSess;

	@Column(name = "DT_SESS")
	private LocalDate dtSess;

	@Column(name = "CD_PROJ")
	private String cdProj;

	@Column(name = "ID_MODU")
	private String idModu;

	@Column(name = "CD_SUPE")
	private char cdSupe;

	@Column(name = "CD_DEPT")
	private char cdDept;

	@Column(name = "CD_DIVS")
	private char cdDivs;

	@Column(name = "CD_SCAO")
	private char cdScao;

	@Column(name = "CD_SETR")
	private char cdSetr;
	
	@Transient
	private String oi;

	@ManyToOne
	@JoinColumn( name = "CD_NIVL_ACES", referencedColumnName = "CD_NIVL_ACES" )
	private CodigoNivelAcesso codigoNivelAcesso;
	
	@ManyToOne
	@JoinColumns({
			@JoinColumn( name = "NR_CPF_01", referencedColumnName = "NR_CPF_FUNC_01", insertable = false, updatable = false ),
			@JoinColumn( name = "NR_CPF_02", referencedColumnName = "NR_CPF_FUNC_02", insertable = false, updatable = false ),
			@JoinColumn( name = "NR_CPF_03", referencedColumnName = "NR_CPF_FUNC_03", insertable = false, updatable = false )
	})
	private Pessoa pessoa;

	public String getIdSess() {
		return idSess;
	}

	public void setIdSess(String idSess) {
		this.idSess = idSess;
	}

	public LocalDate getDtSess() {
		return dtSess;
	}

	public void setDtSess(LocalDate dtSess) {
		this.dtSess = dtSess;
	}

	public String getCdProj() {
		return cdProj;
	}

	public void setCdProj(String cdProj) {
		this.cdProj = cdProj;
	}

	public String getIdModu() {
		return idModu;
	}

	public void setIdModu(String idModu) {
		this.idModu = idModu;
	}

	public char getCdSupe() {
		return cdSupe;
	}

	public void setCdSupe(char cdSupe) {
		this.cdSupe = cdSupe;
	}

	public char getCdDept() {
		return cdDept;
	}

	public void setCdDept(char cdDept) {
		this.cdDept = cdDept;
	}

	public char getCdDivs() {
		return cdDivs;
	}

	public void setCdDivs(char cdDivs) {
		this.cdDivs = cdDivs;
	}

	public char getCdScao() {
		return cdScao;
	}

	public void setCdScao(char cdScao) {
		this.cdScao = cdScao;
	}

	public char getCdSetr() {
		return cdSetr;
	}

	public void setCdSetr(char cdSetr) {
		this.cdSetr = cdSetr;
	}

	public CodigoNivelAcesso getCodigoNivelAcesso() {
		return codigoNivelAcesso;
	}

	public void setCodigoNivelAcesso(CodigoNivelAcesso codigoNivelAcesso) {
		this.codigoNivelAcesso = codigoNivelAcesso;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getOi() {
		oi = new StringBuffer()
			.append(this.cdSupe)
			.append( this.cdDept)
			.append(this.cdDivs)
			.append(this.cdScao)
			.append(this.cdSetr).toString();
		 
		return oi;
	}

	public void setOi(String oi) {
		this.oi = oi;
	}
	
}
