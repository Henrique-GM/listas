/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades_exercicio_1;

/**
 *
 * @author Henrique
 */
public class Entidades_Exercicio_1 {
    
    private Integer id;
    private String nome;
    private Double salario;

    public Entidades_Exercicio_1(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }
    
    public void aumentoSalario(Double porcentagem) {
        salario += (salario * porcentagem / 100.00);
    }
    
    @Override   
    public String toString() {
        return id   
            +", "
            +nome
            +", "
            +String.format("%.2f", salario);
    }
}
