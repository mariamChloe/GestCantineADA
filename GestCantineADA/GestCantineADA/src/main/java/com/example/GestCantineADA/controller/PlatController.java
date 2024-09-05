package com.example.GestCantineADA.controller;

import com.example.GestCantineADA.models.Plat;
import com.example.GestCantineADA.repositories.PlatRepository;
import com.example.GestCantineADA.services.PlatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;



import java.util.List;

    @Controller
    @RequestMapping("/plat")
    @RequiredArgsConstructor
    public class PlatController {
        private final PlatRepository platRepository; // Inject the PlatRepository
        private final PlatService platService;

        @GetMapping
        public String showPlats(Model model) {
            List<Plat> plats = platRepository.findAll(); // Fetch all plats from the repository
            model.addAttribute("plats", plats); // Add plats to the model
            return "plat"; // Return the name of the Thymeleaf template
        }

        @RequestMapping(value = "/plat/{id}", method = RequestMethod.GET)
        @ResponseBody
        public String getPlat(@PathVariable("id") Long id) {
            // Logic to handle the request and return the appropriate response
            return "Plat with ID " + id;
        }
    }


