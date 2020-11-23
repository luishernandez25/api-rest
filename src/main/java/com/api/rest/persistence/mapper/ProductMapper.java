package com.api.rest.persistence.mapper;

import com.api.rest.domain.Product;
import com.api.rest.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring",uses= {TecnologyMapper.class})
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "idProducto", target = "productId"),
            @Mapping(source = "nombre", target = "productName"),
            @Mapping(source = "nivelComplejidad", target = "complexity"),
            @Mapping(source = "precioVenta", target = "price"),
            @Mapping(source = "cantidadStock", target = "stock"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "tecnologia", target = "tecnology"),
            @Mapping(source = "idTecnologia", target = "tecnologyId"),


    })
    Product toProduct (Producto producto);
    List<Product> toProducts (List<Producto> productos);
    @InheritInverseConfiguration
    Producto toProducto (Product product);
}
