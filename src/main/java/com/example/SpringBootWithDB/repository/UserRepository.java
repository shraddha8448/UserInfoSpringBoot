package com.example.SpringBootWithDB.repository;

import com.example.SpringBootWithDB.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
