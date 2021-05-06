package gun5odev.dataAccess.abstacts;


import java.util.List;

import gun5odev.entities.concretes.User;

public interface UserDao {
	//user ile ilgili i�lemlerin imzas�
	public void add(User user);
	public void update(User user);
	public void delete(User user);
	User get(int id);//metoda bir id ver ,oda veri taban�ndan kullan�c�y� bulsun
	List<User> getAll();//t�m kullan�c�lar� bize getirebilmesi i�in arrayList kullan�r�z

}
