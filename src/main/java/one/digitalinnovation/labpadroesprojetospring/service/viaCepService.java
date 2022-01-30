package one.digitalinnovation.labpadroesprojetospring.service;

import one.digitalinnovation.labpadroesprojetospring.model.endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface viaCepService {

    @GetMapping("/{cep}/json/")
    endereco consultarCep(@PathVariable("cep") String cep);
}
