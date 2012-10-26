package com.ivo.hibernate.fcst_aps_d_mps;

import java.sql.Timestamp;

/**
 * AbstractFcstApsDMpsId entity provides the base persistence definition of the
 * FcstApsDMpsId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFcstApsDMpsId implements java.io.Serializable {

	// Fields

	private String seqNo;
	private Integer seqId;
	private String fcstVerIdFk;
	private String mon;
	private String prodId;
	private String verId;
	private String modelId;
	private String sizeId;
	private String grade;
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
	public AbstractFcstApsDMpsId() {
	}

	/** minimal constructor */
	public AbstractFcstApsDMpsId(String seqNo, Integer seqId,
			Timestamp createTime, Timestamp updateTime) {
		this.seqNo = seqNo;
		this.seqId = seqId;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	/** full constructor */
	public AbstractFcstApsDMpsId(String seqNo, Integer seqId,
			String fcstVerIdFk, String mon, String prodId, String verId,
			String modelId, String sizeId, String grade, Float salesPlanQty,
			Float lcmInput, Float lcmOutput, Float lcm1Input, Float lcm2Input,
			Float lcm1Output, Float lcm2Output, Float inventory,
			Float actInventory, Float fcstQty, Float changeQty, String remark,
			String createUser, String updateUser, Timestamp createTime,
			Timestamp updateTime) {
		this.seqNo = seqNo;
		this.seqId = seqId;
		this.fcstVerIdFk = fcstVerIdFk;
		this.mon = mon;
		this.prodId = prodId;
		this.verId = verId;
		this.modelId = modelId;
		this.sizeId = sizeId;
		this.grade = grade;
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

	public String getFcstVerIdFk() {
		return this.fcstVerIdFk;
	}

	public void setFcstVerIdFk(String fcstVerIdFk) {
		this.fcstVerIdFk = fcstVerIdFk;
	}

	public String getMon() {
		return this.mon;
	}

	public void setMon(String mon) {
		this.mon = mon;
	}

	public String getProdId() {
		return this.prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getVerId() {
		return this.verId;
	}

	public void setVerId(String verId) {
		this.verId = verId;
	}

	public String getModelId() {
		return this.modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getSizeId() {
		return this.sizeId;
	}

	public void setSizeId(String sizeId) {
		this.sizeId = sizeId;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFcstApsDMpsId))
			return false;
		AbstractFcstApsDMpsId castOther = (AbstractFcstApsDMpsId) other;

		return ((this.getSeqNo() == castOther.getSeqNo()) || (this.getSeqNo() != null
				&& castOther.getSeqNo() != null && this.getSeqNo().equals(
				castOther.getSeqNo())))
				&& ((this.getSeqId() == castOther.getSeqId()) || (this
						.getSeqId() != null
						&& castOther.getSeqId() != null && this.getSeqId()
						.equals(castOther.getSeqId())))
				&& ((this.getFcstVerIdFk() == castOther.getFcstVerIdFk()) || (this
						.getFcstVerIdFk() != null
						&& castOther.getFcstVerIdFk() != null && this
						.getFcstVerIdFk().equals(castOther.getFcstVerIdFk())))
				&& ((this.getMon() == castOther.getMon()) || (this.getMon() != null
						&& castOther.getMon() != null && this.getMon().equals(
						castOther.getMon())))
				&& ((this.getProdId() == castOther.getProdId()) || (this
						.getProdId() != null
						&& castOther.getProdId() != null && this.getProdId()
						.equals(castOther.getProdId())))
				&& ((this.getVerId() == castOther.getVerId()) || (this
						.getVerId() != null
						&& castOther.getVerId() != null && this.getVerId()
						.equals(castOther.getVerId())))
				&& ((this.getModelId() == castOther.getModelId()) || (this
						.getModelId() != null
						&& castOther.getModelId() != null && this.getModelId()
						.equals(castOther.getModelId())))
				&& ((this.getSizeId() == castOther.getSizeId()) || (this
						.getSizeId() != null
						&& castOther.getSizeId() != null && this.getSizeId()
						.equals(castOther.getSizeId())))
				&& ((this.getGrade() == castOther.getGrade()) || (this
						.getGrade() != null
						&& castOther.getGrade() != null && this.getGrade()
						.equals(castOther.getGrade())))
				&& ((this.getSalesPlanQty() == castOther.getSalesPlanQty()) || (this
						.getSalesPlanQty() != null
						&& castOther.getSalesPlanQty() != null && this
						.getSalesPlanQty().equals(castOther.getSalesPlanQty())))
				&& ((this.getLcmInput() == castOther.getLcmInput()) || (this
						.getLcmInput() != null
						&& castOther.getLcmInput() != null && this
						.getLcmInput().equals(castOther.getLcmInput())))
				&& ((this.getLcmOutput() == castOther.getLcmOutput()) || (this
						.getLcmOutput() != null
						&& castOther.getLcmOutput() != null && this
						.getLcmOutput().equals(castOther.getLcmOutput())))
				&& ((this.getLcm1Input() == castOther.getLcm1Input()) || (this
						.getLcm1Input() != null
						&& castOther.getLcm1Input() != null && this
						.getLcm1Input().equals(castOther.getLcm1Input())))
				&& ((this.getLcm2Input() == castOther.getLcm2Input()) || (this
						.getLcm2Input() != null
						&& castOther.getLcm2Input() != null && this
						.getLcm2Input().equals(castOther.getLcm2Input())))
				&& ((this.getLcm1Output() == castOther.getLcm1Output()) || (this
						.getLcm1Output() != null
						&& castOther.getLcm1Output() != null && this
						.getLcm1Output().equals(castOther.getLcm1Output())))
				&& ((this.getLcm2Output() == castOther.getLcm2Output()) || (this
						.getLcm2Output() != null
						&& castOther.getLcm2Output() != null && this
						.getLcm2Output().equals(castOther.getLcm2Output())))
				&& ((this.getInventory() == castOther.getInventory()) || (this
						.getInventory() != null
						&& castOther.getInventory() != null && this
						.getInventory().equals(castOther.getInventory())))
				&& ((this.getActInventory() == castOther.getActInventory()) || (this
						.getActInventory() != null
						&& castOther.getActInventory() != null && this
						.getActInventory().equals(castOther.getActInventory())))
				&& ((this.getFcstQty() == castOther.getFcstQty()) || (this
						.getFcstQty() != null
						&& castOther.getFcstQty() != null && this.getFcstQty()
						.equals(castOther.getFcstQty())))
				&& ((this.getChangeQty() == castOther.getChangeQty()) || (this
						.getChangeQty() != null
						&& castOther.getChangeQty() != null && this
						.getChangeQty().equals(castOther.getChangeQty())))
				&& ((this.getRemark() == castOther.getRemark()) || (this
						.getRemark() != null
						&& castOther.getRemark() != null && this.getRemark()
						.equals(castOther.getRemark())))
				&& ((this.getCreateUser() == castOther.getCreateUser()) || (this
						.getCreateUser() != null
						&& castOther.getCreateUser() != null && this
						.getCreateUser().equals(castOther.getCreateUser())))
				&& ((this.getUpdateUser() == castOther.getUpdateUser()) || (this
						.getUpdateUser() != null
						&& castOther.getUpdateUser() != null && this
						.getUpdateUser().equals(castOther.getUpdateUser())))
				&& ((this.getCreateTime() == castOther.getCreateTime()) || (this
						.getCreateTime() != null
						&& castOther.getCreateTime() != null && this
						.getCreateTime().equals(castOther.getCreateTime())))
				&& ((this.getUpdateTime() == castOther.getUpdateTime()) || (this
						.getUpdateTime() != null
						&& castOther.getUpdateTime() != null && this
						.getUpdateTime().equals(castOther.getUpdateTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSeqNo() == null ? 0 : this.getSeqNo().hashCode());
		result = 37 * result
				+ (getSeqId() == null ? 0 : this.getSeqId().hashCode());
		result = 37
				* result
				+ (getFcstVerIdFk() == null ? 0 : this.getFcstVerIdFk()
						.hashCode());
		result = 37 * result
				+ (getMon() == null ? 0 : this.getMon().hashCode());
		result = 37 * result
				+ (getProdId() == null ? 0 : this.getProdId().hashCode());
		result = 37 * result
				+ (getVerId() == null ? 0 : this.getVerId().hashCode());
		result = 37 * result
				+ (getModelId() == null ? 0 : this.getModelId().hashCode());
		result = 37 * result
				+ (getSizeId() == null ? 0 : this.getSizeId().hashCode());
		result = 37 * result
				+ (getGrade() == null ? 0 : this.getGrade().hashCode());
		result = 37
				* result
				+ (getSalesPlanQty() == null ? 0 : this.getSalesPlanQty()
						.hashCode());
		result = 37 * result
				+ (getLcmInput() == null ? 0 : this.getLcmInput().hashCode());
		result = 37 * result
				+ (getLcmOutput() == null ? 0 : this.getLcmOutput().hashCode());
		result = 37 * result
				+ (getLcm1Input() == null ? 0 : this.getLcm1Input().hashCode());
		result = 37 * result
				+ (getLcm2Input() == null ? 0 : this.getLcm2Input().hashCode());
		result = 37
				* result
				+ (getLcm1Output() == null ? 0 : this.getLcm1Output()
						.hashCode());
		result = 37
				* result
				+ (getLcm2Output() == null ? 0 : this.getLcm2Output()
						.hashCode());
		result = 37 * result
				+ (getInventory() == null ? 0 : this.getInventory().hashCode());
		result = 37
				* result
				+ (getActInventory() == null ? 0 : this.getActInventory()
						.hashCode());
		result = 37 * result
				+ (getFcstQty() == null ? 0 : this.getFcstQty().hashCode());
		result = 37 * result
				+ (getChangeQty() == null ? 0 : this.getChangeQty().hashCode());
		result = 37 * result
				+ (getRemark() == null ? 0 : this.getRemark().hashCode());
		result = 37
				* result
				+ (getCreateUser() == null ? 0 : this.getCreateUser()
						.hashCode());
		result = 37
				* result
				+ (getUpdateUser() == null ? 0 : this.getUpdateUser()
						.hashCode());
		result = 37
				* result
				+ (getCreateTime() == null ? 0 : this.getCreateTime()
						.hashCode());
		result = 37
				* result
				+ (getUpdateTime() == null ? 0 : this.getUpdateTime()
						.hashCode());
		return result;
	}

}