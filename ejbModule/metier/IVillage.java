package metier;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Village;


@Local
public interface IVillage {

	public Village addVillage(Village vlg);
	public Village getVillage(Long id);
	public Village editVillage(Village vlg);
	public List<Village> listVillages();
	
}
