package com.api.rest.persistence.crud;

import com.api.rest.persistence.entity.Compra;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {

    //@Query (value = "select * from compras A, compras_productos B where  A.id_compra = B.id_compra AND id_usuario= ? ",nativeQuery = true)
    Optional <List<Compra>> findByIdUsuario (String idUsuario);

}

