package com.meuprojeto.gestaopedidos.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.meuprojeto.gestaopedidos.entitties.ItemPedido;
import com.meuprojeto.gestaopedidos.entitties.Pedido;
import com.meuprojeto.gestaopedidos.services.PedidoService;

@Controller
public class HomeController {
    
    
    PedidoService pedido_service = new PedidoService();

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/adicionar_pedido")
    public String mostrarFormularioPedido(){
        return "adicionar_pedido";
    }

    
    @PostMapping("/adicionar_pedido")
    public String adicionarPedido(@RequestParam String cpf, 
                                             @RequestParam String nome, 
                                             @RequestParam String telefone, 
                                             @RequestParam String itemNome, 
                                             @RequestParam int quantidade){
        Pedido pedido = new Pedido(cpf, nome, telefone, new ItemPedido(itemNome, quantidade));
        pedido_service.adicionarPedido(pedido);
        return "redirect:/exibir_pedidos";
    }

    @GetMapping("/exibir_pedidos")
    public String exibirPedidos(Model model){
        model.addAttribute("pedidos", pedido_service.listarPedidos());
        return "exibir_pedidos";
    }

    @PostMapping("/remover_pedido")
    public String removerPedido(@RequestParam String cpf){
        pedido_service.removerPedido(cpf);
        return "redirect:/exibir_pedidos";
    }

    @PostMapping("/editar_pedido")
    public String editarPedido(@RequestParam String nome,
                               @RequestParam String telefone, 
                               @RequestParam String cpf, 
                               @RequestParam String itemNome,
                               @RequestParam int quantidade){
        pedido_service.editarPedido(nome, telefone, cpf, itemNome, quantidade);
        return "redirect:/exibir_pedidos";
    }
}
