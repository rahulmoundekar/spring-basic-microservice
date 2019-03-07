/**
 * 
 */
package com.zeeshan.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zeeshan.entity.Profile;

/**
 * @author ZEESHAN KHAN
 *
 */
@Repository
public class ProfileRepositoryImpl implements ProfileRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zeeshan.dao.ProfileRepository#getAllProfile()
	 */

	private Map<String, Profile> profileData = new HashMap<String, Profile>();

	public ProfileRepositoryImpl() {
		Profile profile = new Profile("1000", "ZEESHAN");
		profileData.put("1000", profile);
		profile = new Profile("2000", "ZAHEER");
		profileData.put("2000", profile);
		profile = new Profile("3000", "DANISH");
		profileData.put("3000", profile);
	}

	@Override
	public List<Profile> getAllProfile() {

		return new ArrayList<Profile>(profileData.values());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zeeshan.dao.ProfileRepository#getProfile(java.lang.String)
	 */
	@Override
	public Profile getProfile(String userId) {

		return profileData.get(userId);
	}

}
