package com.ivo.hibernate.scm_aps;

/**
 * ScmApsId entity. @author MyEclipse Persistence Tools
 */

public class ScmApsId implements java.io.Serializable {

	// Fields

	private String ME_data;
	private String ME_week;

	// Constructors

	/** default constructor */
	public ScmApsId() {
	}

	/** full constructor */
	public ScmApsId(String ME_data, String ME_week) {
		this.ME_data = ME_data;
		this.ME_week = ME_week;
	}

	// Property accessors

	public String getME_data() {
		return this.ME_data;
	}

	public void setME_data(String ME_data) {
		this.ME_data = ME_data;
	}

	public String getME_week() {
		return this.ME_week;
	}

	public void setME_week(String ME_week) {
		this.ME_week = ME_week;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ScmApsId))
			return false;
		ScmApsId castOther = (ScmApsId) other;

		return ((this.getME_data() == castOther.getME_data()) || (this
				.getME_data() != null && castOther.getME_data() != null && this
				.getME_data().equals(castOther.getME_data())))
				&& ((this.getME_week() == castOther.getME_week()) || (this
						.getME_week() != null && castOther.getME_week() != null && this
						.getME_week().equals(castOther.getME_week())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getME_data() == null ? 0 : this.getME_data().hashCode());
		result = 37 * result
				+ (getME_week() == null ? 0 : this.getME_week().hashCode());
		return result;
	}

}