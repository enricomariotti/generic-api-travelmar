package com.goeuro.providers.travelmar.services;

import com.goeuro.providers.generic.api.v03.model.ReservationRequest;
import com.goeuro.providers.generic.sdk.v03.model.Booking;
import com.goeuro.providers.generic.sdk.v03.services.IBookingServiceV03;

import java.util.List;
import java.util.Optional;

/**
 * Created by enricomariotti on 28.12.17.
 */
public class TravelmarBookingService implements IBookingServiceV03 {
    @Override
    public Booking reserve(ReservationRequest reservationRequest) {
        return null;
    }

    @Override
    public void abortReservation(String s) {

    }

    @Override
    public Booking confirmReservation(String s) {
        return null;
    }

    @Override
    public Optional<Booking> findByBookingId(String s) {
        return null;
    }

    @Override
    public Integer technicalCancellation(String s) {
        return null;
    }

    @Override
    public Integer userCancellation(String s) {
        return null;
    }

    @Override
    public List<Booking> findAll() {
        return null;
    }
}
