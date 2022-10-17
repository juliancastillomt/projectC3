package com.juliancastillo.alquilerComputadores.repositories;

import com.juliancastillo.alquilerComputadores.models.Computer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ComputerCRUDRepository extends CrudRepository<Computer, Integer> {

    @Query("SELECT c.model, COUNT(c.model) FROM Computer AS c GROUP BY c.model ORDER BY count(c.model) DESC")
    public List<Object[]> countTotalComputerByModel();

}
