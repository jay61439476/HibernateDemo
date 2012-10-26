package com.ivo.model;

import java.sql.Timestamp;

/**
 * Fcst_aps_d_mpsId entity. @author MyEclipse Persistence Tools
 */

public class Fcst_aps_d_mpsId implements java.io.Serializable {

	// Fields

	private String seq_no;
	private Integer seq_id;
	private String fcst_ver_id_fk;
	private String mon;
	private String prod_id;
	private String ver_id;
	private String model_id;
	private String size_id;
	private String grade;
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
	public Fcst_aps_d_mpsId() {
	}

	/** minimal constructor */
	public Fcst_aps_d_mpsId(String seq_no, Integer seq_id,
			Timestamp create_time, Timestamp update_time) {
		this.seq_no = seq_no;
		this.seq_id = seq_id;
		this.create_time = create_time;
		this.update_time = update_time;
	}

	/** full constructor */
	public Fcst_aps_d_mpsId(String seq_no, Integer seq_id,
			String fcst_ver_id_fk, String mon, String prod_id, String ver_id,
			String model_id, String size_id, String grade,
			Float sales_plan_qty, Float lcm_input, Float lcm_output,
			Float lcm_1_input, Float lcm_2_input, Float lcm_1_output,
			Float lcm_2_output, Float inventory, Float act_inventory,
			Float fcst_qty, Float change_qty, String remark,
			String create_user, String update_user, Timestamp create_time,
			Timestamp update_time) {
		this.seq_no = seq_no;
		this.seq_id = seq_id;
		this.fcst_ver_id_fk = fcst_ver_id_fk;
		this.mon = mon;
		this.prod_id = prod_id;
		this.ver_id = ver_id;
		this.model_id = model_id;
		this.size_id = size_id;
		this.grade = grade;
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

	public String getFcst_ver_id_fk() {
		return this.fcst_ver_id_fk;
	}

	public void setFcst_ver_id_fk(String fcst_ver_id_fk) {
		this.fcst_ver_id_fk = fcst_ver_id_fk;
	}

	public String getMon() {
		return this.mon;
	}

	public void setMon(String mon) {
		this.mon = mon;
	}

	public String getProd_id() {
		return this.prod_id;
	}

	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
	}

	public String getVer_id() {
		return this.ver_id;
	}

