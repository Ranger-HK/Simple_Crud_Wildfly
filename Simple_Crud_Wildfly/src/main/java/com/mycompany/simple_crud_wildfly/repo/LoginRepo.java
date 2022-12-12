package com.mycompany.simple_crud_wildfly.repo;


import com.mycompany.simple_crud_wildfly.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<User,String> {
}
