package metier;

import java.util.List;

import javax.ejb.Local;

import metier.entities.User;

@Local
public interface IUser {

	public User addUser(User user);
	public User getUser(Long id);
	public User editUser(User user);
	public List<User> listUsers();
}
