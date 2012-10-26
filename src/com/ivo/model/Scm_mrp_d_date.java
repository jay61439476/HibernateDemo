package com.ivo.model;

import java.sql.Timestamp;

/**
 * Scm_mrp_d_date entity. @author MyEclipse Persistence Tools
 */

public class Scm_mrp_d_date implements java.io.Serializable {

	// Fields

	private Long mrp_date_no;
	private Long mrp_date_id;
	private Long mrp_param_fk;
	private Timestamp mrp_date;
	private Integer valid_flag;
	private Timestamp create_time;
	private Timestamp update_time;
	private String create_user;
	private String update_user;
	private String cpu_time;

	// Constructors

	/** default constructor */
	public Scm_mrp_d_date() {
	}

	/** full constructor */
	public Scm_mrp_d_date(Long mrp_date_id, Long mrp_param_fk,
			Timestamp mrp_date, Integer valid_flag, Timestamp create_time,
			Timestamp update_time, String create_user, String update_user,
			String cpu_time) {
		this.mrp_date_id = mrp_date_id;
		this.mrp_param_fk = mrp_param_fk;
		this.mrp_date = mrp_date;
		this.valid_flag = valid_flag;
		this.create_time = create_time;
		this.update_time = update_time;
		this.create_user = create_user;
		this.update_user = update_user;
		this.cpu_time = cpu_time;
	}

	// Property accessors

	public Long getMrp_date_no() {
		return this.mrp_date_no;
	}

	public void setMrp_date_no(Long mrp_date_no) {
		this.mrp_date_no = mrp_date_no;
	}

	public Long getMrp_date_id() {
		return this.mrp_date_id;
	}

	public void setMrp_date_id(Long mrp_date_id) {
		this.mrp_date_id = mrp_date_id;
	}

	public Long getMrp_param_fk() {
		return this.mrp_param_fk;
	}

	public void setMrp_param_fk(Long mrp_param_fk) {
		this.mrp_param_fk = mrp_param_fk;
	}

	public Timestamp getMrp_date() {
		return this.mrp_date;
	}

	public void setMrp_date(Timestamp mrp_date) {
		this.mrp_date = mrp_date;
	}

	public Integer getValid_flag() {
		return this.valid_flag;
	}

	public void setValid_flag(Integer valid_flag) {
		this.valid_flag = valid_flag;
	}

	public Timestamp getCreate_time() {
		return this.create_time;
	}

	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}

	public Timestamp getUpdate_time() {
		return this.update_time;
	}

	public void setUpdate_time(Timestamp update_time) {
		this.update_time = update_time;
	}

	public String getCreate_user() {
		return this.create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public String getUpdate_user() {
		return this.update_user;
	}

	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}

	public String getCpu_time() {
		return this.cpu_time;
	}

	public void setCpu_time(String cpu_time) {
		this.cpu_time = cpu_time;
	}

}