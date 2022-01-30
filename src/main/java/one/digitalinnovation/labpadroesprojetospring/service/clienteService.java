package one.digitalinnovation.labpadroesprojetospring.service;

import one.digitalinnovation.labpadroesprojetospring.model.cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente
 * se necessario, podemos ter multiplas implementações dessa mesma interface
 *
 * @author gotroenks
 */

public interface clienteService {

    Iterable<cliente> buscarTodos();
    cliente buscarId(Long id);
    void inserir (cliente client);
    void atualizar(Long id, cliente client);
    void delete (Long id);
}
