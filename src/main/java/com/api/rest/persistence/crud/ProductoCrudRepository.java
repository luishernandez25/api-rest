package com.api.rest.persistence.crud;

import com.api.rest.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> findByidTecnologiaOrderByNombreAsc(int idTecnologia);
    Optional <List<Producto>> findBycantidadStockLessThanAndEstado(int cantidadStock,boolean estado);
}
