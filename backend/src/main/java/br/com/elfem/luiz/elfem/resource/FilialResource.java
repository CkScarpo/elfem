package br.com.elfem.luiz.elfem.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.elfem.luiz.elfem.models.Filiais;
import br.com.elfem.luiz.elfem.repository.FilialRepository;

@RestController
@RequestMapping(value = "/api")
public class FilialResource {
   
    @Autowired
    FilialRepository filialRepository;

    @GetMapping("/filial")
    public List<Filiais> listFiliais() {
        return filialRepository.findAll();
    }

    @PostMapping("/filial")
    public Filiais salveFiliais(@RequestBody Filiais filiais) {
        return filialRepository.save(filiais);
    }

    @DeleteMapping("/filial")
    public void deleteFiliais(@RequestBody Filiais filiais) {
        filialRepository.save(filiais);
    }

    @PutMapping("/filial")
    public Filiais updateFiliais(@RequestBody Filiais filiais) {
        return filialRepository.save(filiais);
    }

}
