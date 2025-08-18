import java.util.Scanner;
public class objetoPaciente {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        paciente paciente = new paciente();

        String nome, endereco, email, escolaridade, cpf, telefone, nascimento;
        char sexo;

        System.out.println("Insira o nome do paciente: ");
        nome = ler.nextLine();
        System.out.println("Insira a data de nascimento do paciente: ");
        nascimento = ler.nextLine();
        System.out.println("Insira o sexo do paciente: ");
        sexo = ler.next().charAt(0);
        ler.nextLine();
        System.out.println("Insira o CPF do paciente: ");
        cpf = ler.nextLine();
        System.out.println("Insira o endereço do paciente: ");
        endereco = ler.nextLine();
        System.out.println("Insira o nível de escolaridade do paciente: ");
        escolaridade = ler.nextLine();
        System.out.println("Insira o email do paciente: ");
        email = ler.nextLine();
        System.out.println("Insira o telefone do paciente: ");
        telefone = ler.nextLine();

        paciente.setNome(nome);
        paciente.setNascimento(nascimento);
        paciente.setSexo(sexo);
        paciente.setCpf(cpf);
        paciente.setEndereco(endereco);
        paciente.setEmail(email);
        paciente.setEscolaridade(escolaridade);
        paciente.setTelefone(telefone);

        System.out.println("----Informações do paciente---- ");
        System.out.println("Nome: " + paciente.getNome());
        System.out.println("Data de nascimento: " + paciente.getNascimento());
        System.out.println("Sexo: " + paciente.getSexo());
        System.out.println("CPF: " + paciente.getCpf());
        System.out.println("Endereço: " + paciente.getEndereco());
        System.out.println("Email: " + paciente.getEmail());
        System.out.println("Telefone: " + paciente.getTelefone());
        System.out.println("Escolaridade: " + paciente.getEscolaridade());

    }
}