package com.ivo.model;

import java.sql.Timestamp;

/**
 * Scm_mrp_d_mrpdetail entity. @author MyEclipse Persistence Tools
 */

public class Scm_mrp_d_mrpdetail implements java.io.Serializable {

	// Fields

	private Long mrp_detail_no;
	private Long mrp_detail_id;
	private Long mrp_param_fk;
	private Long mrp_basedata_fk;
	private Long mrp_date_fk;
	private Timestamp mrp_date;
	private String mtrl_id;
	private String ver_id;
	private Double gr_qty;
	private Double sr_qty;
	private Double poh_qty;
	private Double nr_qty;
	private Double porc_qty;
	private Double pab_qty;
	private Double por_qty;
	private Integer valid_flag;
	private Timestamp create_time;
	private Timestamp update_time;
	private String create_user;
	private String update_user;
	private String memo;
	private Timestamp cpu_time;

	// Constructors

	/** default constructor */
	public Scm_mrp_d_mrpdetail() {
	}

	/** minimal constructor */
	public Scm_mrp_d_mrpdetail(Timestamp create_time, Timestamp update_time) {
		this.create_time = create_time;
		this.update_time = update_time;
	}

	/** full constructor */
	public Scm_mrp_d_mrpdetail(Long mrp_detail_id, Long mrp_param_fk,
			Long mrp_basedata_fk, Long mrp_date_fk, Timestamp mrp_date,
			String mtrl_id, String ver_id, Double gr_qty, Double sr_qty,
			Double poh_qty, Double nr_qty, Double porc_qty, Double pab_qty,
			Double por_qty, Integer valid_flag, Timestamp create_time,
			Timestamp update_time, String create_user, String update_user,
			String memo, Timestamp cpu_time) {
		this.mrp_detail_id = mrp_detail_id;
		this.mrp_param_fk = mrp_param_fk;
		this.mrp_basedata_fk = mrp_basedata_fk;
		this.mrp_date_fk = mrp_date_fk;
		this.mrp_date = mrp_date;
		this.mtrl_id = mtrl_id;
		this.ver_id = ver_id;
		this.gr_qty = gr_qty;
		this.sr_qty = sr_qty;
		this.poh_qty = poh_qty;
		this.nr_qty = nr_qty;
		this.porc_qty = porc_qty;
		this.pab_qty = pab_qty;
		this.por_qty = por_qty;
		this.valid_flag = valid_flag;
		this.create_time = create_time;
		this.update_time = update_time;
		this.create_user = create_user;
		this.update_user = update_user;
		this.memo = memo;
		this.cpu_time = cpu_time;
	}

	// Property accessors

	public Long getMrp_detail_no() {
		return this.mrp_detail_no;
	}

	public void setMrp_detail_no(Long mrp_detail_no) {
		this.mrp_detail_no = mrp_detail_no;
	}

	public Long getMrp_detail_id() {
		return this.mrp_detail_id;
	}

	public void setMrp_detail_id(Long mrp_detail_id) {
		this.mrp_detail_id = mrp_detail_id;
	}

	public Long getMrp_param_fk() {
		return this.mrp_param_fk;
	}

	public void setMrp_param_fk(Long mrp_param_fk) {
		this.mrp_param_fk = mrp_param_fk;
	}

	public Long getMrp_basedata_fk() {
		return this.mrp_basedata_fk;
	}

	public void setMrp_basedata_fk(Long mrp_basedata_fk) {
		this.mrp_basedata_fk = mrp_basedata_fk;
	}

	public Long getMrp_date_fk() {
		return this.mrp_date_fk;
	}

	public void setMrp_date_fk(Long mrp_date_fk) {
		this.mrp_date_fk = mrp_date_fk;
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

	public Double getGr_qty() {
		return this.gr_qty;
	}

	public void setGr_qty(Double gr_qty) {
		this.gr_qty = gr_qty;
	}

	public Double getSr_qty() {
		return this.sr_qty;
	}

	public void setSr_qty(Double sr_qty) {
		this.sr_qty = sr_qty;
	}

	public Double getPoh_qty() {
		return this.poh_qty;
	}

	public void setPoh_qty(Double poh_qty) {
		this.poh_qty = poh_qty;
	}

	public Double getNr_qty() {
		return this.nr_qty;
	}

	public void setNr_qty(Double nr_qty) {
		this.nr_qty = nr_qty;
	}

	public Double getPorc_qty() {
		return this.porc_qty;
	}

	public void setPorc_qty(Double porc_qty) {
		this.porc_qty = porc_qty;
	}

	public Double getPab_qty() {
		return this.pab_qty;
	}

	public void setPab_qty(Double pab_qty) {
		this.pab_qty = pab_qty;
	}

	public Double getPor_qty() {
		return this.por_qty;
	}

	public void setPor_qty(Double por_qty) {
		this.por_qty = por_qty;
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

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Timestamp getCpu_time() {
		return this.cpu_time;
	}

	public void setCpu_time(Timestamp cpu_time) {
		this.cpu_time = cpu_time;
	}

}