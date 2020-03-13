package com.example.demo.Service;

import com.example.demo.Model.Booking;

import java.util.List;

public interface BookingInterface {

    List<Booking> getAllBookings();

    Booking findBookingById(int bookingId);

    int addBooking(Booking booking);

    int updateBooking(Booking booking);

    int deleteBooking(int bookingId);
}
