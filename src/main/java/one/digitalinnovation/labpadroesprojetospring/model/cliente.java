package one.digitalinnovation.labpadroesprojetospring.model;

import javax.persistence.*;

@Entity
public class cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    @ManyToOne
    private endereco enderec;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public endereco getEnderec() {
        return enderec;
    }

    public void setEnderec(endereco enderec) {
        this.enderec = enderec;
    }
}
