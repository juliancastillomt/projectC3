package com.juliancastillo.alquilerComputadores.repositories;

import com.juliancastillo.alquilerComputadores.models.Reservation;
import com.juliancastillo.alquilerComputadores.models.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface ReservationCRUDRepository extends CrudRepository<Reservation, Integer> {
}
