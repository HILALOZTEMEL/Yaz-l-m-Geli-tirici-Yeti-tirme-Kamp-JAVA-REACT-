package gun5odev.dataAccess.concretes;

import java.util.List;

import gun5odev.dataAccess.abstacts.UserDao;
import gun5odev.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	//Userýn veriye eriþim kodlarý yazýlýr
	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi " +user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
