package net.enjoy.springboot.dentalonlineappointment.repository;

import net.enjoy.springboot.dentalonlineappointment.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    Page<User> findByFirstNameContainingOrLastNameContainingOrEmailContaining(String firstName, String lastName, String email, Pageable pageable);
}