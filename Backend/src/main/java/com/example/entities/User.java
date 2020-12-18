package com.example.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class User implements Serializable {

	
	private static final long serialVersionUID = 1L;


	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	private Long id;

	 private String nom;
	 private String prenom;
	 private String email;
	 private String passwd;
	 private String Imageuser;
	 @OneToMany(mappedBy="user")
	 private List<Project> projects;
	 @OneToMany(mappedBy="user")
	 private List<Contribution> contributions;
	 
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String nom, String prenom, String email, String passwd, String imageuser, List<Project> projects,
			List<Contribution> contributions) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.passwd = passwd;
		Imageuser = imageuser;
		this.projects = projects;
		this.contributions = contributions;
	}

	public Collection<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Collection<Contribution> getContributions() {
		return contributions;
	}

	public void setContributions(List<Contribution> contributions) {
		this.contributions = contributions;
	}

	public User(String nom, String prenom, String email, String passwd,String Imageuser) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.passwd = passwd;
		this.Imageuser=Imageuser;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getImageuser() {
		return Imageuser;
	}
	public void setImageuser(String imageuser) {
		Imageuser = imageuser;
	}
	
	
}
