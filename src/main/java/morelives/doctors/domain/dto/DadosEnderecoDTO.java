package morelives.doctors.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEnderecoDTO(
                                @NotBlank(message = "Obrigatório informar o logradouro")
                                String logradouro,
                                @NotBlank(message = "Obrigatório informar o bairro")
                                String bairro,
                                @NotBlank(message = "Obrigatório informar CEP")
                                @Pattern(regexp = "\\d{8}")
                                String cep,
                                @NotBlank(message = "Obrigatório informar cidade")
                                String cidade,
                                @NotBlank(message = "Obrigatório informar o estado")
                                String uf,
                                String complemento,
                                @NotBlank(message = "Obrigatório informar o número do local")
                                String numero) {
}
