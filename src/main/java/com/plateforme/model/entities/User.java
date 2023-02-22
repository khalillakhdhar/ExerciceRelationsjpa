package com.plateforme.model.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(nullable = false)
private String nom;
@Column(unique = true)
private String email;
private String adresse;
private String grade;
@OneToMany(cascade =CascadeType.ALL,mappedBy = "user")
private List<Commande> commandes;

}
