package com.example.VendasApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class VendasAppApplication {


	@Value("${application.name}")
	private String applicationName;

	@Autowired
	@Cachorro
	private Animal animal;

	@Bean(name ="ExecutarAnimal")
	public CommandLineRunner executar(){
		return args -> {
			this.animal.fazerBarulho();
		};
	}

	@GetMapping("/hello")

	public String HelloWorld(){

		return applicationName;
}

	public static void main(String[] args) {
		SpringApplication.run(VendasAppApplication.class, args);
	}

}
