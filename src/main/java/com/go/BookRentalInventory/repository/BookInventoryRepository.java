package com.go.BookRentalInventory.repository;

import com.go.BookRentalInventory.endpoint.dto.BookDto;

import java.util.Collection;
import java.util.UUID;

public interface BookInventoryRepository {
    BookDto getBook(UUID id);

    void addBook(BookDto book);

    void delete(UUID id);

    Collection<UUID> getAllBooks();
}
