package com.ivo.model;

import java.sql.Timestamp;

/**
 * Scm_aps_d_mps entity. @author MyEclipse Persistence Tools
 */

public class Scm_aps_d_mps implements java.io.Serializable {

	// Fields

	private Scm_aps_d_mpsId id;
	private String seq_no;
	private Integer seq_id;
	private String model_id;
	private String size_id;
	private Float sales_plan_qty;
	private Float lcm_input;
	private Float lcm_output;
	private Float lcm_1_input;
	private Float lcm_2_input;
	private Float lcm_1_output;
	private Float lcm_2_output;
	private Float inventory;
	private Float act_inventory;
	private Float fcst_qty;
	private Float change_qty;
	private String remark;
	private String create_user;
	private String update_user;
	private Timestamp create_time;
	private Timestamp update_time;

	// Constructors

	/** default constructor */
	public Scm_aps_d_mps() {
	}

	/** minimal constructor */
	public Scm_aps_d_mps(Scm_aps_d_mpsId id, String seq_no, Integer seq_id,
			String model_id, String size_id, Timestamp create_time,
			Timestamp update_time) {
		this.id = id;
		this.seq_no = seq_no;
		this.seq_id = seq_id;
		this.model_id = model_id;
		this.size_id = size_id;
		this.create_time = create_time;
		this.update_time = update_time;
	}

	/** full constructor */
	public Scm_aps_d_mps(Scm_aps_d_mpsId id, String seq_no, Integer seq_id,
			String model_id, String size_id, Float sales_plan_qty,
			Float lcm_input, Float lcm_output, Float lcm_1_input,
			Float lcm_2_input, Float lcm_1_output, Float lcm_2_output,
			Float inventory, Float act_inventory, Float fcst_qty,
			Float change_qty, String remark, String create_user,
			String update_user, Timestamp create_time, Timestamp update_time) {
		this.id = id;
		this.seq_no = seq_no;
		this.seq_id = seq_id;
		this.model_id = model_id;
		this.size_id = size_id;
		this.sales_plan_qty = sales_plan_qty;
		this.lcm_input = lcm_input;
		this.lcm_output = lcm_output;
		this.lcm_1_input = lcm_1_input;
		this.lcm_2_input = lcm_2_input;
		this.lcm_1_output = lcm_1_output;
		this.lcm_2_output = lcm_2_output;
		this.inventory = inventory;
		this.act_inventory = act_inventory;
		this.fcst_qty = fcst_qty;
		this.change_qty = change_qty;
		this.remark = remark;
		this.create_user = create_user;
		this.update_user = update_user;
		this.create_time = create_time;
		this.update_time = update_time;
	}

	// Property accessors

	public Scm_aps_d_mpsId getId() {
		return this.id;
	}

	public void setId(Scm_aps_d_mpsId id) {
		this.id = id;
	}

	public String getSeq_no() {
		return this.seq_no;
	}

	public void setSeq_no(String seq_no) {
		this.seq_no = seq_no;
	}

	public Integer getSeq_id() {
		return this.seq_id;
	}

	public void setSeq_id(Integer seq_id) {
		this.seq_id = seq_id;
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

	public Float getSales_plan_qty() {
		return this.sales_plan_qty;
	}

	public void setSales_plan_qty(Float sales_plan_qty) {
		this.sales_plan_qty = sales_plan_qty;
	}

	public Float getLcm_input() {
		return this.lcm_input;
	}

	public void setLcm_input(Float lcm_input) {
		this.lcm_input = lcm_input;
	}

	public Float getLcm_output() {
		return this.lcm_output;
	}

	public void setLcm_output(Float lcm_output) {
		this.lcm_output = lcm_output;
	}

	public Float getLcm_1_input() {
		return this.lcm_1_input;
	}

	public void setLcm_1_input(Float lcm_1_input) {
		this.lcm_1_input = lcm_1_input;
	}

	public Float getLcm_2_input() {
		return this.lcm_2_input;
	}

	public void setLcm_2_input(Float lcm_2_input) {
		this.lcm_2_input = lcm_2_input;
	}

	public Float getLcm_1_output() {
		return this.lcm_1_output;
	}

	public void setLcm_1_output(Float lcm_1_output) {
		this.lcm_1_output = lcm_1_output;
	}

	public Float getLcm_2_output() {
		return this.lcm_2_output;
	}

	public void setLcm_2_output(Float lcm_2_output) {
		this.lcm_2_output = lcm_2_output;
	}

	public Float getInventory() {
		return this.inventory;
	}

	public void setInventory(Float inventory) {
		this.inventory = inventory;
	}

	public Float getAct_inventory() {
		return this.act_inventory;
	}

	public void setAct_inventory(Float act_inventory) {
		this.act_inventory = act_inventory;
	}

	public Float getFcst_qty() {
		return this.fcst_qty;
	}

	public void setFcst_qty(Float fcst_qty) {
		this.fcst_qty = fcst_qty;
	}

	public Float getChange_qty() {
		return this.change_qty;
	}

	public void setChange_qty(Float change_qty) {
		this.change_qty = change_qty;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

}