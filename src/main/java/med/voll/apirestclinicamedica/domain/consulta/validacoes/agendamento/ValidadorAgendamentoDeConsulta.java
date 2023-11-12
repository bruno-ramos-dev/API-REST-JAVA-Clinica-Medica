package med.voll.apirestclinicamedica.domain.consulta.validacoes.agendamento;

import med.voll.apirestclinicamedica.domain.consulta.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoDeConsulta {
    void validar(DadosAgendamentoConsulta dados);
}
