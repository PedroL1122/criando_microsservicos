package com.example.pedro.vendas.online.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.pedro.vendas.online.domain.Cliente;

@Repository
public interface IClienteRepository  extends MongoRepository<Cliente, String>{

    Optional<Cliente> findByCpf(Long cpf);
}
