package metier;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;



import metier.entities.Village;

@Stateless(name="VI")
public class VillageImpl implements IVillage{
	@PersistenceContext(unitName="SenforageEjb")
	private EntityManager em;
	@Override
	public Village addVillage(Village vlg) {
		this.em.persist(vlg);
		this.em.flush();
		return vlg;
	}

	@Override
	public Village getVillage(Long id) {
		return this.em.find(Village.class, id);
	}

	@Override
	public Village editVillage(Village vlg) {
		this.em.persist(vlg);
		this.em.flush();
		return vlg;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Village> listVillages() {
	Query query = this.em.createQuery("select v from Village v");
		
		return query.getResultList();
	}

	
}
