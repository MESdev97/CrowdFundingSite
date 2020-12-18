package com.example.entities;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Project implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.DETACH)
	 private User user;
	 private String nom;
	 private String image;
	
	 private String description;
	 private int days;
	 @OneToMany(mappedBy = "project")
	    private List<Contribution> contributions;
	 
	 @ManyToOne(cascade = CascadeType.DETACH)
		private Categorie categorie;
	
	 
	 
	 @JsonIgnore
	 public List<Contribution> getContributions() {
		return contributions;
	}
	public void setContributions(List<Contribution> contributions) {
		this.contributions = contributions;
	}
	
	public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}

	
	public Project() {
		super();
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Project(String nom, String image, String description, int days) {
		super();
		this.nom = nom;
		this.image = image;
		this.description = description;
		this.days = days;
	}
	public Project(User user, String nom, String image, String description, int days, List<Contribution> contributions,
			Categorie categorie) {
		super();
		this.user = user;
		this.nom = nom;
		this.image = image;
		this.description = description;
		this.days = days;
		this.contributions = contributions;
		this.categorie = categorie;
	}
	 
	 
	
}
