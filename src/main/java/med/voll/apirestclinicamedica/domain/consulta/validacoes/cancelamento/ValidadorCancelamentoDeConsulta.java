package med.voll.apirestclinicamedica.domain.consulta.validacoes.cancelamento;

import med.voll.apirestclinicamedica.domain.consulta.DadosCancelamentoConsulta;

public interface ValidadorCancelamentoDeConsulta {
    void validar(DadosCancelamentoConsulta dados);
}
