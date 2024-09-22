package com.polarbookstore.catalogservice.domain

class BookAlreadyExistException(isbn: String) : RuntimeException("A book with isbn $isbn already exists")