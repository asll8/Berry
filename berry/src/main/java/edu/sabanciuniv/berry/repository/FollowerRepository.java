package edu.sabanciuniv.berry.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import edu.sabanciuniv.berry.domain.Follower;



public interface FollowerRepository extends CrudRepository<Follower, Integer> {
	
	@Query("SELECT f FROM Follower f where followerId like %:followerId%") 
    List<Follower> findByUserNameContaining(@Param("follower") List<Follower> followers);

}
