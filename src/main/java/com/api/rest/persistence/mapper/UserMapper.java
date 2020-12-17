package com.api.rest.persistence.mapper;




import com.api.rest.domain.User;
import com.api.rest.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface UserMapper {

    @Mappings({

            @Mapping(source = "id",target ="userId"),
            @Mapping(source = "password",target ="password"),


    })
    User toUser (Usuario usuario);
    List<User> toUsers (List<Usuario> usuarios);

    @InheritInverseConfiguration
    @Mapping(target = "apellidos", ignore = true)
    Usuario toUser (User user);
}
