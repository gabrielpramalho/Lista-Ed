/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex14_listaestatica;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class ListaCompras{
    
    static void imprimeMenu(){
        System.out.println(" ## Lista de Compras ## ");
        System.out.println("1 - Inserir\n2 - Buscar\n3 - Imprimir\n4 - Limpar Lista\n5 - Calcular Total\n0 - Sair");
    }
   
    
    public static double calculoTotal(Ex14_ListaObj l){
        
        double total = 0;
        
        for (int i = 0; i <= l.ultimo; i++) {
            total += l.lista[i].getValor() * l.lista[i].getQuantidade();
        }
        
        return total;
    }
    
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Ex14_ListaObj l = new Ex14_ListaObj();
        int num = 0;
        int op;
        
        while(true){
            imprimeMenu();
            op = tec.nextInt();
            tec.nextLine();
            
            switch (op){
                case 1:
                    System.out.println("Digite o Nome do Produto: ");
                    String nome = tec.nextLine();
                    System.out.println("Digite o Valor: ");
                    double valor = tec.nextDouble();
                    System.out.println("Digite a quantidade: ");
                    int quant = tec.nextInt();
                    
                    No n = new No (nome, valor, quant);
                    l.insere(n);
                    
                    break;
                case 2:
                    System.out.println("Digite o nome: ");
                    String name = tec.nextLine();
                    
                    No search = l.busca(name);
                    
                    System.out.println("Resultado da busca\n"+search.toString());
                    break;
                case 3:
                    l.imprimeLista();
                    break;
                case 4:
                    l.limpaLista();
                    break;
                case 5:
                    double t;
                    t = calculoTotal(l);
                    System.out.println("O total é: "+t);
                    break;
                case 0:
                    num = - 3;
                    break;
            }
            
            if (num == -3){
                break;
            }
            
        }
        
    }
    
}
