package edu.sabanciuniv.berry.repository;

import org.springframework.data.repository.CrudRepository;

import edu.sabanciuniv.berry.domain.School;

public interface SchoolRepository extends CrudRepository<School, Long> {

}