package com.ivo.model;

import java.sql.Timestamp;

/**
 * Scm_mrp_d_gritem entity. @author MyEclipse Persistence Tools
 */

public class Scm_mrp_d_gritem implements java.io.Serializable {

	// Fields

	private Long gritem_no;
	private Long gritem_id;
	private Long mrp_param_fk;
	private Timestamp mrp_date;
	private String mtrl_id;
	private String ver_id;
	private String item_id;
	private String alt_itemgroup;
	private Double qty;
	private Integer valid_flag;
	private Timestamp create_time;
	private Timestamp update_time;
	private String create_user;
	private String update_user;
	private Timestamp cpu_time;
	private String memo;

	// Constructors

	/** default constructor */
	public Scm_mrp_d_gritem() {
	}

	/** full constructor */
	public Scm_mrp_d_gritem(Long gritem_id, Long mrp_param_fk,
			Timestamp mrp_date, String mtrl_id, String ver_id, String item_id,
			String alt_itemgroup, Double qty, Integer valid_flag,
			Timestamp create_time, Timestamp update_time, String create_user,
			String update_user, Timestamp cpu_time, String memo) {
		this.gritem_id = gritem_id;
		this.mrp_param_fk = mrp_param_fk;
		this.mrp_date = mrp_date;
		this.mtrl_id = mtrl_id;
		this.ver_id = ver_id;
		this.item_id = item_id;
		this.alt_itemgroup = alt_itemgroup;
		this.qty = qty;
		this.valid_flag = valid_flag;
		this.create_time = create_time;
		this.update_time = update_time;
		this.create_user = create_user;
		this.update_user = update_user;
		this.cpu_time = cpu_time;
		this.memo = memo;
	}

	// Property accessors

	public Long getGritem_no() {
		return this.gritem_no;
	}

	public void setGritem_no(Long gritem_no) {
		this.gritem_no = gritem_no;
	}

	public Long getGritem_id() {
		return this.gritem_id;
	}

	public void setGritem_id(Long gritem_id) {
		this.gritem_id = gritem_id;
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

	public String getItem_id() {
		return this.item_id;
	}

	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}

	public String getAlt_itemgroup() {
		return this.alt_itemgroup;
	}

	public void setAlt_itemgroup(String alt_itemgroup) {
		this.alt_itemgroup = alt_itemgroup;
	}

	public Double getQty() {
		return this.qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
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

	public Timestamp getCpu_time() {
		return this.cpu_time;
	}

	public void setCpu_time(Timestamp cpu_time) {
		this.cpu_time = cpu_time;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}