package one.digitalinnovation.labpadroesprojetospring.controller;

import one.digitalinnovation.labpadroesprojetospring.model.cliente;
import one.digitalinnovation.labpadroesprojetospring.service.clienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
public class clienteRestController {

    private clienteService clientS;

    @GetMapping
    public ResponseEntity<Iterable<cliente>> buscarTodos() {
        return ResponseEntity.ok(clientS.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<cliente> buscarId(@PathVariable Long id){
        return ResponseEntity.ok(clientS.buscarId(id));
    }

    @PostMapping
    public ResponseEntity<cliente> inserir(@RequestBody cliente client) {
        clientS.inserir(client);
        return ResponseEntity.ok(client);
    }

    @PutMapping("/{id}")
    public ResponseEntity<cliente> atualizar(@PathVariable Long id, @RequestBody cliente client) {
        clientS.atualizar(id, client);
        return ResponseEntity.ok(client);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        clientS.delete(id);
        return ResponseEntity.ok().build();
    }
}
