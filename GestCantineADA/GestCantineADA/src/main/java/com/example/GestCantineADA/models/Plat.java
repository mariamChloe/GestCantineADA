package com.example.GestCantineADA.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Plat extends Menu {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "summary", nullable = false)
    private String summary;
}
