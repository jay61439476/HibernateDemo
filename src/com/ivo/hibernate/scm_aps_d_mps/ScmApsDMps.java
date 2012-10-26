package com.ivo.hibernate.scm_aps_d_mps;

import java.sql.Timestamp;

/**
 * ScmApsDMps entity. @author MyEclipse Persistence Tools
 */
public class ScmApsDMps extends AbstractScmApsDMps implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ScmApsDMps() {
	}

	/** minimal constructor */
	public ScmApsDMps(ScmApsDMpsId id, String seqNo, Integer seqId,
			String sizeId, Timestamp createTime, Timestamp updateTime) {
		super(id, seqNo, seqId, sizeId, createTime, updateTime);
	}

	/** full constructor */
	public ScmApsDMps(ScmApsDMpsId id, String seqNo, Integer seqId,
			String sizeId, Float salesPlanQty, Float lcmInput, Float lcmOutput,
			Float lcm1Input, Float lcm2Input, Float lcm1Output,
			Float lcm2Output, Float inventory, Float actInventory,
			Float fcstQty, Float changeQty, String remark, String createUser,
			String updateUser, Timestamp createTime, Timestamp updateTime) {
		super(id, seqNo, seqId, sizeId, salesPlanQty, lcmInput, lcmOutput,
				lcm1Input, lcm2Input, lcm1Output, lcm2Output, inventory,
				actInventory, fcstQty, changeQty, remark, createUser,
				updateUser, createTime, updateTime);
	}

}
