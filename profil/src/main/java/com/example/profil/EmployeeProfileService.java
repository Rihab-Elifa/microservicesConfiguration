package com.example.profil;

import com.example.profil.EmployeeProfile;

import java.util.List;

public interface EmployeeProfileService {
    void addEmployeeProfile(EmployeeProfile profile);
    List< EmployeeProfile > getEmployeeProfiles();
}