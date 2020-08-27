package br.mil.mar.amrj.ad06.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ADVU_NIVL_ACES_USUA")
public class NivelAcessoUsuario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private NivelAcessoUsuarioPk pk;

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

	@Column(name = "CD_NIVL_ACES")
	private Integer cdNivlAces;

	@Column(name = "ID_USUA_SIST")
	private String idUsuaSist;

	@Column(name = "LG_ULTM_ENTR")
	private char lgUltmEntr;

	@Column(name = "CD_TIPO_USUA_OI")
	private char cdTipoUsuaOi;

	@Column(name = "CD_SUPE_ENCD")
	private char cdSupeEncd;

	@Column(name = "CD_DEPT_ENCD")
	private char cdDeptEncd;

	@Column(name = "CD_DIVS_ENCD")
	private char cdDivsEncd;

	@Column(name = "CD_SCAO_ENCD")
	private char cdScaoEncd;

	@Column(name = "CD_SETR_ENCD")
	private char cdSetrEncd;

	

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

	public Integer getCdNivlAces() {
		return cdNivlAces;
	}

	public void setCdNivlAces(Integer cdNivlAces) {
		this.cdNivlAces = cdNivlAces;
	}

	public String getIdUsuaSist() {
		return idUsuaSist;
	}

	public void setIdUsuaSist(String idUsuaSist) {
		this.idUsuaSist = idUsuaSist;
	}

	public char getLgUltmEntr() {
		return lgUltmEntr;
	}

	public void setLgUltmEntr(char lgUltmEntr) {
		this.lgUltmEntr = lgUltmEntr;
	}

	public char getCdTipoUsuaOi() {
		return cdTipoUsuaOi;
	}

	public void setCdTipoUsuaOi(char cdTipoUsuaOi) {
		this.cdTipoUsuaOi = cdTipoUsuaOi;
	}

	public char getCdSupeEncd() {
		return cdSupeEncd;
	}

	public void setCdSupeEncd(char cdSupeEncd) {
		this.cdSupeEncd = cdSupeEncd;
	}

	public char getCdDeptEncd() {
		return cdDeptEncd;
	}

	public void setCdDeptEncd(char cdDeptEncd) {
		this.cdDeptEncd = cdDeptEncd;
	}

	public char getCdDivsEncd() {
		return cdDivsEncd;
	}

	public void setCdDivsEncd(char cdDivsEncd) {
		this.cdDivsEncd = cdDivsEncd;
	}

	public char getCdScaoEncd() {
		return cdScaoEncd;
	}

	public void setCdScaoEncd(char cdScaoEncd) {
		this.cdScaoEncd = cdScaoEncd;
	}

	public char getCdSetrEncd() {
		return cdSetrEncd;
	}

	public void setCdSetrEncd(char cdSetrEncd) {
		this.cdSetrEncd = cdSetrEncd;
	}

	public NivelAcessoUsuarioPk getPk() {
		return pk;
	}

	public void setPk(NivelAcessoUsuarioPk pk) {
		this.pk = pk;
	}
	

}
