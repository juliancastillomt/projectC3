package com.juliancastillo.alquilerComputadores.repositories;

import com.juliancastillo.alquilerComputadores.models.Client;
import com.juliancastillo.alquilerComputadores.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface ClientCRUDRepository extends CrudRepository<Client, Integer> {
}
