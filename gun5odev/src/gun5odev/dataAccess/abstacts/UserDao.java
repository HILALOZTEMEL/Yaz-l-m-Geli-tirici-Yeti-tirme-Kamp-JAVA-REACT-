package gun5odev.dataAccess.abstacts;


import java.util.List;

import gun5odev.entities.concretes.User;

public interface UserDao {
	//user ile ilgili iþlemlerin imzasý
	public void add(User user);
	public void update(User user);
	public void delete(User user);
	User get(int id);//metoda bir id ver ,oda veri tabanýndan kullanýcýyý bulsun
	List<User> getAll();//tüm kullanýcýlarý bize getirebilmesi için arrayList kullanýrýz

}
