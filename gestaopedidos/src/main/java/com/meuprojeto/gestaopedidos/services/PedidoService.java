package com.meuprojeto.gestaopedidos.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.meuprojeto.gestaopedidos.entitties.ItemPedido;
import com.meuprojeto.gestaopedidos.entitties.Pedido;

@Service
public class PedidoService {

    List<Pedido> pedidos = new ArrayList<>();

    //Funcao adicionar pedido
    public void adicionarPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    //Funcao remover pedido
    public boolean removerPedido(String cpf){
           for (Pedido pedido : pedidos) {
               if(pedido.getCpf().equals(cpf)){
                   pedidos.remove(pedido);
                   return true;
               }
           }
           return false;
    }

    //Funcao editar pedido
    public void editarPedido(String nome,
                               String telefone, 
                               String cpf, 
                               String itemNome,
                               int quantidade){
        for(Pedido pedido: pedidos){
            if(pedido.getCpf().equals(cpf)){
                pedido.setTelefone(telefone);
                pedido.getItemPedido().setItemNome(itemNome);
                pedido.getItemPedido().setQuantidade(quantidade);
            }
        }
    }

    //Funcao alterar pedido
    public void alterarPedido(String cpf, String nome, String telefone, String itemNome, int quantidade){

    }


    //Funcao listar pedidos
    public List<Pedido> listarPedidos(){
        return pedidos;
    }
}
