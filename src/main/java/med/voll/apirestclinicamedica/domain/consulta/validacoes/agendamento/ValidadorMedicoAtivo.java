package med.voll.apirestclinicamedica.domain.consulta.validacoes.agendamento;

import med.voll.apirestclinicamedica.domain.ValidacaoException;
import med.voll.apirestclinicamedica.domain.consulta.DadosAgendamentoConsulta;
import med.voll.apirestclinicamedica.domain.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoAtivo implements ValidadorAgendamentoDeConsulta {

    @Autowired
    private MedicoRepository repository;

    public void validar(DadosAgendamentoConsulta dados) {
        if (dados.idMedico() == null) {
            return;
        }

        var medicoEstaAtivo = repository.findAtivoById(dados.idMedico());

        if (!medicoEstaAtivo) {
            throw new ValidacaoException("Consulta não pode ser agendada com médico inativo");
        }
    }
}
