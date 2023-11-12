package med.voll.apirestclinicamedica.domain.consulta.validacoes;

import med.voll.apirestclinicamedica.domain.consulta.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoDeConsulta {
    void validar(DadosAgendamentoConsulta dados);
}
