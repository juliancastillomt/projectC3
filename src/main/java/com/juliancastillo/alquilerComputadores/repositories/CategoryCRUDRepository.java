package com.juliancastillo.alquilerComputadores.repositories;

import com.juliancastillo.alquilerComputadores.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCRUDRepository extends CrudRepository<Category, Integer> {

}
