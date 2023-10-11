package com.springboot.sqlserver.service;

import com.springboot.sqlserver.entity.ProfileInfo;
import com.springboot.sqlserver.repository.IRepository;
import com.springboot.sqlserver.util.ProfileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

	@Autowired
	private IRepository repository;

	@Autowired
	private EmailService emailService;

	public List<ProfileInfo> profiles() {
		return repository.findAll();
	}

	public ProfileInfo save(ProfileInfo pInfo) {
		ProfileInfo profileInfo= ProfileInfo.builder().address(pInfo.getAddress()).profile_id(pInfo.getProfile_id()).active(pInfo.getActive()).age(pInfo.getAge()).City(pInfo.getCity()).country(pInfo.getCountry()).diagnosis(pInfo.getDiagnosis()).Email_ID(pInfo.getEmail_ID()).gender(pInfo.getGender()).Name(pInfo.getName()).NHS_ID(pInfo.getNHS_ID()).Password(pInfo.getPassword()).phone_number(pInfo.getPhone_number()).Postal_Code(pInfo.getPostal_Code()).Role(pInfo.getRole()).build();
		emailService.sendEmail(pInfo);
		return repository.save(profileInfo);
	}

	public String delete(Integer empId) {
		ProfileInfo profileInfo = repository.findById(empId).orElseThrow(() -> ProfileUtil.notFound(empId.longValue()));
		repository.delete(profileInfo);
		return "Profile with id=" + empId + " removed";
	}

	public String deleteAll() {
		repository.deleteAll();
		return "All Profiles are removed.";
	}

	public ProfileInfo update(ProfileInfo pInfo) {
		repository.findById(pInfo.getProfile_id().intValue()).orElseThrow(() -> ProfileUtil.notFound(pInfo.getProfile_id()));
		ProfileInfo profileInfo= ProfileInfo.builder().address(pInfo.getAddress()).profile_id(pInfo.getProfile_id()).active(pInfo.getActive()).age(pInfo.getAge()).City(pInfo.getCity()).country(pInfo.getCountry()).diagnosis(pInfo.getDiagnosis()).Email_ID(pInfo.getEmail_ID()).gender(pInfo.getGender()).Name(pInfo.getName()).NHS_ID(pInfo.getNHS_ID()).Password(pInfo.getPassword()).phone_number(pInfo.getPhone_number()).Postal_Code(pInfo.getPostal_Code()).Role(pInfo.getRole()).build();
		return repository.save(profileInfo);
	}
}
