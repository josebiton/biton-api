package com.biton.bitonapi.service;

import com.biton.bitonapi.entity.Autor;

import java.util.List;

public interface AutorService {
    public List<Autor> findAll();
    public Autor findById(Integer id);
    public Autor findByNombres(String Nombre);
}
