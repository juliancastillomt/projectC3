package com.juliancastillo.alquilerComputadores.repositories;

import com.juliancastillo.alquilerComputadores.models.Score;
import com.juliancastillo.alquilerComputadores.models.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ScoreCRUDRepository extends CrudRepository<Score, Integer>{

}
