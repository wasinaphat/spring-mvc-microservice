package com.mvc.userapi.repository;

import com.mvc.userapi.model.DAOUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<DAOUser,Long> {
}
