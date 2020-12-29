package br.com.elfem.luiz.elfem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.elfem.luiz.elfem.models.Pedidos;

public interface PedidosRepository extends JpaRepository<Pedidos, Long> {
    
    Pedidos findById(long id);

}
