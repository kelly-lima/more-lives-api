package morelives.doctors.controller;

import jakarta.validation.Valid;
import morelives.doctors.domain.Medico;
import morelives.doctors.domain.dto.DadosCadastroMedicoDTO;
import morelives.doctors.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedicoDTO dados){
        repository.save(new Medico(dados));
    }

}
