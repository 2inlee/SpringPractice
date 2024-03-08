package com.fastcampus.restapidemo.domain.books.service;

import com.fastcampus.restapidemo.domain.books.entity.Book;
import com.fastcampus.restapidemo.domain.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

//    public List<Book> findByAuthorName(String authorName) {
//        return bookRepository.findByAuthorName(authorName);
//    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}