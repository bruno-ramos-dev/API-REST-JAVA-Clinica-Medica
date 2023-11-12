package med.voll.apirestclinicamedica.controller;

import jakarta.validation.Valid;
import med.voll.apirestclinicamedica.domain.consulta.DadosAgendamentoConsulta;
import med.voll.apirestclinicamedica.domain.consulta.DadosDetalhamentoConsulta;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @PostMapping
    @Transactional
    public ResponseEntity agendar(@RequestBody @Valid DadosAgendamentoConsulta dados) {
        return ResponseEntity.ok(new DadosDetalhamentoConsulta(null, null, null, null));
    }
}
