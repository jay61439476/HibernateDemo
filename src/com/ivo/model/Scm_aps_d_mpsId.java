package com.ivo.model;

/**
 * Scm_aps_d_mpsId entity. @author MyEclipse Persistence Tools
 */

public class Scm_aps_d_mpsId implements java.io.Serializable {

	// Fields

	private String prod_id;
	private String ver_id;
	private String grade;
	private String mon;
	private String fcst_ver_id_fk;

	// Constructors

	/** default constructor */
	public Scm_aps_d_mpsId() {
	}

	/** full constructor */
	public Scm_aps_d_mpsId(String prod_id, String ver_id, String grade,
			String mon, String fcst_ver_id_fk) {
		this.prod_id = prod_id;
		this.ver_id = ver_id;
		this.grade = grade;
		this.mon = mon;
		this.fcst_ver_id_fk = fcst_ver_id_fk;
	}

	// Property accessors

	public String getProd_id() {
		return this.prod_id;
	}

	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
	}

	public String getVer_id() {
		return this.ver_id;
	}

	public void setVer_id(String ver_id) {
		this.ver_id = ver_id;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getMon() {
		return this.mon;
	}

	public void setMon(String mon) {
		this.mon = mon;
	}

	public String getFcst_ver_id_fk() {
		return this.fcst_ver_id_fk;
	}

	public void setFcst_ver_id_fk(String fcst_ver_id_fk) {
		this.fcst_ver_id_fk = fcst_ver_id_fk;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Scm_aps_d_mpsId))
			return false;
		Scm_aps_d_mpsId castOther = (Scm_aps_d_mpsId) other;

		return ((this.getProd_id() == castOther.getProd_id()) || (this
				.getProd_id() != null && castOther.getProd_id() != null && this
				.getProd_id().equals(castOther.getProd_id())))
				&& ((this.getVer_id() == castOther.getVer_id()) || (this
						.getVer_id() != null && castOther.getVer_id() != null && this
						.getVer_id().equals(castOther.getVer_id())))
				&& ((this.getGrade() == castOther.getGrade()) || (this
						.getGrade() != null && castOther.getGrade() != null && this
						.getGrade().equals(castOther.getGrade())))
				&& ((this.getMon() == castOther.getMon()) || (this.getMon() != null
						&& castOther.getMon() != null && this.getMon().equals(
						castOther.getMon())))
				&& ((this.getFcst_ver_id_fk() == castOther.getFcst_ver_id_fk()) || (this
						.getFcst_ver_id_fk() != null
						&& castOther.getFcst_ver_id_fk() != null && this
						.getFcst_ver_id_fk().equals(
								castOther.getFcst_ver_id_fk())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getProd_id() == null ? 0 : this.getProd_id().hashCode());
		result = 37 * result
				+ (getVer_id() == null ? 0 : this.getVer_id().hashCode());
		result = 37 * result
				+ (getGrade() == null ? 0 : this.getGrade().hashCode());
		result = 37 * result
				+ (getMon() == null ? 0 : this.getMon().hashCode());
		result = 37
				* result
				+ (getFcst_ver_id_fk() == null ? 0 : this.getFcst_ver_id_fk()
						.hashCode());
		return result;
	}

}