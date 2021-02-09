/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_1;

import entidades_exercicio_1.Entidades_Exercicio_1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Exercicio_1 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Entidades_Exercicio_1> lista = new ArrayList<>();
        
        System.out.print("Quantos funcionários serão registrados? ");
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            
            System.out.println();
            System.out.println("Dados empregados #" + (i + 1) + ':');
            
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            
            while (acharId(lista, id)) {
                System.out.println("Esse id já existe! Tente novamente");
                id = sc.nextInt();
            }
            
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();
            
            
            Entidades_Exercicio_1 EE = new Entidades_Exercicio_1(id, nome, salario);
            
            
            lista.add(EE);
        }
        
        System.out.println();
        System.out.print("Digite o id do salário do empregado que terá o salario aumentado: ");
        Integer idSalario = sc.nextInt();
        
        Entidades_Exercicio_1 EE = lista.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);
        
        
        //Integer posicao = acharId(lista, idSalario);
        
        
        if (EE == null) {
            System.out.println("Essa posição não existe!");
        }
        
        else {
            System.out.print("Entre com a porcentagem: ");
            Double porcento = sc.nextDouble();
            //parte da função
            //lista.get(posicao).aumentoSalario(porcento);
            EE.aumentoSalario(porcento);
        }
        
        System.out.println();
        System.out.println("Lista de funcionários: ");
        
        for (Entidades_Exercicio_1 entidades : lista) {
            System.out.println(entidades);
        }
        
        sc.close();
    }
    /**
    //Forma de retornar o id, atravez de função.
    public static Integer acharId(List<Entidades_Exercicio_1> lista, int idSalario) {
        for (int i = 0; i < lista.size(); i++) {
            
            if (lista.get(i).getId() == idSalario) {
                return i;
            }
        }
        
        return null;
    }*/

    public static Boolean acharId(List<Entidades_Exercicio_1> lista, int id) {
        
        Entidades_Exercicio_1 EE = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return EE != null;
    }
}
