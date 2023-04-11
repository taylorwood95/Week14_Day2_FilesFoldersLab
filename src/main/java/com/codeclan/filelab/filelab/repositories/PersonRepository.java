package com.codeclan.filelab.filelab.repositories;

import com.codeclan.filelab.filelab.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
