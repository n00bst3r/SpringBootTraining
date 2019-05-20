package de.rajic.springboot.training.repository;

import de.rajic.springboot.training.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
