package com.mycompany.simple_crud_wildfly.service;


import com.mycompany.simple_crud_wildfly.dto.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO dto);

    void deleteUser(String userID);

    void updateUser(UserDTO dto);

    List<UserDTO> getAllUsers();

    UserDTO searchUser(String userID);


//    String generateUserId();
}
