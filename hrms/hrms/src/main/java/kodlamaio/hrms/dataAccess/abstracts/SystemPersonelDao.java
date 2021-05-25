package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.SystemPersonel;



public interface SystemPersonelDao extends JpaRepository<SystemPersonel, Integer>{

}
