package com.springboot.sqlserver.controller;

import com.springboot.sqlserver.entity.ProfileInfo;
import com.springboot.sqlserver.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class ProfileController {

	@Autowired
	private ClientService clientService;

	@GetMapping(value = "/profiles")
	@ResponseStatus(HttpStatus.OK)
	public List<ProfileInfo> profiles() {
		return clientService.profiles();
	}

	@GetMapping(value = "/profiles/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ProfileInfo getProfile(@PathVariable(value = "id") Integer empId) {
		return clientService.profiles().get(empId);
	}

	@PostMapping(value = "/profiles")
	@ResponseStatus(HttpStatus.CREATED)
	public ProfileInfo save(@RequestBody ProfileInfo emp) {
		return clientService.save(emp);
	}

	@DeleteMapping(value = "/profiles")
	@ResponseStatus(HttpStatus.OK)
	public String deleteAll() {
		return clientService.deleteAll();
	}

	@DeleteMapping(value = "/profiles/{id}")
	@ResponseStatus(HttpStatus.OK)
	public String delete(@PathVariable(value = "id") Integer empId) {
		return clientService.delete(empId);
	}

	@PutMapping(value = "/profiles")
	@ResponseStatus(HttpStatus.OK)
	public ProfileInfo update(@RequestBody ProfileInfo emp) {
		return clientService.update(emp);
	}

}
