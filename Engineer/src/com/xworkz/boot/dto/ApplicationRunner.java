package com.xworkz.boot.dto;

import com.xworkz.app.dto.ApplicationDTO;
import com.xworkz.app.repository.ApplicationRepository;
import com.xworkz.app.repository.ApplicationRepositoryImpl;
import com.xworkz.app.service.ApplicationService;
import com.xworkz.app.service.ApplicationServiceImpl;

public class ApplicationRunner {
	public static void main(String[] args) {
		ApplicationRepository applicationRepository = new ApplicationRepositoryImpl();
		ApplicationService applicationService = new ApplicationServiceImpl(applicationRepository);
		ApplicationDTO applicationDTO = new ApplicationDTO(1, "Instagram", "california", "mark", "insta2.0");
		ApplicationDTO applicationDTO1 = new ApplicationDTO(2, "Facebook", "america", "mask", "fb2.0");
		ApplicationDTO applicationDTO2 = new ApplicationDTO(3, "Twitter", "bharat", "modi", "X2.0");
		ApplicationDTO applicationDTO3 = new ApplicationDTO(0, null, null, null, null);
		ApplicationDTO applicationDTO4 = new ApplicationDTO(1, "Instagram", "california", "mark", "insta2.0");

		applicationService.validateAndSave(applicationDTO);
		applicationService.validateAndSave(applicationDTO1);
		applicationService.validateAndSave(applicationDTO2);
		applicationService.validateAndSave(applicationDTO3);
		applicationService.validateAndSave(applicationDTO4);

		applicationRepository.isFoundByName("Instagram");
		applicationRepository.isFoundByNameAndDevelopedBy("Facebook", "america");
		applicationRepository.foundAll(3, "Twitter", "bharat", "modi", "X2.0");
	}
}