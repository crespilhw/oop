package Empresa;

public class PessoaJuridica extends Funcionario {
    private double valorBruto;
    private double imposto;

    public PessoaJuridica(long id, String nome, String telefone, int matricula, String endereco, double valorBruto, double imposto) {
        super(id,nome,telefone,matricula,endereco);
        this.valorBruto = valorBruto;
        this.imposto = imposto;
    }

    @Override
    public double calculoSalario() {
        return valorBruto*imposto;
    }
}
