package med.voll.apirestclinicamedica.domain.consulta.validacoes;

import med.voll.apirestclinicamedica.domain.ValidacaoException;
import med.voll.apirestclinicamedica.domain.consulta.ConsultaRepository;
import med.voll.apirestclinicamedica.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoComOutraConsultaNoMesmoHorario implements ValidadorAgendamentoDeConsulta {

    @Autowired
    private ConsultaRepository repository;

    public void validar(DadosAgendamentoConsulta dados) {
        var medicoPossuiOutraConsultaNoMesmoHorario =
                repository
                        .existsByMedicoIdAndData(
                                dados.idMedico(),
                                dados.data()
                        );

        if (medicoPossuiOutraConsultaNoMesmoHorario) {
            throw new ValidacaoException("Médico já possui outra consulta agendada nesse horário!");
        }
    }
}
