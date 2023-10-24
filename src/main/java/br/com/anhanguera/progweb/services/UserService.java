package br.com.anhanguera.progweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import br.com.anhanguera.progweb.entities.User;
import br.com.anhanguera.progweb.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) throws NotFoundException {
        var user = userRepository.findById(id)
        .orElseThrow(() -> new NotFoundException());
        return user;
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public User update(User user) {
        return userRepository.save(user);
    }

}