	public void setVer_id(String ver_id) {
		this.ver_id = ver_id;
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

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Fcst_aps_d_mpsId))
			return false;
		Fcst_aps_d_mpsId castOther = (Fcst_aps_d_mpsId) other;

		return ((this.getSeq_no() == castOther.getSeq_no()) || (this
				.getSeq_no() != null && castOther.getSeq_no() != null && this
				.getSeq_no().equals(castOther.getSeq_no())))
				&& ((this.getSeq_id() == castOther.getSeq_id()) || (this
						.getSeq_id() != null && castOther.getSeq_id() != null && this
						.getSeq_id().equals(castOther.getSeq_id())))
				&& ((this.getFcst_ver_id_fk() == castOther.getFcst_ver_id_fk()) || (this
						.getFcst_ver_id_fk() != null
						&& castOther.getFcst_ver_id_fk() != null && this
						.getFcst_ver_id_fk().equals(
								castOther.getFcst_ver_id_fk())))
				&& ((this.getMon() == castOther.getMon()) || (this.getMon() != null
						&& castOther.getMon() != null && this.getMon().equals(
						castOther.getMon())))
				&& ((this.getProd_id() == castOther.getProd_id()) || (this
						.getProd_id() != null && castOther.getProd_id() != null && this
						.getProd_id().equals(castOther.getProd_id())))
				&& ((this.getVer_id() == castOther.getVer_id()) || (this
						.getVer_id() != null && castOther.getVer_id() != null && this
						.getVer_id().equals(castOther.getVer_id())))
				&& ((this.getModel_id() == castOther.getModel_id()) || (this
						.getModel_id() != null
						&& castOther.getModel_id() != null && this
						.getModel_id().equals(castOther.getModel_id())))
				&& ((this.getSize_id() == castOther.getSize_id()) || (this
						.getSize_id() != null && castOther.getSize_id() != null && this
						.getSize_id().equals(castOther.getSize_id())))
				&& ((this.getGrade() == castOther.getGrade()) || (this
						.getGrade() != null && castOther.getGrade() != null && this
						.getGrade().equals(castOther.getGrade())))
				&& ((this.getSales_plan_qty() == castOther.getSales_plan_qty()) || (this
						.getSales_plan_qty() != null
						&& castOther.getSales_plan_qty() != null && this
						.getSales_plan_qty().equals(
								castOther.getSales_plan_qty())))
				&& ((this.getLcm_input() == castOther.getLcm_input()) || (this
						.getLcm_input() != null
						&& castOther.getLcm_input() != null && this
						.getLcm_input().equals(castOther.getLcm_input())))
				&& ((this.getLcm_output() == castOther.getLcm_output()) || (this
						.getLcm_output() != null
						&& castOther.getLcm_output() != null && this
						.getLcm_output().equals(castOther.getLcm_output())))
				&& ((this.getLcm_1_input() == castOther.getLcm_1_input()) || (this
						.getLcm_1_input() != null
						&& castOther.getLcm_1_input() != null && this
						.getLcm_1_input().equals(castOther.getLcm_1_input())))
				&& ((this.getLcm_2_input() == castOther.getLcm_2_input()) || (this
						.getLcm_2_input() != null
						&& castOther.getLcm_2_input() != null && this
						.getLcm_2_input().equals(castOther.getLcm_2_input())))
				&& ((this.getLcm_1_output() == castOther.getLcm_1_output()) || (this
						.getLcm_1_output() != null
						&& castOther.getLcm_1_output() != null && this
						.getLcm_1_output().equals(castOther.getLcm_1_output())))
				&& ((this.getLcm_2_output() == castOther.getLcm_2_output()) || (this
						.getLcm_2_output() != null
						&& castOther.getLcm_2_output() != null && this
						.getLcm_2_output().equals(castOther.getLcm_2_output())))
				&& ((this.getInventory() == castOther.getInventory()) || (this
						.getInventory() != null
						&& castOther.getInventory() != null && this
						.getInventory().equals(castOther.getInventory())))
				&& ((this.getAct_inventory() == castOther.getAct_inventory()) || (this
						.getAct_inventory() != null
						&& castOther.getAct_inventory() != null && this
						.getAct_inventory()
						.equals(castOther.getAct_inventory())))
				&& ((this.getFcst_qty() == castOther.getFcst_qty()) || (this
						.getFcst_qty() != null
						&& castOther.getFcst_qty() != null && this
						.getFcst_qty().equals(castOther.getFcst_qty())))
				&& ((this.getChange_qty() == castOther.getChange_qty()) || (this
						.getChange_qty() != null
						&& castOther.getChange_qty() != null && this
						.getChange_qty().equals(castOther.getChange_qty())))
				&& ((this.getRemark() == castOther.getRemark()) || (this
						.getRemark() != null && castOther.getRemark() != null && this
						.getRemark().equals(castOther.getRemark())))
				&& ((this.getCreate_user() == castOther.getCreate_user()) || (this
						.getCreate_user() != null
						&& castOther.getCreate_user() != null && this
						.getCreate_user().equals(castOther.getCreate_user())))
				&& ((this.getUpdate_user() == castOther.getUpdate_user()) || (this
						.getUpdate_user() != null
						&& castOther.getUpdate_user() != null && this
						.getUpdate_user().equals(castOther.getUpdate_user())))
				&& ((this.getCreate_time() == castOther.getCreate_time()) || (this
						.getCreate_time() != null
						&& castOther.getCreate_time() != null && this
						.getCreate_time().equals(castOther.getCreate_time())))
				&& ((this.getUpdate_time() == castOther.getUpdate_time()) || (this
						.getUpdate_time() != null
						&& castOther.getUpdate_time() != null && this
						.getUpdate_time().equals(castOther.getUpdate_time())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSeq_no() == null ? 0 : this.getSeq_no().hashCode());
		result = 37 * result
				+ (getSeq_id() == null ? 0 : this.getSeq_id().hashCode());
		result = 37
				* result
				+ (getFcst_ver_id_fk() == null ? 0 : this.getFcst_ver_id_fk()
						.hashCode());
		result = 37 * result
				+ (getMon() == null ? 0 : this.getMon().hashCode());
		result = 37 * result
				+ (getProd_id() == null ? 0 : this.getProd_id().hashCode());
		result = 37 * result
				+ (getVer_id() == null ? 0 : this.getVer_id().hashCode());
		result = 37 * result
				+ (getModel_id() == null ? 0 : this.getModel_id().hashCode());
		result = 37 * result
				+ (getSize_id() == null ? 0 : this.getSize_id().hashCode());
		result = 37 * result
				+ (getGrade() == null ? 0 : this.getGrade().hashCode());
		result = 37
				* result
				+ (getSales_plan_qty() == null ? 0 : this.getSales_plan_qty()
						.hashCode());
		result = 37 * result
				+ (getLcm_input() == null ? 0 : this.getLcm_input().hashCode());
		result = 37
				* result
				+ (getLcm_output() == null ? 0 : this.getLcm_output()
						.hashCode());
		result = 37
				* result
				+ (getLcm_1_input() == null ? 0 : this.getLcm_1_input()
						.hashCode());
		result = 37
				* result
				+ (getLcm_2_input() == null ? 0 : this.getLcm_2_input()
						.hashCode());
		result = 37
				* result
				+ (getLcm_1_output() == null ? 0 : this.getLcm_1_output()
						.hashCode());
		result = 37
				* result
				+ (getLcm_2_output() == null ? 0 : this.getLcm_2_output()
						.hashCode());
		result = 37 * result
				+ (getInventory() == null ? 0 : this.getInventory().hashCode());
		result = 37
				* result
				+ (getAct_inventory() == null ? 0 : this.getAct_inventory()
						.hashCode());
		result = 37 * result
				+ (getFcst_qty() == null ? 0 : this.getFcst_qty().hashCode());
		result = 37
				* result
				+ (getChange_qty() == null ? 0 : this.getChange_qty()
						.hashCode());
		result = 37 * result
				+ (getRemark() == null ? 0 : this.getRemark().hashCode());
		result = 37
				* result
				+ (getCreate_user() == null ? 0 : this.getCreate_user()
						.hashCode());
		result = 37
				* result
				+ (getUpdate_user() == null ? 0 : this.getUpdate_user()
						.hashCode());
		result = 37
				* result
				+ (getCreate_time() == null ? 0 : this.getCreate_time()
						.hashCode());
		result = 37
				* result
				+ (getUpdate_time() == null ? 0 : this.getUpdate_time()
						.hashCode());
		return result;
	}

}