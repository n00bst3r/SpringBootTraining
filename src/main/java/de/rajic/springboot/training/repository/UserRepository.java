package de.rajic.springboot.training.repository;

import de.rajic.springboot.training.domain.User;
import org.hibernate.validator.internal.engine.resolver.JPATraversableResolver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
