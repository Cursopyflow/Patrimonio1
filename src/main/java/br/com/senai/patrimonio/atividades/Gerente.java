package br.com.senai.patrimonio.atividades;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {

        super(nome, salarioBase);
    }

    // TODO: Sobrescrever o método calcularBonificacao() usando @Override
    // Regra: gerentes recebem 20% do salário base como bonificação (salarioBase * 0.20)

    @Override
    public double calcularBonificacao() {
        // Implemente aqui
        return getSalarioBase() * 0.20;
    }
}
