package com.juliancastillo.alquilerComputadores.repositories;

import com.juliancastillo.alquilerComputadores.models.Computer;
import com.juliancastillo.alquilerComputadores.models.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ComputerCRUDRepository extends CrudRepository<Computer, Integer> {
}
