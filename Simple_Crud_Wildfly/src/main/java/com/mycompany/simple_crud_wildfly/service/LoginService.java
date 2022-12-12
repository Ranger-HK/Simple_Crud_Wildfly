package com.mycompany.simple_crud_wildfly.service;



import com.mycompany.simple_crud_wildfly.dto.UserDTO;

import java.util.List;

public interface LoginService {

    List<UserDTO> fetchAllUser();


}
