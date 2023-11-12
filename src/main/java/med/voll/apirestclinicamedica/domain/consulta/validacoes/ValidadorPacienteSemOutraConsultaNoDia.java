package med.voll.apirestclinicamedica.domain.consulta.validacoes;

import med.voll.apirestclinicamedica.domain.ValidacaoException;
import med.voll.apirestclinicamedica.domain.consulta.ConsultaRepository;
import med.voll.apirestclinicamedica.domain.consulta.DadosAgendamentoConsulta;

public class ValidadorPacienteSemOutraConsultaNoDia {

    private ConsultaRepository repository;

    public void validar(DadosAgendamentoConsulta dados) {
        var primeiroHorario = dados.data().withHour(7);
        var ultimoHorario = dados.data().withHour(18);
        var pacientePossuiOutraConsultaNoDia =
                repository
                        .existsByPacienteIdAndDataBetween(
                                dados.idPaciente(),
                                primeiroHorario,
                                ultimoHorario
                        );

        if (pacientePossuiOutraConsultaNoDia) {
            throw new ValidacaoException("Paciente já possui uma consulta agendada nesse dia");
        }
    }
}
