package edu.sabanciuniv.berry.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import edu.sabanciuniv.berry.domain.User;

public interface UserRepository extends CrudRepository<User, String> {
	
	@Query("SELECT u FROM User u where username like %:username%") 
    List<User> findByUserNameContaining(@Param("username") String username);

}
