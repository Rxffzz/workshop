package com.github.rxffzz.API.Repositories;

import com.github.rxffzz.API.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
