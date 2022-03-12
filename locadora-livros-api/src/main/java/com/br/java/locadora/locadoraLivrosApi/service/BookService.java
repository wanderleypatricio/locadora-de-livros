package com.br.java.locadora.locadoraLivrosApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.br.java.locadora.locadoraLivrosApi.entity.Book;
import com.br.java.locadora.locadoraLivrosApi.repo.BookRepository;

@Service
@Transactional
public class BookService {
	
	private final BookRepository bookRepository;
	
	@Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long bookId) {
    	bookRepository.deleteById(bookId);
    }
}
