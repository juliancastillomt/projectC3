package com.juliancastillo.alquilerComputadores.repositories;

import com.juliancastillo.alquilerComputadores.models.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.juliancastillo.alquilerComputadores.repositories.ReservationCRUDRepository;
import org.springframework.data.repository.CrudRepository;


import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {
    @Autowired
    private ReservationCRUDRepository reservationCRUDRepository;

    public List<Reservation> getAll(){
        return (List<Reservation>) reservationCRUDRepository.findAll();
    }

    public Optional<Reservation> getById(int id){
        return reservationCRUDRepository.findById(id);
    }

    public Reservation save(Reservation c){
        return reservationCRUDRepository.save(c);
    }

    public void delete(Reservation c){
        reservationCRUDRepository.delete(c);
    }
}
