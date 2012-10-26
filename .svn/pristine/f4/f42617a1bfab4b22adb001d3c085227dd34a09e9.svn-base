package com.ivo.hibernate.scm_aps_d_mps;

/**
 * AbstractScmApsDMpsId entity provides the base persistence definition of the
 * ScmApsDMpsId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractScmApsDMpsId implements java.io.Serializable {

	// Fields

	private String prodId;
	private String verId;
	private String modelId;
	private String grade;
	private String mon;
	private String fcstVerIdFk;

	// Constructors

	/** default constructor */
	public AbstractScmApsDMpsId() {
	}

	/** full constructor */
	public AbstractScmApsDMpsId(String prodId, String verId, String modelId,
			String grade, String mon, String fcstVerIdFk) {
		this.prodId = prodId;
		this.verId = verId;
		this.modelId = modelId;
		this.grade = grade;
		this.mon = mon;
		this.fcstVerIdFk = fcstVerIdFk;
	}

	// Property accessors

	public String getProdId() {
		return this.prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getVerId() {
		return this.verId;
	}

	public void setVerId(String verId) {
		this.verId = verId;
	}

	public String getModelId() {
		return this.modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
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

	public String getFcstVerIdFk() {
		return this.fcstVerIdFk;
	}

	public void setFcstVerIdFk(String fcstVerIdFk) {
		this.fcstVerIdFk = fcstVerIdFk;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractScmApsDMpsId))
			return false;
		AbstractScmApsDMpsId castOther = (AbstractScmApsDMpsId) other;

		return ((this.getProdId() == castOther.getProdId()) || (this
				.getProdId() != null
				&& castOther.getProdId() != null && this.getProdId().equals(
				castOther.getProdId())))
				&& ((this.getVerId() == castOther.getVerId()) || (this
						.getVerId() != null
						&& castOther.getVerId() != null && this.getVerId()
						.equals(castOther.getVerId())))
				&& ((this.getModelId() == castOther.getModelId()) || (this
						.getModelId() != null
						&& castOther.getModelId() != null && this.getModelId()
						.equals(castOther.getModelId())))
				&& ((this.getGrade() == castOther.getGrade()) || (this
						.getGrade() != null
						&& castOther.getGrade() != null && this.getGrade()
						.equals(castOther.getGrade())))
				&& ((this.getMon() == castOther.getMon()) || (this.getMon() != null
						&& castOther.getMon() != null && this.getMon().equals(
						castOther.getMon())))
				&& ((this.getFcstVerIdFk() == castOther.getFcstVerIdFk()) || (this
						.getFcstVerIdFk() != null
						&& castOther.getFcstVerIdFk() != null && this
						.getFcstVerIdFk().equals(castOther.getFcstVerIdFk())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getProdId() == null ? 0 : this.getProdId().hashCode());
		result = 37 * result
				+ (getVerId() == null ? 0 : this.getVerId().hashCode());
		result = 37 * result
				+ (getModelId() == null ? 0 : this.getModelId().hashCode());
		result = 37 * result
				+ (getGrade() == null ? 0 : this.getGrade().hashCode());
		result = 37 * result
				+ (getMon() == null ? 0 : this.getMon().hashCode());
		result = 37
				* result
				+ (getFcstVerIdFk() == null ? 0 : this.getFcstVerIdFk()
						.hashCode());
		return result;
	}

}