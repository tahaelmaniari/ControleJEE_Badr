package com.controle.elmaniari.service;

import com.controle.elmaniari.dtos.ComputerDTO;
import com.controle.elmaniari.entities.Computer;

import java.util.List;

public interface ComputerManager {
    public List<ComputerDTO>getComputerByProcesseur(String proce);
    public List<ComputerDTO>getComputerByPrice(double price);
    public Computer saveComputer(Computer computer);
    public Computer deleteComputer(Long id);
}
