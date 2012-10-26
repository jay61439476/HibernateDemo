package com.ivo.model;

/**
 * Scm_apsId entity. @author MyEclipse Persistence Tools
 */

public class Scm_apsId implements java.io.Serializable {

	// Fields

	private String data;
	private String week;

	// Constructors

	/** default constructor */
	public Scm_apsId() {
	}

	/** full constructor */
	public Scm_apsId(String data, String week) {
		this.data = data;
		this.week = week;
	}

	// Property accessors

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getWeek() {
		return this.week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Scm_apsId))
			return false;
		Scm_apsId castOther = (Scm_apsId) other;

		return ((this.getData() == castOther.getData()) || (this.getData() != null
				&& castOther.getData() != null && this.getData().equals(
				castOther.getData())))
				&& ((this.getWeek() == castOther.getWeek()) || (this.getWeek() != null
						&& castOther.getWeek() != null && this.getWeek()
						.equals(castOther.getWeek())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getData() == null ? 0 : this.getData().hashCode());
		result = 37 * result
				+ (getWeek() == null ? 0 : this.getWeek().hashCode());
		return result;
	}

}