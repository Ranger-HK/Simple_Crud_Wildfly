package com.mycompany.simple_crud_wildfly.service.Impl;


import com.mycompany.simple_crud_wildfly.dto.UserDTO;
import com.mycompany.simple_crud_wildfly.entity.User;
import com.mycompany.simple_crud_wildfly.repo.LoginRepo;
import com.mycompany.simple_crud_wildfly.service.LoginService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginRepo loginRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<UserDTO> fetchAllUser() {
        List<User> all = loginRepo.findAll();
        return modelMapper.map(all, new TypeToken<List<UserDTO>>() {

        }.getType());

    }


}
