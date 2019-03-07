package com.zeeshan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeeshan.dao.ProfileRepository;
import com.zeeshan.entity.Profile;

@RestController
public class ProfileController {

	@Autowired
	private ProfileRepository repository;

	@RequestMapping("/profiles")
	public Profile[] all() {
		List<Profile> profiles = repository.getAllProfile();
		return profiles.toArray(new Profile[profiles.size()]);
	}

	@RequestMapping("/profiles/{id}")
	public Profile byId(@PathVariable("id") String userId) {
		Profile profile = repository.getProfile(userId);
		return profile;
	}
}
