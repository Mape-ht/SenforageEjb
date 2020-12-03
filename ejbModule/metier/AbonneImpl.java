package metier;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import metier.entities.Abonne;

@Stateless(name="AB")
public class AbonneImpl implements IAbonne{
	@PersistenceContext(unitName="SenforageEjb")
	private EntityManager em;
	@Override
	public Abonne addAbonne(Abonne abn) {
		this.em.persist(abn);
		this.em.flush();
		return abn;
	}

	@Override
	public Abonne getAbonne(Long id) {
		return this.em.find(Abonne.class, id);
	}

	@Override
	public Abonne editAbonne(Abonne abn) {
		this.em.persist(abn);
		this.em.flush();
		return abn;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Abonne> listAbonnes() {
		Query query = this.em.createQuery("select a from Abonne a");
		return query.getResultList();
	}

}
