package metier;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.User;


@Stateless
public class UserImpl implements IUser{

	@PersistenceContext(unitName="SenforageEjb")
	private EntityManager em;
	@Override
	public User addUser(User user) {
		this.em.persist(user);
		this.em.flush();
		return user;
	}

	@Override
	public User getUser(Long id) {
		return this.em.find(User.class, id);
	}

	@Override
	public User editUser(User user) {
		this.em.persist(user);
		this.em.flush();
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> listUsers() {
	Query query = this.em.createQuery("select u from User u");
		
		return query.getResultList();
	}

	
}
