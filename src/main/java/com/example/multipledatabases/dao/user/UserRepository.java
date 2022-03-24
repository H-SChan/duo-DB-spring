package com.example.multipledatabases.dao.user;

import com.example.multipledatabases.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
