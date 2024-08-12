package com.meuprojeto.gestaopedidos.entitties;

public class ItemPedido {

    private String itemNome;
    private int quantidade;

    public ItemPedido(String itemNome, int quantidade) {
        this.itemNome = itemNome;
        this.quantidade = quantidade;
    }

    public String getItemNome() {
        return itemNome;
    }

    public void setItemNome(String itemNome) {
        this.itemNome = itemNome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
}
