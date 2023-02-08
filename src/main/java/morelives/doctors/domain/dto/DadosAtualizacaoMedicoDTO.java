package morelives.doctors.domain.dto;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedicoDTO(
        @NotNull
        Long id,

        String nome,

        String telefone,

        DadosEnderecoDTO endereco) {
}
