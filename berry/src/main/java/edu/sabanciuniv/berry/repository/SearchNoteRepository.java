package edu.sabanciuniv.berry.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import edu.sabanciuniv.berry.domain.Note;

public interface SearchNoteRepository extends CrudRepository<Note, String> {
	
	@Query("SELECT n FROM Note n where courseName like %:courseName%") 
    List<Note> findByCourseNameContaining(@Param("courseName") String courseName);

}
