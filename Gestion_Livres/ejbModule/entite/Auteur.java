package entite;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Auteur implements Serializable{
@Id
private String id;
private String nom;
@ManyToMany(mappedBy="auteurs")
private List<Livre> livres;

//Constructeurs avec paramètres


public Auteur(String id, String nom) {
	super();
	this.id = id;
	this.nom = nom;
	
}


//Getters et setters
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public List<Livre> getLivres() {
	return livres;
}
public void setLivres(List<Livre> livres) {
	this.livres = livres;
}



}