package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SystemPersonelService;
import kodlamaio.hrms.entities.concretes.SystemPersonel;


@RestController
@RequestMapping("/api/SystemPersonels")
public class SystemPersonelsController {
	
	private SystemPersonelService systemPersonelService;
	@Autowired
	public SystemPersonelsController(SystemPersonelService systemPersonelService) {
		super();
		this.systemPersonelService = systemPersonelService;
	}

	@GetMapping("/getall")
	public List<SystemPersonel> getAll(){
		return this.systemPersonelService.getAll();
		
	}
}
