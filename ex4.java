/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.ed;

import java.util.Scanner;


public class ex4 {
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int vet[] = new int[20];
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = tec.nextInt();
        }  
        
        int aux = 0;
        
        System.out.println("Antes da troca");
        for (int i = 0; i < vet.length; i++) { 
             System.out.print(vet[i]+ " ");       
        }
        
        int j=vet.length-1;
        
        for (int i = 0; i < 10; i++) {
            aux = vet[i];
            vet[i] = vet[j];
            vet[j] = aux;
            j--;
        }
        
        System.out.println("");
        System.out.println("Depois da troca");
        for (int i = 0; i < vet.length; i++) {  
             System.out.print(vet[i]+ " ");
        }
    }
}
