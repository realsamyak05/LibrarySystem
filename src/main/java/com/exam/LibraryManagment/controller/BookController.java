
package com.exam.LibraryManagment.controller;

import com.exam.LibraryManagment.model.Book;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private List<Book> books = new ArrayList<>();

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        books.add(book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return books;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                return new ResponseEntity<>(b, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book book) {
        for (Book b : books) {
            if (b.getId() == id) {
                b.setTitle(book.getTitle());
                b.setAuther(book.getAuther());
                b.setCategory(book.getCategory());
                b.setAvailableCopies(book.getAvailableCopies());

                return new ResponseEntity<>(b, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                books.remove(b);
                return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Book not found", HttpStatus.NOT_FOUND);
    }
}
