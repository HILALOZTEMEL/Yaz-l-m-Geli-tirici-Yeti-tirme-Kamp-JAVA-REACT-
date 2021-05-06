package gun5odev;

import gun5odev.business.abstracts.UserService;
import gun5odev.business.concretes.UserManager;
import gun5odev.core.GoogleLoggerManagerAdapter;
import gun5odev.dataAccess.concretes.HibernateUserDao;
import gun5odev.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService=new UserManager(new HibernateUserDao(),new GoogleLoggerManagerAdapter());
		User user1=new User("hilal","öztemel","hilaloztemel@gmail.com","122323");
		userService.singUp(user1);
		userService.sendVerificationMail(user1);
	    userService.verify(user1);
		userService.singIn(user1, "hilaloztemel@gmail.com", "122323");
		
		User user2=new User("hilal","öztemel","hilaloztemel@gmail.com","122323");
	    userService.epostaIsItUsed(user1.getePosta(), user2.getePosta());
	}

}
