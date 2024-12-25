package com.waizin.jobportal.services;

import com.waizin.jobportal.entity.UsersType;
import com.waizin.jobportal.repository.UsersTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersTypeService {
    private final UsersTypeRepository usersTypeRepository;

    public UsersTypeService(UsersTypeRepository usersTypeRepository) {
        this.usersTypeRepository = usersTypeRepository;
    }

    public List<UsersType> getAll(){
        return usersTypeRepository.findAll();
    }
}
