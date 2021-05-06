package gun5odev.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import gun5odev.business.abstracts.UserService;
import gun5odev.core.LoggerService;
import gun5odev.dataAccess.abstacts.UserDao;
import gun5odev.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private LoggerService loggerService;
	
	public UserManager(UserDao userDao,LoggerService loggerService) {
		super();
		this.userDao = userDao;
		this.loggerService=loggerService;
	}

	@Override
	public void singUp(User user) {
		
		if(controlers(user)) {
			this.userDao.add(user);
			this.loggerService.logToSystem("Üye eklendi "+user.getFirstName()+" "+user.getLastName());;
		}else {
			System.out.println("Kaydýnýz oluþturulamadý");
		}
		
		
	}

	@Override
	public void singIn(User user, String mail, String password) {
		
		if(mail==user.getePosta() && password==user.getPassword()) {
			
			System.out.println("Sisteme giriþ baþarýlý");
			
		}else {
			
			System.out.println("e-posta veya þifre hatalý");
			
		}
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean passwordControl(User user) {	
		
		
		if(user.getPassword().length()==6) {
			
			return true;
			
		}else {
			System.out.println("þifre 6 karakter deðil");
			return false;
		}
		
		
	}
	

	public boolean epostaControl(User user) {
		String emailRegex="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern emailPat= Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher=emailPat.matcher(user.getePosta());	
		if(matcher.find()==true) {
			return true;
		}else {
			System.out.println("e-posta hatalý");
			return false;
		}
		
		
	}
	
	public boolean firstName_lastNameControl(User user) {
		if(user.getFirstName().length()>=2&&user.getLastName().length()>=2) {
			return true;
		}else {
			return false;
		}
		
	}
	@Override
	public boolean epostaIsItUsed(String mail1, String mail2) {
		if(mail1.equals(mail2)) {
			System.out.println("ayný mail ile kayýt olunamaz");
			return false;
		}else {
			return true;
		}
		
		
		
	}


	@Override
	public boolean controlers(User user) {
		if(passwordControl(user)&&epostaControl(user)&&firstName_lastNameControl(user)) {
			return true;
		}else {
		
			return false;
		}
		
	}

	@Override
	public boolean sendVerificationMail(User user) {
		if(epostaControl(user)&&controlers(user)) {
			System.out.println("Doðrulama maili mail kutunuza gönderildi.Mail kutunuzu kontrol ediniz.");
			return true;
		}else {
			return false;
		}
		
		
	}

	@Override
	public boolean verify(User user) {
		if(sendVerificationMail(user)) {
			System.out.println("Doðrulama tamalandý");
			return true;
		}else {
			return false;
		}
	     
	}

	


	
	

}
