package com.go.BookRentalInventory.endpoint.dto;

import java.util.UUID;

public record BookDto (UUID id, String title, String shortDescription, String detailedDescription,  AuthorDto author) {}
