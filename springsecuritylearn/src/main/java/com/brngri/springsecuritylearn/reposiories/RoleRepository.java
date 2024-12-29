package com.brngri.springsecuritylearn.reposiories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.brngri.springsecuritylearn.entitys.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

    Role findByName(String name);
    
}
