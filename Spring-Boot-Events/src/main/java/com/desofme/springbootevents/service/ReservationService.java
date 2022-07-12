package com.desofme.springbootevents.service;

import com.desofme.springbootevents.event.ReservationCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

@Service
public class ReservationService {

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    public void publishReservationEvent(Book book){
        applicationEventPublisher.publishEvent(new ReservationCreatedEvent(book));
    }

}
