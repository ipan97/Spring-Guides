package com.github.ipan97.spring.caching;

public interface BookRepository {
	Book getByIsbn(String isbn);
}
