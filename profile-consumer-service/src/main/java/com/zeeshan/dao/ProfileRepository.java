package com.zeeshan.dao;

import java.util.List;

import com.zeeshan.entity.Profile;

public interface ProfileRepository {

	public List<Profile> getAllProfile();

	public Profile getProfile(String userId);

}
