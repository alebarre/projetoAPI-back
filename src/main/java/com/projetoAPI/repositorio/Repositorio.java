package com.projetoAPI.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projetoAPI.modelo.Cliente;

@Repository
public interface Repositorio extends CrudRepository<Cliente, Long> { }
