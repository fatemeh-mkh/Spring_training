package com.springframework.spring_6_webapp.Repository;

import com.springframework.spring_6_webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
