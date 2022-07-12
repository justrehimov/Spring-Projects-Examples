package com.desofme.springbootevents.api;

public class Book{
    private Long userId;
    private String reservationId;

    public Book(){

    }
    public Book(Long userId, String reservationId){
        this.userId = userId;
        this.reservationId = reservationId;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "userId=" + userId +
                ", reservationId='" + reservationId + '\'' +
                '}';
    }
}