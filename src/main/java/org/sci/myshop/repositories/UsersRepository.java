package org.sci.myshop.repositories;

import java.util.Optional;

import org.sci.myshop.dao.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer>{
    Optional<Users> findByUsername(String username);
}
