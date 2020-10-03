/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8_main;

/**
 *
 * @author Gabriel
 */
public class Ex8_ContaBancaria {
    String nomeTitular;
    int numeroConta;
    int numeroAgencia;
    double saldoConta;

    public Ex8_ContaBancaria(String nomeTitular, int numeroConta, int numeroAgencia, double saldoConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldoConta = saldoConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldoConta() {
        return saldoConta;
    }
    
    
    
    
    
}
