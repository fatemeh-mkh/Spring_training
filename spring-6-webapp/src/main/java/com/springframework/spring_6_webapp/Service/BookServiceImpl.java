package com.springframework.spring_6_webapp.Service;

import com.springframework.spring_6_webapp.Repository.BookRepository;
import com.springframework.spring_6_webapp.domain.Book;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
