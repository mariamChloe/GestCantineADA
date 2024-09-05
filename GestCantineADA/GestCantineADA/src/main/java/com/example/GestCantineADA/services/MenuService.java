package com.example.GestCantineADA.services;

import com.example.GestCantineADA.models.Menu;
import com.example.GestCantineADA.services.dto.MenuDTO;

import java.util.List;

public interface MenuService {
    List<Menu> getAllMenus();

    Menu getMenuById(Long id);

    MenuDTO save(MenuDTO menuDTO);

    Menu createMenu(Menu menu);

    void deleteMenu(Long id);
}
