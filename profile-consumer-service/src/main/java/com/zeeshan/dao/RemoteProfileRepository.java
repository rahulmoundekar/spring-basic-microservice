/**
 * 
 */
package com.zeeshan.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.zeeshan.entity.Profile;

/**
 * @author ZEESHAN KHAN
 *
 */

public class RemoteProfileRepository implements ProfileRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zeeshan.dao.ProfileRepository#getAllProfile()
	 */

	@Autowired
	protected RestTemplate restTemplate;

	protected String serviceUrl;

	public RemoteProfileRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl : "http://" + serviceUrl;
	}

	@Override
	public List<Profile> getAllProfile() {
		Profile[] profiles = restTemplate.getForObject(serviceUrl + "/profiles", Profile[].class);
		return Arrays.asList(profiles);
	}

	@Override
	public Profile getProfile(String userId) {
		return restTemplate.getForObject(serviceUrl + "/profiles/{id}", Profile.class, userId);
	}

}
