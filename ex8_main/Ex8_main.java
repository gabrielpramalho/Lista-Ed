/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8_main;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Ex8_main {

    
    
    public static void main(String[] args) {
       
        Scanner tec = new Scanner(System.in);
        
        Ex8_Lista l = new Ex8_Lista();
        int TAM = 1;
        
        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o nome do titular");
            String nome = tec.nextLine();
            System.out.println("Digite o numero da conta");
            int numConta = tec.nextInt();
            System.out.println("Digite o numero da agencia");
            int numAgencia = tec.nextInt();
            System.out.println("Digite o saldo");
            double saldo = tec.nextDouble();
            
            Ex8_ContaBancaria novo = new Ex8_ContaBancaria(nome, numConta, numAgencia, saldo);
            
            l.insere(novo);
            
           
            int usuario = l.buscar("Gabriel");
            
            l.depositar(200.50, usuario);
            l.imprimir();
            l.sacar(100.50, usuario);
            l.imprimir();
        }
        
        
        
    }
    
}
