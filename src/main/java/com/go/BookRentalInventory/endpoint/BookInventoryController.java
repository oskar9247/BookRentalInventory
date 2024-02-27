package com.go.BookRentalInventory.endpoint;

import com.go.BookRentalInventory.endpoint.dto.BookDto;
import com.go.BookRentalInventory.service.BookInventoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.UUID;

@RestController
@RequestMapping("v1/books")
public class BookInventoryController {

    private final BookInventoryService bookInventoryService;

    public BookInventoryController(BookInventoryService bookInventoryService)
    {
        this.bookInventoryService = bookInventoryService;
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    @ResponseBody
    public BookDto getBook(@PathVariable UUID id) {
        return bookInventoryService.getBook(id);
    }

    @GetMapping(value = "/", produces = "application/json")
    @ResponseBody
    public Collection<UUID> getBooks() {
        return bookInventoryService.getAllBooks();
    }

    @PostMapping(value = "/add/", produces = "application/json")
    public ResponseEntity addBook(@RequestBody BookDto book) {
        bookInventoryService.addBook(book);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PostMapping(value = "/delete/{id}", produces = "application/json")
    public ResponseEntity deleteBook(@PathVariable UUID id) {
        bookInventoryService.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
