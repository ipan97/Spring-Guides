package com.github.ipan97.spring.caching;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class SimpleBookRepository implements BookRepository {

	@Override
	@Cacheable("books")
	public Book getByIsbn(String isbn) {
		// TODO Auto-generated method stub
		simulateSlowService();
		return new Book(isbn, "Some Book");
	}

	private void simulateSlowService() {
		try {
			long time = 3000L;
			Thread.sleep(time);
		} catch (InterruptedException ie) {
			throw new IllegalStateException();
		}
	}

}
