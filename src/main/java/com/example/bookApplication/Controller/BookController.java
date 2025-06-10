package com.example.bookApplication.Controller;

import com.example.bookApplication.Entity.Book;
import com.example.bookApplication.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book/v1")
public class BookController {

    private final BookService bookService ;
    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        Book savedBook = bookService.addBook(book);
        System.out.println("Saved Book"+book);
        return ResponseEntity.ok(savedBook);
    }

    @GetMapping("/getBook/{bookName}")
    public ResponseEntity<Book> getBookByName(@PathVariable ("bookName") String name){
        final Book book = bookService.getBookByName(name);
        System.out.println(book);
        return ResponseEntity.ok(book);
    }

    public ResponseEntity<Book> updateBookGenre(@RequestBody()
}
