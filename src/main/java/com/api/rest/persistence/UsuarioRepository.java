package com.api.rest.persistence;


import com.api.rest.domain.User;
import com.api.rest.domain.repository.UserRepository;
import com.api.rest.persistence.crud.UsuarioCrudRepository;
import com.api.rest.persistence.entity.Usuario;
import com.api.rest.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UsuarioRepository implements UserRepository {


    @Autowired
    private UsuarioCrudRepository usuarioCrudRepository;

    @Autowired
    public UserMapper mapper;

    @Override
    public List<User> getAll(){
        List <Usuario> usuarios = (List<Usuario>) usuarioCrudRepository.findAll();
        return mapper.toUsers(usuarios);


    }

    @Override
    public Optional<List<User>> getByUser(String id) {
        List<Usuario> usuarios = usuarioCrudRepository.findByidOrderByNombreAsc(id);
        return Optional.of(mapper.toUsers(usuarios));
    }

    @Override
    public User save(User user) {
        Usuario usuario = mapper.toUser(user);
        return mapper.toUser(usuarioCrudRepository.save(usuario));
    }
}
