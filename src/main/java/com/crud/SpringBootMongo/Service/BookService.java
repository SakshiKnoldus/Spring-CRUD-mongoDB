package com.crud.SpringBootMongo.Service;

import com.crud.SpringBootMongo.DAO.BookDao;
import com.crud.SpringBootMongo.Entity.Book;
import com.crud.SpringBootMongo.Entity.BookUpdatePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class BookService {

        @Autowired
        private BookDao bookDao;

        public Collection<Book> getBooks() {
                return bookDao.getBooks();
        }

        public Book createBook(Book book) {
                return bookDao.createBook(book);
        }

        public Optional<Book> getBookById(int id) {
                return bookDao.getBookById(id);
        }

        public Optional<Book> deleteBookById(int id) {
                return bookDao.deleteBookById(id);
        }

        public Optional<Book> updateBookById(int id, BookUpdatePayload bookUpdatePayload) {
                return bookDao.updateBookById(id, bookUpdatePayload);
        }
}
