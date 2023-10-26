package br.com.anhanguera.progweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import br.com.anhanguera.progweb.entities.User;
import br.com.anhanguera.progweb.repositories.UserRepository;
import br.com.anhanguera.progweb.services.exceptions.ResourceNotFoundException;

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

    public User findById(Long id) {
        try {
            User user = userRepository.findById(id)
        .orElseThrow(() -> new NotFoundException());
        return user;
        } catch (Exception exception) {
            throw new ResourceNotFoundException();
        }        
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        try {
            userRepository.deleteById(id);
        } catch (Exception exception) {
            throw new ResourceNotFoundException();
        }
    }

    public User update(User user) {
        try {
            findById(user.getId());

            return userRepository.save(user);
        } catch (Exception exception) {
            throw new ResourceNotFoundException();
        }
    }

}
