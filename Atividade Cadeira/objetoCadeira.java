import java.util.Scanner;
public class objetoCadeira {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        cadeira cadeira = new cadeira();
        cadeira cadeira2 = new cadeira();
        cadeira cadeira3 = new cadeira();


        String nome,nome2,nome3, marca,marca2,marca3, ajustavel, ajustavel2,ajustavel3;
        double preco, preco2,preco3;

        System.out.println("Insira o nome da cadeira: ");
        nome = ler.nextLine();
        System.out.println("Insira a marca da cadeira: ");
        marca = ler.nextLine();
        System.out.println("A cadeira é ajustável: ");
        ajustavel = ler.nextLine();
        System.out.println("Insira o preço da cadeira: ");
        preco = ler.nextInt();

        System.out.println("Insira o nome da cadeira: ");
        nome2 = ler.nextLine();
        ler.nextLine();
        System.out.println("Insira a marca da cadeira: ");
        marca2 = ler.nextLine();
        System.out.println("A cadeira é ajustável: ");
        ajustavel2 = ler.nextLine();
        System.out.println("Insira o preço da cadeira: ");
        preco2 = ler.nextInt();

        System.out.println("Insira o nome da cadeira: ");
        nome3 = ler.nextLine();
        ler.nextLine();
        System.out.println("Insira a marca da cadeira: ");
        marca3 = ler.nextLine();
        System.out.println("A cadeira é ajustável: ");
        ajustavel3 = ler.nextLine();
        System.out.println("Insira o preço da cadeira: ");
        preco3 = ler.nextInt();

        cadeira.setAjustavel(ajustavel);
        cadeira.setMarca(marca);
        cadeira.setNome(nome);
        cadeira.setPreco(preco);

        cadeira2.setAjustavel(ajustavel2);
        cadeira2.setMarca(marca2);
        cadeira2.setNome(nome2);
        cadeira2.setPreco(preco2);

        cadeira3.setAjustavel(ajustavel3);
        cadeira3.setMarca(marca3);
        cadeira3.setNome(nome3);
        cadeira3.setPreco(preco3);

        System.out.println("-- Dados da Cadeira 1 --");
        System.out.println("Nome: " + cadeira.getNome());
        System.out.println("Marca: " + cadeira.getMarca());
        System.out.println("Ajustável: " + cadeira.getAjustavel());
        System.out.println("Preço: " + cadeira.getPreco());

        System.out.println("-- Dados da Cadeira 2 --");
        System.out.println("Nome: " + cadeira2.getNome());
        System.out.println("Marca: " + cadeira2.getMarca());
        System.out.println("Ajustável: " + cadeira2.getAjustavel());
        System.out.println("Preço: " + cadeira2.getPreco());

        System.out.println("-- Dados da Cadeira 3 --");
        System.out.println("Nome: " + cadeira3.getNome());
        System.out.println("Marca: " + cadeira3.getMarca());
        System.out.println("Ajustável: " + cadeira3.getAjustavel());
        System.out.println("Preço: " + cadeira3.getPreco());
    }
}
