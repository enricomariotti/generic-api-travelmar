package com.goeuro.providers.travelmar.services;

import org.apache.axis2.AxisFault;
import reservation.GetScaliDocument;
import reservation.GetScaliResponseDocument;
import reservation.ReservationStub;

import java.rmi.RemoteException;

class TravelmarBookingServiceTest {

    public static void main(String[] args) throws RemoteException {
        ReservationStub stub = new ReservationStub();
        GetScaliResponseDocument scali = stub.getScali(GetScaliDocument.Factory.newInstance());
        System.out.println(scali);

    }

}