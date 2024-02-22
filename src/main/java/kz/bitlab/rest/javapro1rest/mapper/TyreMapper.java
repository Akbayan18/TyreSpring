package kz.bitlab.rest.javapro1rest.mapper;


import kz.bitlab.rest.javapro1rest.dto.TyreDto;
import kz.bitlab.rest.javapro1rest.model.Tyre;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TyreMapper {

    @Mapping(source = "name", target = "tyreName")
    @Mapping(source = "profile", target = "tyreProfile")
    TyreDto toDto(Tyre tyre);


    @Mapping(source = "tyreName", target = "name")
    @Mapping(source = "tyreProfile", target = "profile")
    Tyre toEntity(TyreDto tyreDto);

}
