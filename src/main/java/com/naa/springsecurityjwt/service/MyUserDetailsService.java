package com.naa.springsecurityjwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.naa.springsecurityjwt.models.UserDtls;
import com.naa.springsecurityjwt.util.MyUserDtlsRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	MyUserDtlsRepository myUserDtlsRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    	UserDtls myUser = null;
    	
    	List<UserDtls> users = myUserDtlsRepository.findByUsername(userName);
    	
    	if(users.size() > 0)
			myUser = users.get(0);
    	else 
    		throw new BadCredentialsException("Bad Credentials !!!");
    	
        return new User(myUser.getUsername(), myUser.getPwd(),
                new ArrayList<>());
    }
}