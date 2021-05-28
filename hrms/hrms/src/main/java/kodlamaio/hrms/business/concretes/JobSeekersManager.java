package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.adapters.MernisVerification;
import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.entities.concretes.SystemPersonel;


@Service
public class JobSeekersManager implements JobSeekerService{

    MernisVerification mernisVerification;
	JobSeekerDao jobSeekerDao;
	@Autowired
	public JobSeekersManager( JobSeekerDao jobSeekerDao) {
		super();
		
		this.jobSeekerDao = jobSeekerDao;
	}
	


	@Override
	public Result add(JobSeeker jobSeeker) {
		
		if(mernisVerification.isVerificationSuccess()) {
			this.jobSeekerDao.save(jobSeeker);
			return new SuccessResult("Kişi kayıt edildi");
		}else {
			return new ErrorResult("Mernis doğrulaması Geçersiz");
		}
		
	}



	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"System Personel Data Listelendi ");
	}



	
	
	
	

	
	
	


	

}
