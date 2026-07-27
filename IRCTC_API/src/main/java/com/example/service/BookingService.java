package com.example.service;

import com.example.reponse.Ticket;
import com.example.request.Passenger;

public interface BookingService {
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketNumber);

}
