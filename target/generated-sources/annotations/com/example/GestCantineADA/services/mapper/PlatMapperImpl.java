package com.example.GestCantineADA.services.mapper;

import com.example.GestCantineADA.models.Plat;
import com.example.GestCantineADA.services.dto.PlatDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-05T15:33:35+0000",
    comments = "version: 1.5.0.Final, compiler: javac, environment: Java 22.0.2 (Oracle Corporation)"
)
@Component
public class PlatMapperImpl implements PlatMapper {

    @Override
    public PlatDTO toDto(Plat plat) {
        if ( plat == null ) {
            return null;
        }

        PlatDTO platDTO = new PlatDTO();

        return platDTO;
    }

    @Override
    public Plat toEntity(PlatDTO platDTO) {
        if ( platDTO == null ) {
            return null;
        }

        Plat plat = new Plat();

        return plat;
    }
}
