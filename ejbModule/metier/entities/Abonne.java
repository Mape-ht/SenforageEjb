package metier.entities;

import java.io.Serializable;
import java.lang.String;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Abonne
 *
 */
@Entity
@Table(name ="abonne")
public class Abonne implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String adresse;
	private String telephone;
	@ManyToOne
	private Village village;
	public Village getVillage() {
		return village;
	}
	public void setVillage(Village village) {
		this.village = village;
	}

	private static final long serialVersionUID = 1L;

	public Abonne() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}   
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
   
}
