package edu.sabanciuniv.berry.repository;

import org.springframework.data.repository.CrudRepository;

import edu.sabanciuniv.berry.domain.Note;

public interface NoteRepository extends CrudRepository<Note, Long> {

}