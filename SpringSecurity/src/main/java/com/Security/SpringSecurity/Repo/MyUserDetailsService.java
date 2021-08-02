package com.Security.SpringSecurity.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Security.SpringSecurity.Entity.User;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserDetailsRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repo.findByuserName(username);
		
		if(user==null) 
		{
			throw new UsernameNotFoundException("UserNotFound");
		}
		
		return new UserPrinciple(user);
	}

}
