package med.voll.apirestclinicamedica.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.apirestclinicamedica.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
