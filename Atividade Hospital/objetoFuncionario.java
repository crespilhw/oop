import java.util.Scanner;
public class objetoFuncionario {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        funcionario funcionario = new funcionario();

        String nome, endereco, cpf, email, telefone, cargo, admissao, demissao, escolaridade, sexo;

        System.out.println("Digite o nome do funcionario: ");
        nome = ler.nextLine();
        System.out.println("Digite o sexo do funcionario: ");
        sexo = ler.nextLine();
        System.out.println("Digite o CPF do funcionario: ");
        cpf = ler.nextLine();
        System.out.println("Digite o endereço do funcionario: ");
        endereco = ler.nextLine();
        System.out.println("Digite o email do funcionario: ");
        email = ler.nextLine();
        System.out.println("Digite o telefone do funcionario: ");
        telefone = ler.nextLine();
        System.out.println("Digite o nível de escolaridade do funcionario: ");
        escolaridade = ler.nextLine();
        System.out.println("Digite o cargo do funcionario: ");
        cargo = ler.nextLine();
        System.out.println("Digite a data de admissão do funcionario: ");
        admissao = ler.nextLine();
        System.out.println("Digite a data de demissão do funcionario: ");
        demissao = ler.nextLine();

        funcionario.setNome(nome);
        funcionario.setEndereco(endereco);
        funcionario.setCpf(cpf);
        funcionario.setTelefone(telefone);
        funcionario.setCargo(cargo);
        funcionario.setAdmissao(admissao);
        funcionario.setDemissao(demissao);
        funcionario.setEmail(email);
        funcionario.setSexo(sexo);
        funcionario.setEscolaridade(escolaridade);

        System.out.println("----Informações do Funcionário----");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Sexo:  " + funcionario.getSexo());
        System.out.println("CPF:  " + funcionario.getCpf());
        System.out.println("Endereço:  " + funcionario.getEndereco());
        System.out.println("Email:  " + funcionario.getEmail());
        System.out.println("Telefone:  " + funcionario.getTelefone());
        System.out.println("Nível de Escolaridade:  " + funcionario.getEscolaridade());
        System.out.println("Cargo:  " + funcionario.getCargo());
        System.out.println("Data de Admissão:  " + funcionario.getAdmissao());
        System.out.println("Data de Demissão:  " + funcionario.getDemissao());

    }
}
