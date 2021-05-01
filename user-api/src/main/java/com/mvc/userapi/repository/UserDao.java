package com.mvc.userapi.repository;

import com.mvc.userapi.model.DAOUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<DAOUser, Integer> {
    DAOUser findTopByUsername(String username);
}