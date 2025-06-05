package com.springframework.spring_6_webapp.Controller;

import ch.qos.logback.core.model.Model;
import com.springframework.spring_6_webapp.Service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public String getBooks(ModelAndView model){
        model.addObject("books",bookService.findAll());
        return "books";
    }
}
