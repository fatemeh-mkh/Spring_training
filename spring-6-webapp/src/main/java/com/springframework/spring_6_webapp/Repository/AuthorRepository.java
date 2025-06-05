package com.springframework.spring_6_webapp.Repository;

import com.springframework.spring_6_webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
