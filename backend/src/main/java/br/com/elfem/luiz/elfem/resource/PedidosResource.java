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

import br.com.elfem.luiz.elfem.models.Pedidos;
import br.com.elfem.luiz.elfem.repository.PedidosRepository;

@RestController
@RequestMapping(value = "/api")
public class PedidosResource {
    
    @Autowired
    PedidosRepository pedidosRepository;

    @GetMapping("/pedidos")
    public List<Pedidos> listPedidos() {
        return pedidosRepository.findAll();
    }

    @PostMapping("/pedidos")
    public Pedidos salvePedidos(@RequestBody Pedidos pedidos) {
        return pedidosRepository.save(pedidos);
    }

    @DeleteMapping("/pedidos")
    public void deletePedidos(@RequestBody Pedidos pedidos) {
        pedidosRepository.save(pedidos);
    }

    @PutMapping("/pedidos")
    public Pedidos updatePedidos(@RequestBody Pedidos pedidos) {
        return pedidosRepository.save(pedidos);
    }

}
