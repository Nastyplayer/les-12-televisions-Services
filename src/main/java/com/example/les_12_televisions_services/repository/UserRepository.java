package com.example.les_12_televisions_services.repository;



import com.example.les_12_televisions_services.module.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
