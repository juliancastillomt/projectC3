package com.juliancastillo.alquilerComputadores.repositories;

import com.juliancastillo.alquilerComputadores.models.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.juliancastillo.alquilerComputadores.repositories.ScoreCRUDRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class ScoreRepository {
    @Autowired
    private ScoreCRUDRepository scoreCRUDRepository;

    public List<Score> getAll(){
        return (List<Score>) scoreCRUDRepository.findAll();
    }

    public Optional<Score> getById(int id){
        return scoreCRUDRepository.findById(id);
    }

    public Score save(Score c){
        return scoreCRUDRepository.save(c);
    }

    public void delete(Score c){
        scoreCRUDRepository.delete(c);
    }
}
