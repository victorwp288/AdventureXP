package com.example.demo;

import com.example.demo.Model.Booking;
import com.example.demo.Repository.BookingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookingRepositoryTest {

    @Autowired
    BookingRepository bookingRepository;

    @Test
    void getAllBookings1() {
        List<Booking> bookings = bookingRepository.getAllBookings();
        assertEquals(1, bookings.size());
    }

    @Test
    void findBookingById1() {
        int bookingId = bookingRepository.findBookingById(1).getBookingId();
        assertEquals(1, bookingId);
    }

    @Test
    void addBooking1() {
    }

    @Test
    void updateBooking() {
    }

    @Test
    void deleteBooking() {
    }
}