package com.crud.SpringBootMongo.DAO;

import com.crud.SpringBootMongo.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRepository extends MongoRepository<Book, Integer> {

}
