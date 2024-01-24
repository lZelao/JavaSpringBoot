package com.example.VendasApp.service;

import com.example.VendasApp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.VendasApp.model.Client;

@Service
public class ClientService {

    private ClientRepository repository;

    @Autowired
    public ClientService(ClientRepository repository){
        this.repository = repository;
    }

    public void saveClient(Client client){
        validationClient(client);
        this.repository.persistir(client);
    }

    public void validationClient(Client cliente){

    }
}
