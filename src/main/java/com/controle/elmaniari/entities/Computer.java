package com.controle.elmaniari.entities;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Computer {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPc;
    private String processeur;
    private int ram;
    private String hardDrive;
    private double price;
    @Transient
    private String macAddress;

    public Computer(String processeur, int ram, String hardDrive, double price, String macAddress) {
        this.processeur = processeur;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.price = price;
        this.macAddress = macAddress;
    }
}
