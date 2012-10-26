package com.ivo.model;

import java.sql.Timestamp;

/**
 * Mps_basciyieldId entity. @author MyEclipse Persistence Tools
 */

public class Mps_basciyieldId implements java.io.Serializable {

	// Fields

	private Integer row;
	private Integer column;
	private String model;
	private String type;
	private Timestamp timestamp;
	private String yield;
	private String sequence;

	// Constructors

	/** default constructor */
	public Mps_basciyieldId() {
	}

	/** minimal constructor */
	public Mps_basciyieldId(Integer row, String model, String type,
			Timestamp timestamp, String sequence) {
		this.row = row;
		this.model = model;
		this.type = type;
		this.timestamp = timestamp;
		this.sequence = sequence;
	}

	/** full constructor */
	public Mps_basciyieldId(Integer row, Integer column, String model,
			String type, Timestamp timestamp, String yield, String sequence) {
		this.row = row;
		this.column = column;
		this.model = model;
		this.type = type;
		this.timestamp = timestamp;
		this.yield = yield;
		this.sequence = sequence;
	}

	// Property accessors

	public Integer getRow() {
		return this.row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumn() {
		return this.column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Timestamp getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getYield() {
		return this.yield;
	}

	public void setYield(String yield) {
		this.yield = yield;
	}

	public String getSequence() {
		return this.sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Mps_basciyieldId))
			return false;
		Mps_basciyieldId castOther = (Mps_basciyieldId) other;

		return ((this.getRow() == castOther.getRow()) || (this.getRow() != null
				&& castOther.getRow() != null && this.getRow().equals(
				castOther.getRow())))
				&& ((this.getColumn() == castOther.getColumn()) || (this
						.getColumn() != null && castOther.getColumn() != null && this
						.getColumn().equals(castOther.getColumn())))
				&& ((this.getModel() == castOther.getModel()) || (this
						.getModel() != null && castOther.getModel() != null && this
						.getModel().equals(castOther.getModel())))
				&& ((this.getType() == castOther.getType()) || (this.getType() != null
						&& castOther.getType() != null && this.getType()
						.equals(castOther.getType())))
				&& ((this.getTimestamp() == castOther.getTimestamp()) || (this
						.getTimestamp() != null
						&& castOther.getTimestamp() != null && this
						.getTimestamp().equals(castOther.getTimestamp())))
				&& ((this.getYield() == castOther.getYield()) || (this
						.getYield() != null && castOther.getYield() != null && this
						.getYield().equals(castOther.getYield())))
				&& ((this.getSequence() == castOther.getSequence()) || (this
						.getSequence() != null
						&& castOther.getSequence() != null && this
						.getSequence().equals(castOther.getSequence())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRow() == null ? 0 : this.getRow().hashCode());
		result = 37 * result
				+ (getColumn() == null ? 0 : this.getColumn().hashCode());
		result = 37 * result
				+ (getModel() == null ? 0 : this.getModel().hashCode());
		result = 37 * result
				+ (getType() == null ? 0 : this.getType().hashCode());
		result = 37 * result
				+ (getTimestamp() == null ? 0 : this.getTimestamp().hashCode());
		result = 37 * result
				+ (getYield() == null ? 0 : this.getYield().hashCode());
		result = 37 * result
				+ (getSequence() == null ? 0 : this.getSequence().hashCode());
		return result;
	}

}