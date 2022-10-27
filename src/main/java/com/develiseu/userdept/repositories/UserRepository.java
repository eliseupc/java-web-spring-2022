package com.develiseu.userdept.repositories;

import com.develiseu.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
