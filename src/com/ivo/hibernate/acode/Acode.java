package com.ivo.hibernate.acode;

import java.sql.Timestamp;

/**
 * Acode entity. @author MyEclipse Persistence Tools
 */

public class Acode implements java.io.Serializable {

	// Fields

	private AcodeId id;
	private String subitem;
	private String code_dsc;
	private String ext_1;
	private String ext_2;
	private String ext_3;
	private String ext_4;
	private String ext_5;
	private String sequence;
	private Timestamp evt_timestamp;

	// Constructors

	/** default constructor */
	public Acode() {
	}

	/** minimal constructor */
	public Acode(AcodeId id, String sequence, Timestamp evt_timestamp) {
		this.id = id;
		this.sequence = sequence;
		this.evt_timestamp = evt_timestamp;
	}

	/** full constructor */
	public Acode(AcodeId id, String subitem, String code_dsc, String ext_1,
			String ext_2, String ext_3, String ext_4, String ext_5,
			String sequence, Timestamp evt_timestamp) {
		this.id = id;
		this.subitem = subitem;
		this.code_dsc = code_dsc;
		this.ext_1 = ext_1;
		this.ext_2 = ext_2;
		this.ext_3 = ext_3;
		this.ext_4 = ext_4;
		this.ext_5 = ext_5;
		this.sequence = sequence;
		this.evt_timestamp = evt_timestamp;
	}

	// Property accessors

	public AcodeId getId() {
		return this.id;
	}

	public void setId(AcodeId id) {
		this.id = id;
	}

	public String getSubitem() {
		return this.subitem;
	}

	public void setSubitem(String subitem) {
		this.subitem = subitem;
	}

	public String getCode_dsc() {
		return this.code_dsc;
	}

	public void setCode_dsc(String code_dsc) {
		this.code_dsc = code_dsc;
	}

	public String getExt_1() {
		return this.ext_1;
	}

	public void setExt_1(String ext_1) {
		this.ext_1 = ext_1;
	}

	public String getExt_2() {
		return this.ext_2;
	}

	public void setExt_2(String ext_2) {
		this.ext_2 = ext_2;
	}

	public String getExt_3() {
		return this.ext_3;
	}

	public void setExt_3(String ext_3) {
		this.ext_3 = ext_3;
	}

	public String getExt_4() {
		return this.ext_4;
	}

	public void setExt_4(String ext_4) {
		this.ext_4 = ext_4;
	}

	public String getExt_5() {
		return this.ext_5;
	}

	public void setExt_5(String ext_5) {
		this.ext_5 = ext_5;
	}

	public String getSequence() {
		return this.sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public Timestamp getEvt_timestamp() {
		return this.evt_timestamp;
	}

	public void setEvt_timestamp(Timestamp evt_timestamp) {
		this.evt_timestamp = evt_timestamp;
	}

}