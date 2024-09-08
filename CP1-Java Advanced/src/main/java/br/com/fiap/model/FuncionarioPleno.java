package br.com.fiap.model;

import br.com.fiap.annotation.Tabela;

@Tabela(nome="TAB_FUNCIONARIO_PLENO")
public class FuncionarioPleno extends Funcionario{

    private static final double bonusPercentual = 0.20; //O acréscimo do funcionário pleno é de 20%

    public FuncionarioPleno(String nome, double horasTrabalhadas, double valorPagoHoras) {
        super(nome, horasTrabalhadas, valorPagoHoras);
    }

    @Override
    public void imprimirInformacao() {
        System.out.println("Funcionário Pleno" +
                "\nNome: " + nome +
                "\nHoras Trabalhadas: " + horasTrabalhadas +
                "\nValor pago por hora: " + valorPagoHoras +
                "\nSalário: R$" + calcularSalario());
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        double bonus = ((int) (horasTrabalhadas / 10)) * (10 * valorPagoHoras * bonusPercentual);
        return salarioBase + bonus;
    }
}
