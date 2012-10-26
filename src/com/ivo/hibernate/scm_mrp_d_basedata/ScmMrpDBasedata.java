package com.ivo.hibernate.scm_mrp_d_basedata;

import java.sql.Timestamp;

/**
 * ScmMrpDBasedata entity. @author MyEclipse Persistence Tools
 */

public class ScmMrpDBasedata implements java.io.Serializable {

	// Fields

	private Long ME_mrpBasedataNo;
	private Long ME_mrpBasedataId;
	private Long ME_mrpParamFk;
	private Long ME_batchQty;
	private Long ME_onhandQty;
	private Long ME_safestockQty;
	private String ME_mtrlId;
	private String ME_verId;
	private Integer ME_validFlag;
	private Timestamp ME_createTime;
	private Timestamp ME_updateTime;
	private String ME_createUser;
	private String ME_updateUser;
	private String ME_cpuTime;

	// Constructors

	/** default constructor */
	public ScmMrpDBasedata() {
	}

	/** full constructor */
	public ScmMrpDBasedata(Long ME_mrpBasedataId, Long ME_mrpParamFk,
			Long ME_batchQty, Long ME_onhandQty, Long ME_safestockQty,
			String ME_mtrlId, String ME_verId, Integer ME_validFlag,
			Timestamp ME_createTime, Timestamp ME_updateTime,
			String ME_createUser, String ME_updateUser, String ME_cpuTime) {
		this.ME_mrpBasedataId = ME_mrpBasedataId;
		this.ME_mrpParamFk = ME_mrpParamFk;
		this.ME_batchQty = ME_batchQty;
		this.ME_onhandQty = ME_onhandQty;
		this.ME_safestockQty = ME_safestockQty;
		this.ME_mtrlId = ME_mtrlId;
		this.ME_verId = ME_verId;
		this.ME_validFlag = ME_validFlag;
		this.ME_createTime = ME_createTime;
		this.ME_updateTime = ME_updateTime;
		this.ME_createUser = ME_createUser;
		this.ME_updateUser = ME_updateUser;
		this.ME_cpuTime = ME_cpuTime;
	}

	// Property accessors

	public Long getME_mrpBasedataNo() {
		return this.ME_mrpBasedataNo;
	}

	public void setME_mrpBasedataNo(Long ME_mrpBasedataNo) {
		this.ME_mrpBasedataNo = ME_mrpBasedataNo;
	}

	public Long getME_mrpBasedataId() {
		return this.ME_mrpBasedataId;
	}

	public void setME_mrpBasedataId(Long ME_mrpBasedataId) {
		this.ME_mrpBasedataId = ME_mrpBasedataId;
	}

	public Long getME_mrpParamFk() {
		return this.ME_mrpParamFk;
	}

	public void setME_mrpParamFk(Long ME_mrpParamFk) {
		this.ME_mrpParamFk = ME_mrpParamFk;
	}

	public Long getME_batchQty() {
		return this.ME_batchQty;
	}

	public void setME_batchQty(Long ME_batchQty) {
		this.ME_batchQty = ME_batchQty;
	}

	public Long getME_onhandQty() {
		return this.ME_onhandQty;
	}

	public void setME_onhandQty(Long ME_onhandQty) {
		this.ME_onhandQty = ME_onhandQty;
	}

	public Long getME_safestockQty() {
		return this.ME_safestockQty;
	}

	public void setME_safestockQty(Long ME_safestockQty) {
		this.ME_safestockQty = ME_safestockQty;
	}

	public String getME_mtrlId() {
		return this.ME_mtrlId;
	}

	public void setME_mtrlId(String ME_mtrlId) {
		this.ME_mtrlId = ME_mtrlId;
	}

	public String getME_verId() {
		return this.ME_verId;
	}

	public void setME_verId(String ME_verId) {
		this.ME_verId = ME_verId;
	}

	public Integer getME_validFlag() {
		return this.ME_validFlag;
	}

	public void setME_validFlag(Integer ME_validFlag) {
		this.ME_validFlag = ME_validFlag;
	}

	public Timestamp getME_createTime() {
		return this.ME_createTime;
	}

	public void setME_createTime(Timestamp ME_createTime) {
		this.ME_createTime = ME_createTime;
	}

	public Timestamp getME_updateTime() {
		return this.ME_updateTime;
	}

	public void setME_updateTime(Timestamp ME_updateTime) {
		this.ME_updateTime = ME_updateTime;
	}

	public String getME_createUser() {
		return this.ME_createUser;
	}

	public void setME_createUser(String ME_createUser) {
		this.ME_createUser = ME_createUser;
	}

	public String getME_updateUser() {
		return this.ME_updateUser;
	}

	public void setME_updateUser(String ME_updateUser) {
		this.ME_updateUser = ME_updateUser;
	}

	public String getME_cpuTime() {
		return this.ME_cpuTime;
	}

	public void setME_cpuTime(String ME_cpuTime) {
		this.ME_cpuTime = ME_cpuTime;
	}

}