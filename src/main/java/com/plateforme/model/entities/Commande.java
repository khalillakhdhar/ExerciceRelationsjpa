package com.plateforme.model.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Commande {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private int quantite;
private Date date;
private String produit;
@JoinColumn(name ="id_user",referencedColumnName = "id")
@ManyToOne(optional = false)
User user;

}
