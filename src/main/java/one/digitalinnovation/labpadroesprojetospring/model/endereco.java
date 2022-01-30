package one.digitalinnovation.labpadroesprojetospring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * Os atributos modelos foram gerados automaticamente pelos sites abaixos
 * utilizamos JSON para retorno da API do ViaCEP
 *
 * @see <a href="https://www.jsonschema2pojo.org">jsonchema2pojo.org</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 *
 * @author Gotroenks
 * @see <a href=""https://github.com/Gotroenks"GitHub"></a>
 */

@Entity
public class endereco {

    @Id
    private String cep;
    private String lograduro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String ddd;
    private String siafi;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLograduro() {
        return lograduro;
    }

    public void setLograduro(String lograduro) {
        this.lograduro = lograduro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }
}
