/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex14_listaestatica;

/**
 *
 * @author Gabriel
 */
public abstract class Ex14_ListaEstatica {

   public int prim;
   public int ultimo;
   
   abstract public void insere(No n);
   abstract public void limpaLista();
   abstract public No busca(String s);
   abstract public void imprimeLista();
   abstract public void remove (String r);
    
}
