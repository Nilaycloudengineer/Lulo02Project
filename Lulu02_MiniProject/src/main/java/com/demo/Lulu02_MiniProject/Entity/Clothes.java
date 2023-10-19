package com.demo.Lulu02_MiniProject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clothes")
public class Clothes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double cost;
	private String feedback;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Clothes(Long id, String name, double cost, String feedback) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.feedback = feedback;
	}

	public Clothes() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Clothes [id=" + id + ", name=" + name + ", cost=" + cost + ", feedback=" + feedback + "]";
	}

	// Constructors, getters, and setters

}
