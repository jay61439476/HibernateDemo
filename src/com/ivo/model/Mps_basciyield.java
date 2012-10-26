package com.ivo.model;

/**
 * Mps_basciyield entity. @author MyEclipse Persistence Tools
 */

public class Mps_basciyield implements java.io.Serializable {

	// Fields

	private Mps_basciyieldId id;

	// Constructors

	/** default constructor */
	public Mps_basciyield() {
	}

	/** full constructor */
	public Mps_basciyield(Mps_basciyieldId id) {
		this.id = id;
	}

	// Property accessors

	public Mps_basciyieldId getId() {
		return this.id;
	}

	public void setId(Mps_basciyieldId id) {
		this.id = id;
	}

}