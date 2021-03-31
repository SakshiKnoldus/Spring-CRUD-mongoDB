package com.crud.SpringBootMongo.Controller;

import com.crud.SpringBootMongo.Entity.Book;
import com.crud.SpringBootMongo.Entity.BookUpdatePayload;
import com.crud.SpringBootMongo.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BooksController {

        @Autowired
        private BookService bookService;

        @GetMapping
        public Collection<Book> getBooks() {
                return bookService.getBooks();
        }

        @PostMapping
        public Book postBook(@RequestBody Book book) {
                return bookService.createBook(book);
        }
        @GetMapping(value = "/{id}")
        public Optional<Book> getBookById(@PathVariable("id") int id) {
                return bookService.getBookById(id);
        }

        @DeleteMapping(value = "/{id}")
        public Optional<Book> deleteBookById(@PathVariable("id") int id) {
                return bookService.deleteBookById(id);
        }

        @PutMapping(value = "/{id}")
        public Optional<Book> updateBookById(@PathVariable("id") int id, @RequestBody BookUpdatePayload
                                             bookUpdatePayload) {
                return bookService.updateBookById(id, bookUpdatePayload);
        }

}
