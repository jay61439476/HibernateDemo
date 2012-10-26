package com.ivo.hibernate.scm_aps;

/**
 * ScmAps entity. @author MyEclipse Persistence Tools
 */

public class ScmAps implements java.io.Serializable {

	// Fields

	private ScmApsId id;
	private Integer ME_total;
	private String ME_seqNo;
	private String ME_aryInMtrlId;
	private String ME_aryOutMtrlId;
	private String ME_celInMtrlId;
	private String ME_celOutMtrlId;
	private String ME_comment;

	// Constructors

	/** default constructor */
	public ScmAps() {
	}

	/** full constructor */
	public ScmAps(ScmApsId id, Integer ME_total, String ME_seqNo,
			String ME_aryInMtrlId, String ME_aryOutMtrlId,
			String ME_celInMtrlId, String ME_celOutMtrlId, String ME_comment) {
		this.id = id;
		this.ME_total = ME_total;
		this.ME_seqNo = ME_seqNo;
		this.ME_aryInMtrlId = ME_aryInMtrlId;
		this.ME_aryOutMtrlId = ME_aryOutMtrlId;
		this.ME_celInMtrlId = ME_celInMtrlId;
		this.ME_celOutMtrlId = ME_celOutMtrlId;
		this.ME_comment = ME_comment;
	}

	// Property accessors

	public ScmApsId getId() {
		return this.id;
	}

	public void setId(ScmApsId id) {
		this.id = id;
	}

	public Integer getME_total() {
		return this.ME_total;
	}

	public void setME_total(Integer ME_total) {
		this.ME_total = ME_total;
	}

	public String getME_seqNo() {
		return this.ME_seqNo;
	}

	public void setME_seqNo(String ME_seqNo) {
		this.ME_seqNo = ME_seqNo;
	}

	public String getME_aryInMtrlId() {
		return this.ME_aryInMtrlId;
	}

	public void setME_aryInMtrlId(String ME_aryInMtrlId) {
		this.ME_aryInMtrlId = ME_aryInMtrlId;
	}

	public String getME_aryOutMtrlId() {
		return this.ME_aryOutMtrlId;
	}

	public void setME_aryOutMtrlId(String ME_aryOutMtrlId) {
		this.ME_aryOutMtrlId = ME_aryOutMtrlId;
	}

	public String getME_celInMtrlId() {
		return this.ME_celInMtrlId;
	}

	public void setME_celInMtrlId(String ME_celInMtrlId) {
		this.ME_celInMtrlId = ME_celInMtrlId;
	}

	public String getME_celOutMtrlId() {
		return this.ME_celOutMtrlId;
	}

	public void setME_celOutMtrlId(String ME_celOutMtrlId) {
		this.ME_celOutMtrlId = ME_celOutMtrlId;
	}

	public String getME_comment() {
		return this.ME_comment;
	}

	public void setME_comment(String ME_comment) {
		this.ME_comment = ME_comment;
	}

}