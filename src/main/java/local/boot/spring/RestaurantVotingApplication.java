package local.boot.spring;

import local.boot.spring.model.Role;
import local.boot.spring.model.User;
import local.boot.spring.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
@AllArgsConstructor
public class RestaurantVotingApplication implements ApplicationRunner {
    private final UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(RestaurantVotingApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {
        userRepository.save(new User("user@gmail.com", "User_First", "User_Last", "password", Set.of(Role.ROLE_USER)));
        userRepository.save(new User("admin@javaops.ru",
                                     "Admin_First",
                                     "Admin_Last",
                                     "admin",
                                     Set.of(Role.ROLE_USER, Role.ROLE_ADMIN)));
        System.out.println(userRepository.findAll());
    }
}
