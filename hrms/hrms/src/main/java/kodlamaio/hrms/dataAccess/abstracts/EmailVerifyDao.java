package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.google.common.base.Optional;

import kodlamaio.hrms.entities.concretes.EmailVerify;

public interface EmailVerifyDao extends JpaRepository<EmailVerify, Integer>{
	Optional<EmailVerify> findByUserId(Integer userId);
}
