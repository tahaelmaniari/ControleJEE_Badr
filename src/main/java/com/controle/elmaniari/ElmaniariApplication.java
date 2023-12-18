package com.controle.elmaniari;
import com.controle.elmaniari.entities.Computer;
import com.controle.elmaniari.repositories.ComputerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ElmaniariApplication {
	public static void main(String[] args) {
		SpringApplication.run(ElmaniariApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ComputerRepository computerRepository)
	{
		return args -> {
			List<Computer>computers = List.of(
			new Computer("Intel",4,"Hard Drive",8000,"MAC Address"),
					new Computer("Intel 1",6,"Hard Drive 1",9000,"MAC Address 2"),
					new Computer("Intel 2",8,"Hard Drive 3",12000,"MAC Address 3")
					);
			computerRepository.saveAll(computers);
		};
	}
}
