package com.ivo.model;

import java.sql.Timestamp;

/**
 * Scm_mrp_m_mrpparam entity. @author MyEclipse Persistence Tools
 */

public class Scm_mrp_m_mrpparam implements java.io.Serializable {

	// Fields

	private Integer mrp_param_id;
	private String mrp_param_no;
	private Long msp_fk;
	private Long dps_fk;
	private String mrp_ver;
	private String fab_id;
	private Timestamp from_date;
	private Timestamp to_date;
	private Timestamp mrp_date;
	private String mrptype;
	private Timestamp mrpruntime;
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
	public Scm_mrp_m_mrpparam() {
	}

	/** full constructor */
	public Scm_mrp_m_mrpparam(String mrp_param_no, Long msp_fk, Long dps_fk,
			String mrp_ver, String fab_id, Timestamp from_date,
			Timestamp to_date, Timestamp mrp_date, String mrptype,
			Timestamp mrpruntime, String mtrl_id, String ver_id,
			Integer valid_flag, Timestamp create_time, Timestamp update_time,
			String create_user, String update_user, String cpu_time) {
		this.mrp_param_no = mrp_param_no;
		this.msp_fk = msp_fk;
		this.dps_fk = dps_fk;
		this.mrp_ver = mrp_ver;
		this.fab_id = fab_id;
		this.from_date = from_date;
		this.to_date = to_date;
		this.mrp_date = mrp_date;
		this.mrptype = mrptype;
		this.mrpruntime = mrpruntime;
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

	public Integer getMrp_param_id() {
		return this.mrp_param_id;
	}

	public void setMrp_param_id(Integer mrp_param_id) {
		this.mrp_param_id = mrp_param_id;
	}

	public String getMrp_param_no() {
		return this.mrp_param_no;
	}

	public void setMrp_param_no(String mrp_param_no) {
		this.mrp_param_no = mrp_param_no;
	}

	public Long getMsp_fk() {
		return this.msp_fk;
	}

	public void setMsp_fk(Long msp_fk) {
		this.msp_fk = msp_fk;
	}

	public Long getDps_fk() {
		return this.dps_fk;
	}

	public void setDps_fk(Long dps_fk) {
		this.dps_fk = dps_fk;
	}

	public String getMrp_ver() {
		return this.mrp_ver;
	}

	public void setMrp_ver(String mrp_ver) {
		this.mrp_ver = mrp_ver;
	}

	public String getFab_id() {
		return this.fab_id;
	}

	public void setFab_id(String fab_id) {
		this.fab_id = fab_id;
	}

	public Timestamp getFrom_date() {
		return this.from_date;
	}

	public void setFrom_date(Timestamp from_date) {
		this.from_date = from_date;
	}

	public Timestamp getTo_date() {
		return this.to_date;
	}

	public void setTo_date(Timestamp to_date) {
		this.to_date = to_date;
	}

	public Timestamp getMrp_date() {
		return this.mrp_date;
	}

	public void setMrp_date(Timestamp mrp_date) {
		this.mrp_date = mrp_date;
	}

	public String getMrptype() {
		return this.mrptype;
	}

	public void setMrptype(String mrptype) {
		this.mrptype = mrptype;
	}

	public Timestamp getMrpruntime() {
		return this.mrpruntime;
	}

	public void setMrpruntime(Timestamp mrpruntime) {
		this.mrpruntime = mrpruntime;
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