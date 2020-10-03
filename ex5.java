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
public class ex5 {
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int numCartao;
        int g[] = new int[13];
        int cont = 0;
        int num;
        System.out.println("Digite o gabarito: ");
        
        for (int i = 0; i < g.length; i++) {
            num = tec.nextInt();
            
            if(num == 1 || num == 2 || num == 3){
               g[i] = num; 
            }    
        }
        
        System.out.println("Digita a quantidade de apostadores");
        
        int apostadores = tec.nextInt();
        
        
        
        for (int i = 0; i < apostadores; i++) {
            System.out.println("Numero do cartao: ");
            numCartao = tec.nextInt();
            int r[] = new int[13];
            
            
            for (int j = 0; j < r.length; j++) {
                num = tec.nextInt();
                if(num == 1 || num == 2 || num == 3){
                   r[j] = num; 
                }
                
                if(g[j] == r[j]){
                    cont++;
                }
            }
            
            if (cont == 13){
                System.out.println("Cartao: "+numCartao+" é o ganhador, parabéns!");
            }else{
                System.out.println("Infelizmente dessa vez não deu");
            }
            
            cont = 0;
        }
        
    }
    
}
