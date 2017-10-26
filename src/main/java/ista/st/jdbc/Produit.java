package ista.st.jdbc;

public class Produit {
	private int id;
	private int categorie;
	private String description;
	private String nom;
	private double prix;
	public Produit(int id, int categorie, String description, String nom, double prix) {
		this.id = id;
		this.categorie = categorie;
		this.description = description;
		this.nom = nom;
		this.prix = prix;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategorie() {
		return categorie;
	}

	public void setCategorie(int categorie) {
		this.categorie = categorie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String toString() {
		return String.format("[id=%s, categorie=%s, description=%s, nom=%s,  prix=%f]", id, categorie, description,nom, prix);
	}
}
