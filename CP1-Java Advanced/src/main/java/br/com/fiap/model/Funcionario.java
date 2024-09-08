package br.com.fiap.model;

import br.com.fiap.annotation.Coluna;
import br.com.fiap.annotation.Tabela;

@Tabela(nome="TAB_FUNCIONARIO")
public class Funcionario {

    @Coluna(nome="nm_funcionario")
    protected String nome;

    @Coluna(nome="vl_horas_trab")
    protected double horasTrabalhadas;

    @Coluna(nome="vl_valor_pago")
    protected double valorPagoHoras;

    public Funcionario(String nome, double horasTrabalhadas, double valorPagoHoras) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPagoHoras = valorPagoHoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPagoHoras() {
        return valorPagoHoras;
    }

    public void setValorPagoHoras(double valorPagoHoras) {
        this.valorPagoHoras = valorPagoHoras;
    }

    public void imprimirInformacao() {
        System.out.println("Funcionário" +
                "\nNome: " + nome + '\'' +
                "Horas trabalhadas: " + horasTrabalhadas +
                "Valor pago por hora: " + valorPagoHoras);
    }

    public double calcularSalario(){
        return horasTrabalhadas * valorPagoHoras;
    }


}
