package med.voll.apirestclinicamedica.domain.consulta.validacoes;

import med.voll.apirestclinicamedica.domain.ValidacaoException;
import med.voll.apirestclinicamedica.domain.consulta.DadosAgendamentoConsulta;
import med.voll.apirestclinicamedica.domain.paciente.PacienteRepository;

public class ValidadorPacienteAtivo {

    private PacienteRepository repository;

    public void validar(DadosAgendamentoConsulta dados) {
        var pacienteEstaAtivo = repository.findAtivoById(dados.idPaciente());

        if (!pacienteEstaAtivo) {
            throw new ValidacaoException("Consulta não pode ser agendada com paciente inativo");
        }
    }
}
