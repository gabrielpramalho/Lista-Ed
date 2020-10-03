/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.ed;

/**
 *
 * @author Gabriel
 */
public class ex3 {
    
    public static void main(String[] args) {
        int vetor1[] = new int [3];
        int vetor2[] = new int [3];
        
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = i + 1;
        }
        
        for (int i = 0; i < vetor1.length; i++) {
            vetor2[i] = vetor1[i];
            System.out.println(vetor1[i]);
        }
    }
        
}
