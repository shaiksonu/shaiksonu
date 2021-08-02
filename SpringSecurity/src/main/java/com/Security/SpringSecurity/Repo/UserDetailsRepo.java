package com.Security.SpringSecurity.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Security.SpringSecurity.Entity.User;

@Repository
public interface UserDetailsRepo  extends JpaRepository<User, Long>{
	
	User findByuserName(String user);

}
