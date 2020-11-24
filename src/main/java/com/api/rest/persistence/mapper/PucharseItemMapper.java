package com.api.rest.persistence.mapper;

import com.api.rest.domain.Purchase;
import com.api.rest.domain.PurchaseItem;
import com.api.rest.persistence.entity.ComprasProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper (componentModel = "spring", uses = {ProductMapper.class})
public interface PucharseItemMapper {

    @Mappings({
            @Mapping(source = "id.idProducto",target ="productId"),
            @Mapping(source = "cantidad",target ="quantity"),
            @Mapping(source = "estado",target ="active")

    })
    PurchaseItem toPurchaseItem (ComprasProducto producto);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "compra", ignore = true),
            @Mapping(target = "producto", ignore = true),
            @Mapping(target = "id.idCompra", ignore = true),
    })
    ComprasProducto toComprasProducto (PurchaseItem item);

}
