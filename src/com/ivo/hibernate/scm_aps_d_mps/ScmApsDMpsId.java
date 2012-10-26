package com.ivo.hibernate.scm_aps_d_mps;

/**
 * ScmApsDMpsId entity. @author MyEclipse Persistence Tools
 */
public class ScmApsDMpsId extends AbstractScmApsDMpsId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ScmApsDMpsId() {
	}

	/** full constructor */
	public ScmApsDMpsId(String prodId, String verId, String modelId,
			String grade, String mon, String fcstVerIdFk) {
		super(prodId, verId, modelId, grade, mon, fcstVerIdFk);
	}

}
