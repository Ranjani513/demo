package com.nisum.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nisum.onetoone.entity.User1;
@Repository
public interface UserRepository extends JpaRepository<User1, Long>{

}
