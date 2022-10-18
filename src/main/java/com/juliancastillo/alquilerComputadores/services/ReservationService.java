package com.juliancastillo.alquilerComputadores.services;

import com.juliancastillo.alquilerComputadores.models.Reservation;
import com.juliancastillo.alquilerComputadores.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAll(){
        return reservationRepository.getAll();
    }

    public Reservation save(Reservation r){
        return reservationRepository.save(r);
    }

}
