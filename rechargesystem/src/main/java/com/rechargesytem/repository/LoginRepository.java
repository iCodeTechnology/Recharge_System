package com.rechargesytem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rechargesystem.models.UserLogin;

@Repository("loginrepository")
public interface LoginRepository extends JpaRepository<UserLogin, Long>{
	
}
