package com.example.GestCantineADA.controller;

import com.example.GestCantineADA.models.Menu;
import com.example.GestCantineADA.repositories.MenuRepository;
import com.example.GestCantineADA.services.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/menu")
@RequiredArgsConstructor
public class MenuController {
    private final MenuRepository menuRepository; // Inject the MenuRepository
    private final MenuService menuService;

    @GetMapping
    public String showMenu(Model model) {
        List<Menu> menus = menuRepository.findAll(); // Fetch all menu items from the repository
        model.addAttribute("menus", menus); // Add menu items to the model
        return "menu"; // Return the name of the Thymeleaf template
    }
}
