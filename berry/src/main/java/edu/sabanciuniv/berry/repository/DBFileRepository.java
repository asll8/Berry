package edu.sabanciuniv.berry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.sabanciuniv.berry.domain.DBFile;

@Repository
public interface DBFileRepository extends JpaRepository<DBFile, String> {

}
