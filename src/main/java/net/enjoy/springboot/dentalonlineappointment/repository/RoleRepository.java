package net.enjoy.springboot.dentalonlineappointment.repository;

import net.enjoy.springboot.dentalonlineappointment.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}