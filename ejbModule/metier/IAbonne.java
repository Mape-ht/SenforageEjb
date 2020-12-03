package metier;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Abonne;

@Local
public interface IAbonne {

	public Abonne addAbonne(Abonne abn);
	public Abonne getAbonne(Long id);
	public Abonne editAbonne(Abonne abn);
	public List<Abonne> listAbonnes();
}
