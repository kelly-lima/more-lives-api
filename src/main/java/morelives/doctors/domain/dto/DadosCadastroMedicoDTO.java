package morelives.doctors.domain.dto;

import morelives.doctors.domain.enums.Especialidade;

public record DadosCadastroMedicoDTO(String nome, String email, String crm, Especialidade especialidade, DadosEnderecoDTO endereco) {

}
