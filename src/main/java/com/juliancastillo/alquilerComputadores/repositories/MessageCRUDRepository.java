package com.juliancastillo.alquilerComputadores.repositories;

import com.juliancastillo.alquilerComputadores.models.Message;
import com.juliancastillo.alquilerComputadores.models.Computer;
import org.springframework.data.repository.CrudRepository;

public interface MessageCRUDRepository extends CrudRepository<Message, Integer> {
}
