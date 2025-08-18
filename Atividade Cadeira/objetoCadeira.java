import java.util.Scanner;
public class objetoCadeira {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        cadeira cadeira = new cadeira();

        String nome, marca, ajustavel;
        double preco;

        System.out.println("Insira o nome da cadeira: ");
        nome = ler.nextLine();
        System.out.println("Insira a marca da cadeira: ");
        marca = ler.nextLine();
        System.out.println("A cadeira é ajustável: ");
        ajustavel = ler.nextLine();
        System.out.println("Insira o preço da cadeira: ");
        preco = ler.nextInt();

        cadeira.setAjustavel(ajustavel);
        cadeira.setMarca(marca);
        cadeira.setNome(nome);
        cadeira.setPreco(preco);

        System.out.println("-- Dados da Cadeira --");
        System.out.println("Nome: " + cadeira.getNome());
        System.out.println("Marca: " + cadeira.getMarca());
        System.out.println("Ajustável: " + cadeira.getAjustavel());
        System.out.println("Preço: " + cadeira.getPreco());
    }
}
