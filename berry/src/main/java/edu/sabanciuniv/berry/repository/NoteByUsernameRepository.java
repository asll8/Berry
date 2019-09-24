package edu.sabanciuniv.berry.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import edu.sabanciuniv.berry.domain.Note;

public interface NoteByUsernameRepository extends CrudRepository<Note, String>{
	
	@Query("SELECT n FROM Note n where userID= :userID") 
    List<Note> findTitleById(@Param("userID") String userID);	
}
