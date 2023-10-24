package br.com.anhanguera.progweb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import br.com.anhanguera.progweb.entities.User;
import br.com.anhanguera.progweb.repositories.UserRepository;

public class TestConfig implements CommandLineRunner {

    @Autowired
    private final UserRepository userRepository;

    public TestConfig (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        userRepository.saveAll(Arrays.asList(u1, u2));        
    }   
    
}
