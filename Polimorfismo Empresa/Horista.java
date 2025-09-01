package Empresa;

public class Horista extends Funcionario {
    private double salarioHora;
    private int horasTrabalhada;

    public Horista(long id, String nome, String telefone, int matricula, String endereco, double salarioHora, int horasTrabalhada) {
        super(id, nome, telefone, matricula, endereco);
        this.salarioHora = salarioHora;
        this.horasTrabalhada = horasTrabalhada;
    }
        @Override
        public double calculoSalario(){
            return salarioHora * horasTrabalhada;

        }
}

