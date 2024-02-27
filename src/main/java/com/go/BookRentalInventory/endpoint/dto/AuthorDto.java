package com.go.BookRentalInventory.endpoint.dto;

import java.util.UUID;

public record AuthorDto(UUID id, String firstname, String lastName) {}
