package com.finan.orcamento;

import com.finan.orcamento.model.Estoque;
import com.finan.orcamento.model.Gerente;

public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        Gerente gerente1 = new Gerente("João");
        Gerente gerente2 = new Gerente("Maria");

        estoque.adicionarObserver(gerente1);
        estoque.adicionarObserver(gerente2);

        estoque.setPreco(800);
        estoque.setPreco(1200);
    }
}