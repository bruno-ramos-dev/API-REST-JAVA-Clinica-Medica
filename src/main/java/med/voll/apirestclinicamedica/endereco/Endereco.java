package med.voll.apirestclinicamedica.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
        this.cidade = dados.cidade();
        this.uf = dados.uf();
    }

    public void atualizarInformacoes(DadosEndereco dados) {

        if (dados.logradouro() != null && !dados.logradouro().trim().isEmpty()) {
            this.logradouro = dados.logradouro();
        }

        if (dados.bairro() != null && !dados.bairro().trim().isEmpty()) {
            this.bairro = dados.bairro();
        }

        if (dados.cep() != null && !dados.cep().trim().isEmpty()) {
            this.cep = dados.cep();
        }

        if (dados.numero() != null && !dados.numero().trim().isEmpty()) {
            this.numero = dados.numero();
        }

        if (dados.complemento() != null && !dados.complemento().trim().isEmpty()) {
            this.complemento = dados.complemento();
        }

        if (dados.cidade() != null && !dados.cidade().trim().isEmpty()) {
            this.cidade = dados.cidade();
        }

        if (dados.uf() != null && !dados.uf().trim().isEmpty()) {
            this.uf = dados.uf();
        }
    }
}
