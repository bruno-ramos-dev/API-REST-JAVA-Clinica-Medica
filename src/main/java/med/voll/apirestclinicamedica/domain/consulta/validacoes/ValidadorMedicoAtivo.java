package med.voll.apirestclinicamedica.domain.consulta.validacoes;

import med.voll.apirestclinicamedica.domain.ValidacaoException;
import med.voll.apirestclinicamedica.domain.consulta.DadosAgendamentoConsulta;
import med.voll.apirestclinicamedica.domain.medico.MedicoRepository;

public class ValidadorMedicoAtivo {

    private MedicoRepository repository;

    public void validar(DadosAgendamentoConsulta dados) {
        if (dados.idMedico() != null) {
            return;
        }

        var medicoEstaAtivo = repository.findAtivoById(dados.idMedico());

        if (!medicoEstaAtivo) {
            throw new ValidacaoException("Consulta não pode ser agendada com médico inativo");
        }
    }
}
