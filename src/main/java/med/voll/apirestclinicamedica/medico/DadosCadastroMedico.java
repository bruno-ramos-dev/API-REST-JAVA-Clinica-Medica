package med.voll.apirestclinicamedica.medico;

import med.voll.apirestclinicamedica.endereco.DadosEndereco;

public record DadosCadastroMedico(
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
        DadosEndereco endereco
) {
}
