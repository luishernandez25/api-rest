package com.api.rest.persistence.mapper;

import com.api.rest.domain.Tecnology;
import com.api.rest.persistence.entity.Tecnologia;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface TecnologyMapper {
    @Mappings({
            @Mapping(source = "idTecnologia", target ="tecnologyId"),
            @Mapping(source = "nombreTecnologia", target ="tecnology"),
            @Mapping(source = "estado", target ="active"),


    })
    Tecnology toTecnology(Tecnologia tecnologia);


    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Tecnologia toTecnologia (Tecnology tecnology);



}
