package com.example.banco;

import com.example.banco.domain.entity.Cliente;
import com.example.banco.domain.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BancoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}
      @Bean
	  public CommandLineRunner init (@Autowired ClienteRepository clientes){
	return args ->{
			clientes.salvar(new Cliente("Douglas"));
			clientes.salvar(new Cliente("Eliseu"));

			List<Cliente> todosClientes = clientes.obterTodos();
			todosClientes.forEach(System.out::println);
		};

	  }
}
