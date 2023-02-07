package morelives.doctors.domain.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import morelives.doctors.domain.enums.Especialidade;

public record DadosCadastroMedicoDTO(

        @NotBlank(message = "Obrigatório informar nome")
        String nome,

        @NotBlank(message = "Obrigatório informar email")
        @Email
        String email,

        @NotBlank
        String telefone,
        @NotBlank(message = "Obrigatório informar o CRM do médico")
        @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull(message = "Obrigatório informar a especialidade")
        Especialidade especialidade,
        @NotNull @Valid DadosEnderecoDTO endereco) {

}
