package com.xworkz.app.repository;

import com.xworkz.app.dto.ApplicationDTO;

public interface ApplicationRepository {

	int TOTAL = 10;

	void save(ApplicationDTO applicationDTO);

	boolean isExist(ApplicationDTO applicationDTO);

	ApplicationDTO isFoundByName(String name);

	ApplicationDTO isFoundByNameAndDevelopedBy(String name, String developedBy);

	ApplicationDTO foundAll(int id, String name, String developedBy, String developedAt, String version);
}
