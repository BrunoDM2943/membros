package br.com.migresc.membros.service;

import br.com.migresc.membros.model.Membro;
import br.com.migresc.membros.model.Pessoa;
import br.com.migresc.membros.model.Sexo;
import br.com.migresc.membros.repository.MembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruno on 22/01/17.
 */
@RestController
public class MembroRestService {

    @Autowired
    private MembroRepository repository;

    @RequestMapping(method = RequestMethod.GET, path = "/membro/listar")
    public List<Membro> listar() {
        List<Membro> lista = new ArrayList<>();
        Membro membro = new Membro();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Bruno Damasceno Martins");
        pessoa.setSexo(Sexo.M);
        pessoa.setDtNascimento(LocalDate.of(1995, Month.MAY, 10));
        membro.setPessoa(pessoa);
        lista.add(membro);
        return lista;
    }
}
