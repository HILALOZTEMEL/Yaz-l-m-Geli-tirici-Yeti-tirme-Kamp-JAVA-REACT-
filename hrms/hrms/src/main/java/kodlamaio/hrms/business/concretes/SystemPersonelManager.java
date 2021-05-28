package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SystemPersonelService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SystemPersonelDao;
import kodlamaio.hrms.entities.concretes.SystemPersonel;


@Service
public class SystemPersonelManager implements SystemPersonelService{
	
	private SystemPersonelDao systemPersonelDao;
	@Autowired
	public SystemPersonelManager(SystemPersonelDao systemPersonelDao) {
		super();
		this.systemPersonelDao = systemPersonelDao;
	}
	@Override
	public DataResult<List<SystemPersonel>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<SystemPersonel>>(this.systemPersonelDao.findAll(),"System Personel Data Listelendi ");
				
	}
	@Override
	public boolean DoDepartmentsRepeat() {
		
		return false;
	}

	@Override
	public Result add(SystemPersonel systemPersonel) {
		if(DoDepartmentsRepeat()) {
			this.systemPersonelDao.save(systemPersonel);
			return new ErrorResult("Departmant tekrar emekte!");
		}else {
			this.systemPersonelDao.save(systemPersonel);
		return new SuccessResult("işlem başarılı");
		}
		
		
	}
	
}
