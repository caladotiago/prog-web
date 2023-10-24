package br.com.anhanguera.progweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anhanguera.progweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
