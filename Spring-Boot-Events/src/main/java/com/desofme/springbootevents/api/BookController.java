package com.desofme.springbootevents.api;

import com.desofme.springbootevents.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    ReservationService reservationService;

    @PostMapping
    public void bookReservation(@RequestBody Book book){
        reservationService.publishReservationEvent(book);
        System.out.println("User request processing..." + book);
    }


}
