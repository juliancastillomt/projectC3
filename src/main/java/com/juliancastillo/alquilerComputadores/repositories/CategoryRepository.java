package com.juliancastillo.alquilerComputadores.repositories;

import com.juliancastillo.alquilerComputadores.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.juliancastillo.alquilerComputadores.repositories.CategoryCRUDRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {

    @Autowired
    private CategoryCRUDRepository categoryCRUDRepository;

    public List<Category> getAll(){
        return (List<Category>) categoryCRUDRepository.findAll();
    }

    public Optional<Category> getById(int id){
        return categoryCRUDRepository.findById(id);
    }

    public Category save(Category c){
        return categoryCRUDRepository.save(c);
    }

    public void delete(Category c){
        categoryCRUDRepository.delete(c);
    }
}
