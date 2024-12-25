package com.waizin.jobportal.repository;

import com.waizin.jobportal.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

// second value Integer is for primary key
public interface UsersRepository extends JpaRepository<Users, Integer> {

}
