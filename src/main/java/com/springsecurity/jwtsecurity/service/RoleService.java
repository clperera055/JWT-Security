package com.springsecurity.jwtsecurity.service;


import com.springsecurity.jwtsecurity.entity.Role;
import com.springsecurity.jwtsecurity.repo.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepo roleRepo;

    public Role createNewRole(Role role) {
        return roleRepo.save(role);
    }
}
