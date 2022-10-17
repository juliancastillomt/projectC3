package com.juliancastillo.alquilerComputadores.repositories;

import com.juliancastillo.alquilerComputadores.models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.juliancastillo.alquilerComputadores.repositories.MessageCRUDRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class MessageRepository {
    @Autowired
    private MessageCRUDRepository messageCRUDRepository;

    public List<Message> getAll(){
        return (List<Message>) messageCRUDRepository.findAll();
    }

    public Optional<Message> getById(int id){
        return messageCRUDRepository.findById(id);
    }

    public Message save(Message c){
        return messageCRUDRepository.save(c);
    }

    public void delete(Message c){
        messageCRUDRepository.delete(c);
    }

}
