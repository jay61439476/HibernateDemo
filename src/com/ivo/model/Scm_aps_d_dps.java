package com.ivo.model;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Scm_aps_d_dps entity. @author MyEclipse Persistence Tools
 */

public class Scm_aps_d_dps implements java.io.Serializable {

	// Fields

	private String seq_id;
	private String seq_no;
	private String mps_ver_id_fk;
	private Date fab_data;
	private String dps_type;
	private String model_id;
	private String size_id;
	private String prod_id;
	private String unit;
	private Float qty;
	private String change_qty;
	private String remark;
	private Float act_qty;
	private String creat_user;
	private String update_user;
	private Timestamp creat_time;
	private Timestamp update_time;

	// Constructors

	/** default constructor */
	public Scm_aps_d_dps() {
	}

	/** minimal constructor */
	public Scm_aps_d_dps(String seq_id, String seq_no, String size_id,
			Timestamp creat_time, Timestamp update_time) {
		this.seq_id = seq_id;
		this.seq_no = seq_no;
		this.size_id = size_id;
		this.creat_time = creat_time;
		this.update_time = update_time;
	}

	/** full constructor */
	public Scm_aps_d_dps(String seq_id, String seq_no, String mps_ver_id_fk,
			Date fab_data, String dps_type, String model_id, String size_id,
			String prod_id, String unit, Float qty, String change_qty,
			String remark, Float act_qty, String creat_user,
			String update_user, Timestamp creat_time, Timestamp update_time) {
		this.seq_id = seq_id;
		this.seq_no = seq_no;
		this.mps_ver_id_fk = mps_ver_id_fk;
		this.fab_data = fab_data;
		this.dps_type = dps_type;
		this.model_id = model_id;
		this.size_id = size_id;
		this.prod_id = prod_id;
		this.unit = unit;
		this.qty = qty;
		this.change_qty = change_qty;
		this.remark = remark;
		this.act_qty = act_qty;
		this.creat_user = creat_user;
		this.update_user = update_user;
		this.creat_time = creat_time;
		this.update_time = update_time;
	}

	// Property accessors

	public String getSeq_id() {
		return this.seq_id;
	}

	public void setSeq_id(String seq_id) {
		this.seq_id = seq_id;
	}

	public String getSeq_no() {
		return this.seq_no;
	}

	public void setSeq_no(String seq_no) {
		this.seq_no = seq_no;
	}

	public String getMps_ver_id_fk() {
		return this.mps_ver_id_fk;
	}

	public void setMps_ver_id_fk(String mps_ver_id_fk) {
		this.mps_ver_id_fk = mps_ver_id_fk;
	}

	public Date getFab_data() {
		return this.fab_data;
	}

	public void setFab_data(Date fab_data) {
		this.fab_data = fab_data;
	}

	public String getDps_type() {
		return this.dps_type;
	}

	public void setDps_type(String dps_type) {
		this.dps_type = dps_type;
	}

	public String getModel_id() {
		return this.model_id;
	}

	public void setModel_id(String model_id) {
		this.model_id = model_id;
	}

	public String getSize_id() {
		return this.size_id;
	}

	public void setSize_id(String size_id) {
		this.size_id = size_id;
	}

	public String getProd_id() {
		return this.prod_id;
	}

	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Float getQty() {
		return this.qty;
	}

	public void setQty(Float qty) {
		this.qty = qty;
	}

	public String getChange_qty() {
		return this.change_qty;
	}

	public void setChange_qty(String change_qty) {
		this.change_qty = change_qty;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Float getAct_qty() {
		return this.act_qty;
	}

	public void setAct_qty(Float act_qty) {
		this.act_qty = act_qty;
	}

	public String getCreat_user() {
		return this.creat_user;
	}

	public void setCreat_user(String creat_user) {
		this.creat_user = creat_user;
	}

	public String getUpdate_user() {
		return this.update_user;
	}

	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}

	public Timestamp getCreat_time() {
		return this.creat_time;
	}

	public void setCreat_time(Timestamp creat_time) {
		this.creat_time = creat_time;
	}

	public Timestamp getUpdate_time() {
		return this.update_time;
	}

	public void setUpdate_time(Timestamp update_time) {
		this.update_time = update_time;
	}

}