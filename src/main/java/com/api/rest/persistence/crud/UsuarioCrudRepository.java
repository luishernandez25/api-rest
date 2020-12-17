package com.api.rest.persistence.crud;
import com.api.rest.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;
import java.util.List;

public interface UsuarioCrudRepository extends CrudRepository<Usuario, Integer> {

    Optional <List<Usuario>> findByNombre(String nombre);
}
