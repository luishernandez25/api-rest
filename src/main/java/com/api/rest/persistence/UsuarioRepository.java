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
          return mapper.toUsers((List<Usuario>)usuarioCrudRepository.findAll());


    }

    @Override
    public Optional<List<User>> getByUserId(String userId){
        return usuarioCrudRepository.findByNombre(userId)
                .map(usuarios -> mapper.toUsers(usuarios));


    }



    @Override
    public User save(User user) {

        Usuario usuario = mapper.toUsuario(user);
        return mapper.toUser(usuarioCrudRepository.save(usuario));
    }
}
