package com.user_forge.user_forge.repositories;

import com.user_forge.user_forge.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
