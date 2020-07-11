package com.naa.springsecurityjwt.util;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.naa.springsecurityjwt.models.UserDtls;

@Repository
public interface MyUserDtlsRepository extends CrudRepository<UserDtls, Integer>{
	
	public List<UserDtls> findByUsername(String username);
	
}