package com.example.library.service;

import com.example.library.dto.BookDTO;
import com.example.library.model.Book;
import com.example.library.repository.BookRepository;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService (BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public BookDTO save(BookDTO dto) {
        Book book = new Book();
        book.setName(dto.getName());
        book.setDescription(dto.getDescription());

        Book saved = bookRepository.save(book);

        return new BookDTO(saved.getName(), saved.getDescription());
    }

    public void delete(Long id) {
        if (!bookRepository.existsById(id)) {
            throw new IllegalArgumentException("Id Não encontrado, Verifique!");
        }

        bookRepository.deleteById(id);
    }

}