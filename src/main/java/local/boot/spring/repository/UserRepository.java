package local.boot.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import local.boot.spring.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}