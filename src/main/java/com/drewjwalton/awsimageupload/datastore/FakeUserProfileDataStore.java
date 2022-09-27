package com.drewjwalton.awsimageupload.datastore;

import com.drewjwalton.awsimageupload.profile.UserProfile;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("a0a77575-42a9-440e-9638-4e9f2805aa06"), "janedoe", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("e6d01978-f538-4e5a-8a19-ccaba048076e"), "johndoe", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
