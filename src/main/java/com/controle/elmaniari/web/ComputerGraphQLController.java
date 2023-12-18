package com.controle.elmaniari.web;

import com.controle.elmaniari.dtos.ComputerDTO;
import com.controle.elmaniari.entities.Computer;
import com.controle.elmaniari.service.ComputerManager;
import com.controle.elmaniari.service.ComputerManagerAction;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ComputerGraphQLController {
    private ComputerManager computerManagerAction;

    public ComputerGraphQLController(ComputerManagerAction computerManagerAction) {
        this.computerManagerAction = computerManagerAction;
    }
    @QueryMapping
    public List<ComputerDTO>getComputerByProcesseur(@Argument String processeur)
    {
        return computerManagerAction.getComputerByProcesseur(processeur);
    }
    @QueryMapping
    public List<ComputerDTO>getComputerByPrice(@Argument double price)
    {
        return computerManagerAction.getComputerByPrice(price);
    }
    @MutationMapping
    public Computer saveComputer(@Argument Computer computer)
    {
        return computerManagerAction.saveComputer(computer);
    }
    @MutationMapping
    public Computer deleteComputer(@Argument Long id)
    {
        return computerManagerAction.deleteComputer(id);
    }
}
