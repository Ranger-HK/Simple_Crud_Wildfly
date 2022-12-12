package com.mycompany.simple_crud_wildfly.repo;


import com.mycompany.simple_crud_wildfly.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {

//    @Query(value = "SELECT userID FROM User ORDER BY userID DESC LIMIT 1", nativeQuery = true)
//    String generateUserId();
}
