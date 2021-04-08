package com.objis.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Developpeur {
	private String nom;
	private int anneesExperience;
	
	public Developpeur() {
		super();
	}

	public Developpeur(String nom, int anneeExperience) {
		super();
		this.nom = nom;
		this.anneesExperience = anneeExperience;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAnneesExperience() {
		return anneesExperience;
	}

	public void setAnneesExperience(int anneeExperience) {
		this.anneesExperience = anneeExperience;
	}

	@Override
	public String toString() {
		return "Developpeur [nom=" + nom + ", anneesExperience=" + anneesExperience + "]";
	}
	
	@PostConstruct
	public void myPostConstruct() {
	     System.out.println("---Initialisation  Dev---");
	     if(nom != null) {
	    	 System.out.println("Bonjour Je viens d'être créé :"+ nom);
	     }
	}
	
	@PreDestroy
	public void myPreDestroy() {
		System.out.println("---Bye Bye --- "  + nom);
	}
	
	

}
