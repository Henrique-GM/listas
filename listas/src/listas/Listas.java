/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Henrique
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();
        
        lista.add("Maria");
        lista.add("Alex");
        lista.add("Bob");
        lista.add("Ana");
        
        //tamanho da lista
        System.out.println(lista.size());
        
         for (String x : lista) {
            System.out.println(x);
        }
        System.out.println("----------------------");
       
        //sobrecarga. Adicionando no local escolhido
        lista.add(2, "Marco");
        
        //removendo da lista
        lista.remove("Anna");
        //lista.remove(1);
        
        //removendo da lista que atendão um predicado
        lista.removeIf(x -> x.charAt(0) == 'M');
        for (String x : lista) {
            System.out.println(x);
        }
        
        //encontrando posição do elemento
        System.out.println("Posição do Bob: " + lista.indexOf("Bob"));
        
        //Posição não encontrada
        System.out.println("Posição do Marco: " + lista.indexOf("Marco"));
        System.out.println("----------------------");
        
        //Filtrando na lista.Todo mundo que comessa com a
        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        
        for (String x : resultado) {
            System.out.println(x);
        }
        System.out.println("----------------------");
        
        //encontrando o primeiro elemento comessando com a letra a
        String nome = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(nome);
        System.out.println("----------------------");
        
        //retornando nulo
        String nome2 = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(nome2);
        
    }  
}
