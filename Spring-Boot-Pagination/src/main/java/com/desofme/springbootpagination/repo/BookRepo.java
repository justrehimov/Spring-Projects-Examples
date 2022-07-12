package com.desofme.springbootpagination.repo;

import com.desofme.springbootpagination.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {

}
