package br.mil.mar.amrj.ad06.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ADVU_PESS")
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PessoaPk pessoaPk;
	
	@Column( name = "NR_CPF_FUNC_01" )
	private String nrCpfFunc01;
	
	@Column( name = "NR_CPF_FUNC_02" )
	private String nrCpfFunc02;
	
	@Column( name = "NR_CPF_FUNC_03" )
	private String nrCpfFunc03;
	
	@Column( name = "ID_DV_CPF_FUNC" )
	private String idDvCpfFunc;
	
	@Column( name = "NM_FUNC" )
	private String nmFunc;
	
	@Column( name = "NM_GUER_FUNC" )
	private String nmGuerFunc;
	
	@Column(name = "CD_SITC_FNCL")
	private String cdSitcFncl;
	
	@Column(name = "CD_SUPE")
	private String cdSupe;
	
	@Column(name = "CD_DEPT")
	private String cdDept;
	
	@Column(name = "CD_DIVS")
	private String cdDivs;
	
	@Column(name = "CD_SCAO")
	private String cdScao;
	
	@Column(name = "CD_SETR")
	private String cdSetr;
	
	@Column(name = "CD_RESC")
	private String cdResc;
	
	@Column(name = "DT_RESC")
	private LocalDate dtResc;	
	
	@Column(name = "DT_INCL_AFAS")
	private LocalDate dtInclAfas;
	
	@Column(name = "CD_MOVT_AFAS")
	private String cdMovtAfas;

	public PessoaPk getPessoaPk() {
		return pessoaPk;
	}

	public void setPessoaPk(PessoaPk pessoaPk) {
		this.pessoaPk = pessoaPk;
	}

	public String getNrCpfFunc01() {
		return nrCpfFunc01;
	}

	public void setNrCpfFunc01(String nrCpfFunc01) {
		this.nrCpfFunc01 = nrCpfFunc01;
	}

	public String getNrCpfFunc02() {
		return nrCpfFunc02;
	}

	public void setNrCpfFunc02(String nrCpfFunc02) {
		this.nrCpfFunc02 = nrCpfFunc02;
	}

	public String getNrCpfFunc03() {
		return nrCpfFunc03;
	}

	public void setNrCpfFunc03(String nrCpfFunc03) {
		this.nrCpfFunc03 = nrCpfFunc03;
	}

	public String getIdDvCpfFunc() {
		return idDvCpfFunc;
	}

	public void setIdDvCpfFunc(String idDvCpfFunc) {
		this.idDvCpfFunc = idDvCpfFunc;
	}

	public String getNmFunc() {
		return nmFunc;
	}

	public void setNmFunc(String nmFunc) {
		this.nmFunc = nmFunc;
	}

	public String getNmGuerFunc() {
		return nmGuerFunc;
	}

	public void setNmGuerFunc(String nmGuerFunc) {
		this.nmGuerFunc = nmGuerFunc;
	}

	public String getCdSitcFncl() {
		return cdSitcFncl;
	}

	public void setCdSitcFncl(String cdSitcFncl) {
		this.cdSitcFncl = cdSitcFncl;
	}

	public String getCdSupe() {
		return cdSupe;
	}

	public void setCdSupe(String cdSupe) {
		this.cdSupe = cdSupe;
	}

	public String getCdDept() {
		return cdDept;
	}

	public void setCdDept(String cdDept) {
		this.cdDept = cdDept;
	}

	public String getCdDivs() {
		return cdDivs;
	}

	public void setCdDivs(String cdDivs) {
		this.cdDivs = cdDivs;
	}

	public String getCdScao() {
		return cdScao;
	}

	public void setCdScao(String cdScao) {
		this.cdScao = cdScao;
	}

	public String getCdSetr() {
		return cdSetr;
	}

	public void setCdSetr(String cdSetr) {
		this.cdSetr = cdSetr;
	}

	public String getCdResc() {
		return cdResc;
	}

	public void setCdResc(String cdResc) {
		this.cdResc = cdResc;
	}

	public LocalDate getDtResc() {
		return dtResc;
	}

	public void setDtResc(LocalDate dtResc) {
		this.dtResc = dtResc;
	}

	public LocalDate getDtInclAfas() {
		return dtInclAfas;
	}

	public void setDtInclAfas(LocalDate dtInclAfas) {
		this.dtInclAfas = dtInclAfas;
	}

	public String getCdMovtAfas() {
		return cdMovtAfas;
	}

	public void setCdMovtAfas(String cdMovtAfas) {
		this.cdMovtAfas = cdMovtAfas;
	}
	
	
	
	
	
	
}
