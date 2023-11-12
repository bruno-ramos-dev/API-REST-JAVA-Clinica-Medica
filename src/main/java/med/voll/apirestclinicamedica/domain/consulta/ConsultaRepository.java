package med.voll.apirestclinicamedica.domain.consulta;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    boolean existsByPacienteIdAndDataBetween(
            Long idPaciente,
            LocalDateTime primeiroHorario,
            LocalDateTime ultimoHorario
    );

    boolean existsByMedicoIdAndData(
            Long idMedico,
            LocalDateTime data
    );
}
