package com.controle.elmaniari.service;

import com.controle.elmaniari.dtos.ComputerDTO;
import com.controle.elmaniari.entities.Computer;
import com.controle.elmaniari.mappers.ComputerMapper;
import com.controle.elmaniari.repositories.ComputerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ComputerManagerAction implements ComputerManager {
    private ComputerRepository computerRepository;
    private ComputerMapper computerMapper;

    public ComputerManagerAction(ComputerRepository computerRepository, ComputerMapper computerMapper) {
        this.computerRepository = computerRepository;
        this.computerMapper = computerMapper;
    }

    @Override
    public List<ComputerDTO> getComputerByProcesseur(String processeur) {
        List<Computer>computers = computerRepository.getComputerByProcesseur(processeur);
        List<ComputerDTO>computerDTOS = new ArrayList<>();
        for(Computer computer : computers)
            {
               computerDTOS.add(computerMapper.fromComputertoComputerDTO(computer));
            }
        return computerDTOS;
    }

    @Override
    public List<ComputerDTO> getComputerByPrice(double price) {
        List<Computer>computers = computerRepository.getComputerByPrice(price);
        List<ComputerDTO>computerDTOS = new ArrayList<>();
        for(Computer computer : computers)
        {
            computerDTOS.add(computerMapper.fromComputertoComputerDTO(computer));
        }
        return computerDTOS;    }

    @Override
    public Computer saveComputer(Computer computer) {
        if(computer != null)
            return computerRepository.save(computer);
        return null;
    }
    @Override
    public Computer deleteComputer(Long id) {
        Computer computer = computerRepository.findById(id).orElseThrow(()-> new RuntimeException("Computer non trouvé"));
        computerRepository.delete(computer);
        return null;
    }
}
