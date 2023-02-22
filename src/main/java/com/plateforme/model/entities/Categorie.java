package com.plateforme.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Categorie {
@Id
private long id;
@Column(unique = true)
private String titre;
}
