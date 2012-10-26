package com.ivo.model;

/**
 * Scm_aps entity. @author MyEclipse Persistence Tools
 */

public class Scm_aps implements java.io.Serializable {

	// Fields

	private Scm_apsId id;
	private Integer total;
	private String seq_no;
	private String ary_in_mtrl_id;
	private String ary_out_mtrl_id;
	private String cel_in_mtrl_id;
	private String cel_out_mtrl_id;
	private String comment;

	// Constructors

	/** default constructor */
	public Scm_aps() {
	}

	/** full constructor */
	public Scm_aps(Scm_apsId id, Integer total, String seq_no,
			String ary_in_mtrl_id, String ary_out_mtrl_id,
			String cel_in_mtrl_id, String cel_out_mtrl_id, String comment) {
		this.id = id;
		this.total = total;
		this.seq_no = seq_no;
		this.ary_in_mtrl_id = ary_in_mtrl_id;
		this.ary_out_mtrl_id = ary_out_mtrl_id;
		this.cel_in_mtrl_id = cel_in_mtrl_id;
		this.cel_out_mtrl_id = cel_out_mtrl_id;
		this.comment = comment;
	}

	// Property accessors

	public Scm_apsId getId() {
		return this.id;
	}

	public void setId(Scm_apsId id) {
		this.id = id;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getSeq_no() {
		return this.seq_no;
	}

	public void setSeq_no(String seq_no) {
		this.seq_no = seq_no;
	}

	public String getAry_in_mtrl_id() {
		return this.ary_in_mtrl_id;
	}

	public void setAry_in_mtrl_id(String ary_in_mtrl_id) {
		this.ary_in_mtrl_id = ary_in_mtrl_id;
	}

	public String getAry_out_mtrl_id() {
		return this.ary_out_mtrl_id;
	}

	public void setAry_out_mtrl_id(String ary_out_mtrl_id) {
		this.ary_out_mtrl_id = ary_out_mtrl_id;
	}

	public String getCel_in_mtrl_id() {
		return this.cel_in_mtrl_id;
	}

	public void setCel_in_mtrl_id(String cel_in_mtrl_id) {
		this.cel_in_mtrl_id = cel_in_mtrl_id;
	}

	public String getCel_out_mtrl_id() {
		return this.cel_out_mtrl_id;
	}

	public void setCel_out_mtrl_id(String cel_out_mtrl_id) {
		this.cel_out_mtrl_id = cel_out_mtrl_id;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}