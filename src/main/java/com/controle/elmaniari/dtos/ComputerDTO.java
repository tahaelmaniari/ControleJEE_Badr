package com.controle.elmaniari.dtos;

import jakarta.persistence.Entity;
import lombok.*;
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ComputerDTO {
    private String processeur;
    private int ram;
    private String hardDrive;
    private double price;
}
