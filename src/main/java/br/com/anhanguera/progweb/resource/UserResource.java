package br.com.anhanguera.progweb.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.anhanguera.progweb.entities.User;
import br.com.anhanguera.progweb.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @Autowired
    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("{id}")
    public User findById(@PathVariable("id") Long id) throws NotFoundException {
        return userService.findById(id);
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        return userService.insert(user);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id) {
        userService.delete(id);
    }

    @PutMapping("{id}")
    public User update(@PathVariable("id") Long id, @RequestBody User user) {
        user.setId(id);
        return userService.update(user);
    }

}
