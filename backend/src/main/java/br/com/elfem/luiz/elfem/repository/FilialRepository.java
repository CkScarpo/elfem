package br.com.elfem.luiz.elfem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.elfem.luiz.elfem.models.Filiais;

public interface FilialRepository extends JpaRepository<Filiais, Long> {
    
    Filiais findById(long id);

}
