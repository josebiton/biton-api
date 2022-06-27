package com.biton.bitonapi.service.ServiceImp;

import com.biton.bitonapi.entity.Autor;
import com.biton.bitonapi.repository.AutorRepository;
import com.biton.bitonapi.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorSeriviceImp implements AutorService {

    @Autowired
    private AutorRepository repository;

    @Override
    public List<Autor> findAll() {
        return repository.findAll();
    }

    @Override
    public Autor findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Autor findByNombres(String Nombre){
        return repository.findByNombres(Nombre);
    }
}
