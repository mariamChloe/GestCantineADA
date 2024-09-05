package com.example.GestCantineADA.services.mapper;

import com.example.GestCantineADA.models.Plat;
import com.example.GestCantineADA.services.dto.PlatDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface PlatMapper {
    PlatDTO toDto(Plat plat);

    Plat toEntity(PlatDTO platDTO);
}
