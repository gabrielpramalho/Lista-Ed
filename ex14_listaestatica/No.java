/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex14_listaestatica;


public class No {
    String nomeProduto;
    double valor;
    int quantidade;

    public No(String nomeProduto, double valor, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    
    
    public String toString(){
        return "Nome do Produto: "+nomeProduto+" Valor: "+valor+" Quantidade: "+quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }
    
    
    
    
}

