package com.go.BookRentalInventory.repository;

import com.go.BookRentalInventory.endpoint.dto.BookDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

@Component
public class BookInventoryRepositoryImpl implements BookInventoryRepository {

    private final Collection<BookDto> books;

    public BookInventoryRepositoryImpl()
    {
        books = new ArrayList<>();
    }

    @Override
    public BookDto getBook(UUID id) {
        var book = books.stream().filter(x -> x.id().equals(id)).findFirst();
        if (book.isPresent())
        {
            return book.get();
        }

        throw new RuntimeException("Book not found");
    }

    @Override
    public void addBook(BookDto book) {
        books.add(book);
    }

    @Override
    public void delete(UUID id) {
        books.remove(id);
    }

    @Override
    public Collection<UUID> getAllBooks() {
        return books.stream().map(BookDto::id).toList();
    }
}
