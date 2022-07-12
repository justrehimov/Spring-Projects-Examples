package com.desofme.springbootpagination.api;

import com.desofme.springbootpagination.model.Book;
import com.desofme.springbootpagination.repo.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookRepo bookRepo;
    @GetMapping
    public Page<Book> pagination(@RequestParam("size") Integer size,@RequestParam("page") Integer page){
        Pageable pageable = PageRequest.of(page, size);
        return bookRepo.findAll(pageable);
    }

    @GetMapping("/pageable")
    public Page<Book> pagination(Pageable pageable){
        return bookRepo.findAll(pageable);
    }

    @GetMapping("/slice")
    public Slice<Book> slice(Pageable pageable){
        return bookRepo.findAll(pageable);
    }

    @PostMapping
    public Book save(@RequestBody Book book){
        return bookRepo.save(book);
    }


}
