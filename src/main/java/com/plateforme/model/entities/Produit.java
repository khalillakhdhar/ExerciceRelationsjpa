package com.plateforme.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Produit {

	@Id
	private int id;
private String titre, photo, description;
@JoinColumn(name = "categorie",referencedColumnName = "titre")
@ManyToOne
private Categorie categorie;
}
