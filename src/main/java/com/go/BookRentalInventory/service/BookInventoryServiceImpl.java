package com.go.BookRentalInventory.service;

import com.go.BookRentalInventory.endpoint.dto.BookDto;
import com.go.BookRentalInventory.repository.BookInventoryRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
public class BookInventoryServiceImpl implements BookInventoryService {

    @NonNull
    private final BookInventoryRepository bookInventoryRepository;

    public BookInventoryServiceImpl(BookInventoryRepository bookInventoryRepository)
    {
        this.bookInventoryRepository = bookInventoryRepository;
    }

    @Override
    public BookDto getBook(UUID id) {
        return bookInventoryRepository.getBook(id);
    }

    @Override
    public void addBook(BookDto book) {
        bookInventoryRepository.addBook(book);
    }

    @Override
    public void delete(UUID id) {
        bookInventoryRepository.delete(id);
    }

    @Override
    public Collection<UUID> getAllBooks() {
        return null;
    }
}
