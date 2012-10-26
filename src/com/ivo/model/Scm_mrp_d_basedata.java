package com.ivo.model;

import java.sql.Timestamp;

/**
 * Scm_mrp_d_basedata entity. @author MyEclipse Persistence Tools
 */

public class Scm_mrp_d_basedata implements java.io.Serializable {

	// Fields

	private Long mrp_basedata_no;
	private Long mrp_basedata_id;
	private Long mrp_param_fk;
	private Long batch_qty;
	private Long onhand_qty;
	private Long safestock_qty;
	private String mtrl_id;
	private String ver_id;
	private Integer valid_flag;
	private Timestamp create_time;
	private Timestamp update_time;
	private String create_user;
	private String update_user;
	private String cpu_time;

	// Constructors

	/** default constructor */
	public Scm_mrp_d_basedata() {
	}

	/** full constructor */
	public Scm_mrp_d_basedata(Long mrp_basedata_id, Long mrp_param_fk,
			Long batch_qty, Long onhand_qty, Long safestock_qty,
			String mtrl_id, String ver_id, Integer valid_flag,
			Timestamp create_time, Timestamp update_time, String create_user,
			String update_user, String cpu_time) {
		this.mrp_basedata_id = mrp_basedata_id;
		this.mrp_param_fk = mrp_param_fk;
		this.batch_qty = batch_qty;
		this.onhand_qty = onhand_qty;
		this.safestock_qty = safestock_qty;
		this.mtrl_id = mtrl_id;
		this.ver_id = ver_id;
		this.valid_flag = valid_flag;
		this.create_time = create_time;
		this.update_time = update_time;
		this.create_user = create_user;
		this.update_user = update_user;
		this.cpu_time = cpu_time;
	}

	// Property accessors

	public Long getMrp_basedata_no() {
		return this.mrp_basedata_no;
	}

	public void setMrp_basedata_no(Long mrp_basedata_no) {
		this.mrp_basedata_no = mrp_basedata_no;
	}

	public Long getMrp_basedata_id() {
		return this.mrp_basedata_id;
	}

	public void setMrp_basedata_id(Long mrp_basedata_id) {
		this.mrp_basedata_id = mrp_basedata_id;
	}

	public Long getMrp_param_fk() {
		return this.mrp_param_fk;
	}

	public void setMrp_param_fk(Long mrp_param_fk) {
		this.mrp_param_fk = mrp_param_fk;
	}

	public Long getBatch_qty() {
		return this.batch_qty;
	}

	public void setBatch_qty(Long batch_qty) {
		this.batch_qty = batch_qty;
	}

	public Long getOnhand_qty() {
		return this.onhand_qty;
	}

	public void setOnhand_qty(Long onhand_qty) {
		this.onhand_qty = onhand_qty;
	}

	public Long getSafestock_qty() {
		return this.safestock_qty;
	}

	public void setSafestock_qty(Long safestock_qty) {
		this.safestock_qty = safestock_qty;
	}

	public String getMtrl_id() {
		return this.mtrl_id;
	}

	public void setMtrl_id(String mtrl_id) {
		this.mtrl_id = mtrl_id;
	}

	public String getVer_id() {
		return this.ver_id;
	}

	public void setVer_id(String ver_id) {
		this.ver_id = ver_id;
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