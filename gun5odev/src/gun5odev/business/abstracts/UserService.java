package gun5odev.business.abstracts;

import java.util.List;

import gun5odev.entities.concretes.User;

public interface UserService {
	public void singUp(User user);
	public void singIn(User user, String mail, String password);
	public boolean epostaIsItUsed(String mail1,String mail2);
	public boolean controlers(User user);
	public boolean sendVerificationMail(User user);
	public boolean verify(User user);
	List<User> getAll();
}
