package pl.sdacademy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sdacademy.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> getUserByEmail(String email);
}
