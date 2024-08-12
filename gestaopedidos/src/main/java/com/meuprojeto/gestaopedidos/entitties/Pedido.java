package com.meuprojeto.gestaopedidos.entitties;

public class Pedido {

    private String cpf;
    private String nome;
    private String telefone;
    private ItemPedido itemPedido;
    
    public Pedido(String cpf, String nome, String telefone, ItemPedido itemPedido) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.itemPedido = itemPedido;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ItemPedido getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(ItemPedido itemPedido) {
        this.itemPedido = itemPedido;
    }

    
}
