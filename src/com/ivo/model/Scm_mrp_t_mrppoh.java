package com.ivo.model;

import java.sql.Timestamp;

/**
 * Scm_mrp_t_mrppoh entity. @author MyEclipse Persistence Tools
 */

public class Scm_mrp_t_mrppoh implements java.io.Serializable {

	// Fields

	private Long mrppoh_id;
	private Long mrpparam_fk;
	private Timestamp mrpdate;
	private String material_id;
	private String materialver;
	private Double qty;
	private Integer validflag;
	private Timestamp dateofcreate;
	private Timestamp dateofupdate;
	private String creator;
	private String updater;
	private String memo;

	// Constructors

	/** default constructor */
	public Scm_mrp_t_mrppoh() {
	}

	/** full constructor */
	public Scm_mrp_t_mrppoh(Long mrpparam_fk, Timestamp mrpdate,
			String material_id, String materialver, Double qty,
			Integer validflag, Timestamp dateofcreate, Timestamp dateofupdate,
			String creator, String updater, String memo) {
		this.mrpparam_fk = mrpparam_fk;
		this.mrpdate = mrpdate;
		this.material_id = material_id;
		this.materialver = materialver;
		this.qty = qty;
		this.validflag = validflag;
		this.dateofcreate = dateofcreate;
		this.dateofupdate = dateofupdate;
		this.creator = creator;
		this.updater = updater;
		this.memo = memo;
	}

	// Property accessors

	public Long getMrppoh_id() {
		return this.mrppoh_id;
	}

	public void setMrppoh_id(Long mrppoh_id) {
		this.mrppoh_id = mrppoh_id;
	}

	public Long getMrpparam_fk() {
		return this.mrpparam_fk;
	}

	public void setMrpparam_fk(Long mrpparam_fk) {
		this.mrpparam_fk = mrpparam_fk;
	}

	public Timestamp getMrpdate() {
		return this.mrpdate;
	}

	public void setMrpdate(Timestamp mrpdate) {
		this.mrpdate = mrpdate;
	}

	public String getMaterial_id() {
		return this.material_id;
	}

	public void setMaterial_id(String material_id) {
		this.material_id = material_id;
	}

	public String getMaterialver() {
		return this.materialver;
	}

	public void setMaterialver(String materialver) {
		this.materialver = materialver;
	}

	public Double getQty() {
		return this.qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Integer getValidflag() {
		return this.validflag;
	}

	public void setValidflag(Integer validflag) {
		this.validflag = validflag;
	}

	public Timestamp getDateofcreate() {
		return this.dateofcreate;
	}

	public void setDateofcreate(Timestamp dateofcreate) {
		this.dateofcreate = dateofcreate;
	}

	public Timestamp getDateofupdate() {
		return this.dateofupdate;
	}

	public void setDateofupdate(Timestamp dateofupdate) {
		this.dateofupdate = dateofupdate;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getUpdater() {
		return this.updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}