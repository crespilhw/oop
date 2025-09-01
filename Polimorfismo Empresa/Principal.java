package Empresa;

public class Principal {
    public static void main(String[] args) {
        Funcionario horista = new Horista(1,"Renan Takeshi Hiramatsu", "15 8999-1354", 155, "Condominio Horizontes Sorocaba", 33,100);
        Funcionario jornada = new Jornada(2,"Renan Takeshi KagoVara", "15 8999-1354", 154, "Condominio Horizontes Sorocaba", 40, 150);
        Funcionario juridico = new PessoaJuridica(3,"Renan PCD Hiramatsu", "15 8999-1354", 153, "Condominio Horizontes Sorocaba", 10, 250);
        
        System.out.println("Salário Jornada: " + jornada.calculoSalario());
        System.out.println("Salário Horista: " + horista.calculoSalario());
        System.out.println("Salário Pessoa Jurídica: " + juridico.calculoSalario());
    }
}
