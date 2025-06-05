package com.springframework.spring_6_webapp.BootStrap;

import com.springframework.spring_6_webapp.Repository.AuthorRepository;
import com.springframework.spring_6_webapp.Repository.BookRepository;
import com.springframework.spring_6_webapp.domain.Author;
import com.springframework.spring_6_webapp.domain.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class bootStrapData implements CommandLineRunner {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public bootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author au= new Author();
        au.getFirst_name("fatemeh");
        au.getLast_name("mokhtari");

        Book bk= new Book();
        bk.setTitle("new best book");
        bk.setIsbn("1234");

        Author saveAuthor=authorRepository.save(au);
        Book bookSave=bookRepository.save(bk);

        saveAuthor.getBooks().add(bk);

        System.out.println("Author count : "+ authorRepository.count());
    }
}
