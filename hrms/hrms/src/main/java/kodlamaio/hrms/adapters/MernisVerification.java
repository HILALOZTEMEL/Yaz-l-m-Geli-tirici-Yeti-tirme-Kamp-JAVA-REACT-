package kodlamaio.hrms.adapters;



import kodlamaio.hrms.business.abstracts.JobSeekerCheckService;
import kodlamaio.hrms.entities.concretes.JobSeeker;



public class MernisVerification implements JobSeekerCheckService{
   
	private boolean result;
    

	@Override
	public boolean checkRealPerson(JobSeeker jobSeeker) {
	
		return this.result;
	}
	
	public boolean isVerificationSuccess(){
		return this.result = result;
	}

	


	
	
}
