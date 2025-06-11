package com.example.bookApplication.Repository;

import com.example.bookApplication.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface BookRepository extends JpaRepository<Book, Integer> {

    public Book findBookByTitle(String title);

    @Transactional
    void deleteByTitle(String book);
}
