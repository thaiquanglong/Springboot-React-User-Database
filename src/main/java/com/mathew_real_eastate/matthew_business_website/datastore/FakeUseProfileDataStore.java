package com.mathew_real_eastate.matthew_business_website.datastore;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.mathew_real_eastate.matthew_business_website.profile.UserProfile;


@Repository
public class FakeUseProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();
    static{
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "Long Thai", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "Matthew Bennett", null));
    }
    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
