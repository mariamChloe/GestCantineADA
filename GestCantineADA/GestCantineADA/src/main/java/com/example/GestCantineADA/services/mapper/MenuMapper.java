package com.example.GestCantineADA.services.mapper;

import com.example.GestCantineADA.models.Menu;
import com.example.GestCantineADA.services.dto.MenuDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface MenuMapper {
    Menu toEntity(MenuDTO menuDTO);

    MenuDTO toString(Menu menu);
}
