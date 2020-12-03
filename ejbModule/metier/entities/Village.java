package metier.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Long;

import javax.annotation.Generated;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Village
 *
 */
@Entity
@Table(name ="village")
public class Village implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	@OneToMany(mappedBy = "village", fetch = FetchType.LAZY)
	private List<Abonne> abonnes;
	private static final long serialVersionUID = 1L;

	public Village() {
		super();
	}   
	public List<Abonne> getAbonnes() {
		return abonnes;
	}
	public void setAbonnes(List<Abonne> abonnes) {
		this.abonnes = abonnes;
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
   
}
