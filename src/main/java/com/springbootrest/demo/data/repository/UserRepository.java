package com.springbootrest.demo.data.repository;

import com.springbootrest.demo.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("select u from User as u where u.userId = :userId")
    User findUserById(@Param("userId") long userId);

    @Query("select u from User as u")
    List<User> findAll();

    @Query("select u.email from User as u where u.email=:email")
    String findByEmail(@Param("email") String email);
}
