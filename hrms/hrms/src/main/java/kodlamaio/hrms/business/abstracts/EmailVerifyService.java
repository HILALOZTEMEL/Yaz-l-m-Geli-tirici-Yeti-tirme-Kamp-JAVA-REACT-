package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EmailVerify;


public interface EmailVerifyService {
	boolean checkEmail(EmailVerify emailVerify);
	boolean isTheEmailRegistered(EmailVerify emailVerify);
	Result verify(EmailVerify emailVerify);
	Result EmailRegistered(EmailVerify emailVerify);
}
