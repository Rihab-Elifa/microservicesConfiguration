package com.example.profil;

import com.example.profil.EmployeeProfile;
import com.example.profil.EmployeeProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class EmployeeController {
    @Autowired
    EmployeeProfileService employeeProfileService;

    @PostMapping
    public void saveEmployeeProfile(@RequestBody EmployeeProfile employeeProfile) {
        employeeProfileService.addEmployeeProfile(employeeProfile);
    }

    @GetMapping
    public List< EmployeeProfile > getAllEmployee() {
        return employeeProfileService.getEmployeeProfiles();
    }

}