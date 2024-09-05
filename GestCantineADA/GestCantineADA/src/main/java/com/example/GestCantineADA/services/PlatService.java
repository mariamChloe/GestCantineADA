package com.example.GestCantineADA.services;

import com.example.GestCantineADA.services.dto.PlatDTO;
import java.util.List; // Import the List class
import java.util.Optional; // Import the Optional class

public interface PlatService {
    PlatDTO save(PlatDTO platDTO);

    List<PlatDTO> findAll(); // Correct usage of List

    Optional<PlatDTO> findOne(Long id); // Correct usage of Optional

    void delete(Long id);
}
