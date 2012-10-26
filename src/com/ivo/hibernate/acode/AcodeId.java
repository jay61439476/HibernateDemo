package com.ivo.hibernate.acode;

/**
 * AcodeId entity. @author MyEclipse Persistence Tools
 */

public class AcodeId implements java.io.Serializable {

	// Fields

	private String code_cate;
	private String code;
	private String code_ext;

	// Constructors

	/** default constructor */
	public AcodeId() {
	}

	/** full constructor */
	public AcodeId(String code_cate, String code, String code_ext) {
		this.code_cate = code_cate;
		this.code = code;
		this.code_ext = code_ext;
	}

	// Property accessors

	public String getCode_cate() {
		return this.code_cate;
	}

	public void setCode_cate(String code_cate) {
		this.code_cate = code_cate;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode_ext() {
		return this.code_ext;
	}

	public void setCode_ext(String code_ext) {
		this.code_ext = code_ext;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AcodeId))
			return false;
		AcodeId castOther = (AcodeId) other;

		return ((this.getCode_cate() == castOther.getCode_cate()) || (this
				.getCode_cate() != null && castOther.getCode_cate() != null && this
				.getCode_cate().equals(castOther.getCode_cate())))
				&& ((this.getCode() == castOther.getCode()) || (this.getCode() != null
						&& castOther.getCode() != null && this.getCode()
						.equals(castOther.getCode())))
				&& ((this.getCode_ext() == castOther.getCode_ext()) || (this
						.getCode_ext() != null
						&& castOther.getCode_ext() != null && this
						.getCode_ext().equals(castOther.getCode_ext())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCode_cate() == null ? 0 : this.getCode_cate().hashCode());
		result = 37 * result
				+ (getCode() == null ? 0 : this.getCode().hashCode());
		result = 37 * result
				+ (getCode_ext() == null ? 0 : this.getCode_ext().hashCode());
		return result;
	}

}