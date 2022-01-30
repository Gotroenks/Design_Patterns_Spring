package one.digitalinnovation.labpadroesprojetospring.service.impl;

import one.digitalinnovation.labpadroesprojetospring.model.cliente;
import one.digitalinnovation.labpadroesprojetospring.model.clienteRepository;
import one.digitalinnovation.labpadroesprojetospring.model.endereco;
import one.digitalinnovation.labpadroesprojetospring.model.enderecoRepository;
import one.digitalinnovation.labpadroesprojetospring.service.clienteService;
import one.digitalinnovation.labpadroesprojetospring.service.viaCepService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class clienteServiceImpl implements clienteService {

    @Autowired
    clienteRepository client;
    @Autowired
    enderecoRepository enderecoR;
    @Autowired
    viaCepService cepService;

    @Override
    public Iterable<cliente> buscarTodos() {
        return client.findAll();
    }

    @Override
    public cliente buscarId(Long id) {
        Optional<cliente> clienteOptional = client.findById(id);
        return clienteOptional.get();
    }

    @Override
    public void inserir(cliente client) {
        salvarClienteCep(client);
    }

    public void salvarClienteCep(cliente client) {
        String cep = client.getEnderec().getCep();
        endereco ender = enderecoR.findById(Long.valueOf(cep)).orElseGet(() -> {
            endereco novoender = cepService.consultarCep(cep);
            enderecoR.save(novoender);
            return novoender;
        });

        client.setEnderec(ender);
        this.client.save(client);
    }

    @Override
    public void atualizar(Long id, cliente client) {
         Optional<cliente> clienteOptional = this.client.findById(id);
         if(clienteOptional.isPresent())
             salvarClienteCep(client);
    }

    @Override
    public void delete(Long id) {
        this.client.deleteById(id);
    }
}
