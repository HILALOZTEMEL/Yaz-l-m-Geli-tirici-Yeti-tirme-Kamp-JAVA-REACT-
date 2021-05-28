package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmailVerifyService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmailVerifyDao;
import kodlamaio.hrms.entities.concretes.EmailVerify;
@Service
public class EmailVerifyManager implements EmailVerifyService{
	private EmailVerifyDao emailVerifyDao;

	@Autowired
	public EmailVerifyManager(EmailVerifyDao emailVerifyDao) {

		super();
		this.emailVerifyDao = emailVerifyDao;

	}

	@Override
	public boolean checkEmail(EmailVerify emailVerify) {
		
		return true;
	}

	@Override
	public Result verify(EmailVerify emailVerify) {
		if(checkEmail(emailVerify)) {
			return new SuccessResult("Email Doğrulandı");
		}else {
			return new ErrorResult("Email Doğrulamalısınız !");
		}
		
	}

	@Override
	public boolean isTheEmailRegistered(EmailVerify emailVerify) {
		
		return false;
	}

	@Override
	public Result EmailRegistered(EmailVerify emailVerify) {
		if(isTheEmailRegistered(emailVerify)) {
			return new ErrorResult("Bu eposta Zaten kullanılmakta başka bir eposta giriniz !");
		}else {
			return new SuccessResult("Email Başarılı");
		}
		
	}
	

}
