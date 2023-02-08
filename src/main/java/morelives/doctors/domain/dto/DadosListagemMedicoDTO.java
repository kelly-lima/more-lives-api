package morelives.doctors.domain.dto;

import morelives.doctors.domain.Medico;
import morelives.doctors.domain.enums.Especialidade;

public record DadosListagemMedicoDTO(Long id,String nome, String email, String crm, Especialidade especialidade) {

    public DadosListagemMedicoDTO(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
