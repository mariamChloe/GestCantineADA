package com.example.GestCantineADA.services.impl;

import com.example.GestCantineADA.models.Plat;
import com.example.GestCantineADA.repositories.PlatRepository;
import com.example.GestCantineADA.services.PlatService;
import com.example.GestCantineADA.services.dto.PlatDTO;
import com.example.GestCantineADA.services.mapper.PlatMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class PlatServiceImpl implements PlatService {
    private final PlatRepository platRepository;
    private final PlatMapper platMapper;


    @Override
    public PlatDTO save(PlatDTO platDTO) {

        // Convert DTO to entity
        Plat plat = platMapper.toEntity(platDTO);

        // Save the entity in the database
        plat = platRepository.save(plat);

        // Convert the saved entity back to DTO
        return platMapper.toDto(plat);
    }

    @Override
    public List<PlatDTO> findAll() {
        return null;
    }

    @Override
    public Optional<PlatDTO> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }


}
