package com.ivo.hibernate.scm_aps_d_mps;

import java.sql.Timestamp;

/**
 * AbstractScmApsDMps entity provides the base persistence definition of the
 * ScmApsDMps entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractScmApsDMps implements java.io.Serializable {

	// Fields

	private ScmApsDMpsId id;
	private String seqNo;
	private Integer seqId;
	private String sizeId;
	private Float salesPlanQty;
	private Float lcmInput;
	private Float lcmOutput;
	private Float lcm1Input;
	private Float lcm2Input;
	private Float lcm1Output;
	private Float lcm2Output;
	private Float inventory;
	private Float actInventory;
	private Float fcstQty;
	private Float changeQty;
	private String remark;
	private String createUser;
	private String updateUser;
	private Timestamp createTime;
	private Timestamp updateTime;

	// Constructors

	/** default constructor */
	public AbstractScmApsDMps() {
	}

	/** minimal constructor */
	public AbstractScmApsDMps(ScmApsDMpsId id, String seqNo, Integer seqId,
			String sizeId, Timestamp createTime, Timestamp updateTime) {
		this.id = id;
		this.seqNo = seqNo;
		this.seqId = seqId;
		this.sizeId = sizeId;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	/** full constructor */
	public AbstractScmApsDMps(ScmApsDMpsId id, String seqNo, Integer seqId,
			String sizeId, Float salesPlanQty, Float lcmInput, Float lcmOutput,
			Float lcm1Input, Float lcm2Input, Float lcm1Output,
			Float lcm2Output, Float inventory, Float actInventory,
			Float fcstQty, Float changeQty, String remark, String createUser,
			String updateUser, Timestamp createTime, Timestamp updateTime) {
		this.id = id;
		this.seqNo = seqNo;
		this.seqId = seqId;
		this.sizeId = sizeId;
		this.salesPlanQty = salesPlanQty;
		this.lcmInput = lcmInput;
		this.lcmOutput = lcmOutput;
		this.lcm1Input = lcm1Input;
		this.lcm2Input = lcm2Input;
		this.lcm1Output = lcm1Output;
		this.lcm2Output = lcm2Output;
		this.inventory = inventory;
		this.actInventory = actInventory;
		this.fcstQty = fcstQty;
		this.changeQty = changeQty;
		this.remark = remark;
		this.createUser = createUser;
		this.updateUser = updateUser;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	// Property accessors

	public ScmApsDMpsId getId() {
		return this.id;
	}

	public void setId(ScmApsDMpsId id) {
		this.id = id;
	}

	public String getSeqNo() {
		return this.seqNo;
	}

	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}

	public Integer getSeqId() {
		return this.seqId;
	}

	public void setSeqId(Integer seqId) {
		this.seqId = seqId;
	}

	public String getSizeId() {
		return this.sizeId;
	}

	public void setSizeId(String sizeId) {
		this.sizeId = sizeId;
	}

	public Float getSalesPlanQty() {
		return this.salesPlanQty;
	}

	public void setSalesPlanQty(Float salesPlanQty) {
		this.salesPlanQty = salesPlanQty;
	}

	public Float getLcmInput() {
		return this.lcmInput;
	}

	public void setLcmInput(Float lcmInput) {
		this.lcmInput = lcmInput;
	}

	public Float getLcmOutput() {
		return this.lcmOutput;
	}

	public void setLcmOutput(Float lcmOutput) {
		this.lcmOutput = lcmOutput;
	}

	public Float getLcm1Input() {
		return this.lcm1Input;
	}

	public void setLcm1Input(Float lcm1Input) {
		this.lcm1Input = lcm1Input;
	}

	public Float getLcm2Input() {
		return this.lcm2Input;
	}

	public void setLcm2Input(Float lcm2Input) {
		this.lcm2Input = lcm2Input;
	}

	public Float getLcm1Output() {
		return this.lcm1Output;
	}

	public void setLcm1Output(Float lcm1Output) {
		this.lcm1Output = lcm1Output;
	}

	public Float getLcm2Output() {
		return this.lcm2Output;
	}

	public void setLcm2Output(Float lcm2Output) {
		this.lcm2Output = lcm2Output;
	}

	public Float getInventory() {
		return this.inventory;
	}

	public void setInventory(Float inventory) {
		this.inventory = inventory;
	}

	public Float getActInventory() {
		return this.actInventory;
	}

	public void setActInventory(Float actInventory) {
		this.actInventory = actInventory;
	}

	public Float getFcstQty() {
		return this.fcstQty;
	}

	public void setFcstQty(Float fcstQty) {
		this.fcstQty = fcstQty;
	}

	public Float getChangeQty() {
		return this.changeQty;
	}

	public void setChangeQty(Float changeQty) {
		this.changeQty = changeQty;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

}