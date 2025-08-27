package pessoa;
import java.util.Scanner;
public class ConstrutorPessoa {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Insira o nome: ");
        nome = ler.nextLine();
        System.out.println("Insira a idade: ");
        idade = ler.nextInt();
        Pessoa jogador = new Pessoa(nome, idade);
        System.out.println(jogador.getNome());
        System.out.println(jogador.getIdade());
    }
}
