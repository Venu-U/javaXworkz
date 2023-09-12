package com.xworkz.boot.dto;

	import com.xworkz.app.dto.EngineerDTO;
	import com.xworkz.app.repository.EngineerRepository;
	import com.xworkz.app.repository.EngineerRepositoryimpl;
	import com.xworkz.app.service.EngineerService;
	import com.xworkz.app.service.EngineerServiceimpl;
	public class EnigeerRunner {

	public static void main(String[] args) {
		EngineerRepository engineerRepository=new EngineerRepositoryimpl();
		EngineerService engineerService=new EngineerServiceimpl(engineerRepository);
		EngineerDTO dto=new EngineerDTO(2,"Venu U","jnn college");
		EngineerDTO dto1=new EngineerDTO(3,"Varsha","jnn college");
		EngineerDTO dto5=new EngineerDTO(3,"Chandan","jnn college");

		EngineerDTO dto2=new EngineerDTO(4,"Venu u","jnn college");
		EngineerDTO dto3=new EngineerDTO(2,"Varsha","jnn college");
		EngineerDTO dto4=new EngineerDTO(0,null,null);


		engineerService.validateAndSave(dto);
		engineerService.validateAndSave(dto1);
		engineerService.validateAndSave(dto2);
		engineerService.validateAndSave(dto3);
		engineerService.validateAndSave(dto4);
		engineerService.validateAndSave(dto5);

		engineerRepository.isFound("Chandan");


	}
	}