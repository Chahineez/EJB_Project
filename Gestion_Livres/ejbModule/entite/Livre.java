package entite;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Livre implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String intitule;
@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE},fetch
= FetchType.EAGER)
private List<Auteur> auteurs;

public Livre() { 
	super();
	}
//Constructeurs avec paramètres


public Livre(String intitule, List<Auteur> auteurs) {
	// TODO Auto-generated constructor stub
	super();
	this.intitule = intitule;
	this.auteurs=auteurs;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getIntitule() {
	return intitule;
}
public void setIntitule(String intitule) {
	this.intitule = intitule;
}
public List<Auteur> getAuteurs() {
	return auteurs;
}
public void setAuteurs(List<Auteur> auteurs) {
	this.auteurs = auteurs;
}



}