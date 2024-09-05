package com.example.GestCantineADA.services.mapper;

import com.example.GestCantineADA.models.Menu;
import com.example.GestCantineADA.services.dto.MenuDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-05T15:33:35+0000",
    comments = "version: 1.5.0.Final, compiler: javac, environment: Java 22.0.2 (Oracle Corporation)"
)
@Component
public class MenuMapperImpl implements MenuMapper {

    @Override
    public Menu toEntity(MenuDTO menuDTO) {
        if ( menuDTO == null ) {
            return null;
        }

        Menu menu = new Menu();

        return menu;
    }

    @Override
    public MenuDTO toString(Menu menu) {
        if ( menu == null ) {
            return null;
        }

        MenuDTO menuDTO = new MenuDTO();

        return menuDTO;
    }
}
