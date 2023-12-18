package com.controle.elmaniari.mappers;

import com.controle.elmaniari.dtos.ComputerDTO;
import com.controle.elmaniari.entities.Computer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    private ModelMapper modelMapper = new ModelMapper();
    public Computer fromComputerDTOtoComputer(ComputerDTO computerDTO)
    {
        return modelMapper.map(computerDTO,Computer.class);
    }
    public ComputerDTO fromComputertoComputerDTO(Computer computer)
    {
        return modelMapper.map(computer,ComputerDTO.class);
    }

}
