package com.brngri.springsecuritylearn.reposiories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brngri.springsecuritylearn.entitys.User;

public interface UserRepository extends JpaRepository<User, UUID>{

    Optional<User> findByUsername(String username);
    
}
