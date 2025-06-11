package com.example.bookApplication.Service;

import com.example.bookApplication.Entity.Book;
import com.example.bookApplication.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    public Book getBookByName(String bookName){
        return bookRepository.findBookByTitle(bookName);
    }

    public Book updateBook(Book book){
        return bookRepository.save(book);
    }

    public void deleteBookByTitle(String book){
         bookRepository.deleteByTitle(book);
    }

    public List<Book> getAllBooks(){
        return  bookRepository.findAll();
    }
}
