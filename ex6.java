/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.ed;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class ex6 {
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int m[][] = new int[5][5];
        
        int somaLinha = 0;
        int somaColuna = 0;
        int diagonalPrincipal = 0;
        int diagonalSecundaria = 0;
        int somaElementos = 0;
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = tec.nextInt();
                somaElementos += m[i][j];
                
                if(i == 4){
                    somaLinha += m[i][j];
                }
                if(j == 2){
                    somaColuna += m[i][j];
                }
                if (i == j){
                    diagonalPrincipal += m[i][j];
                }
                
                if(i + j == m.length-1){
                    diagonalSecundaria += m[i][j];
                }
      
            }
        }
        
        
        System.out.println("Soma da linha 4 = "+somaLinha);
        System.out.println("Soma da coluna 2 = "+somaColuna);
        System.out.println("Soma da diagonal principal = "+diagonalPrincipal);
        System.out.println("Soma da diagonal secundária = "+diagonalSecundaria);
        System.out.println("Soma de todos elementos = "+somaElementos);
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
    
}
