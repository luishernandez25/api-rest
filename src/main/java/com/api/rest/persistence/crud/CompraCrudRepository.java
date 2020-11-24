package com.api.rest.persistence.crud;

import com.api.rest.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {

    Optional <List<Compra>> findByIdUsuario (String idUsuario);

}

