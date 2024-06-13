package com.example.query1.services;

import com.example.query1.FightRepository.FlightRepository;
import com.example.query1.Flight.Flight;
import com.example.query1.Flight.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> provisioning(){
        List<Flight> flights = new ArrayList<>();
        for(int i = 0; i < 50; i++){
            Flight flight = new Flight();
            flight.setDescription(generatedRandomString());
            flight.setFromAirport(generatedRandomString());
            flight.setToAirport(generatedRandomString());
            flight.setStatus(Status.ONTIME);
            flights.add(flight);
        }
           return flightRepository.saveAll(flights);
    }

    public String generatedRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }

    public List<Flight> getAll(){
        return flightRepository.findAll();
    }
}
