import java.util.Scanner;
public class objetoAnimal {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);

        animal animal = new animal();

        int idade;
        String nome, especie;
        double peso;

        System.out.println("Insira o nome do animal: ");
        nome = ler.nextLine();
        System.out.println("Insira a espécie do animal: ");
        especie = ler.nextLine();
        System.out.println("Insira a idade do animal: ");
        idade = ler.nextInt();
        System.out.println("Insira o peso do animal: ");
        peso = ler.nextDouble();

        animal.setNome(nome);
        animal.setIdade(idade);
        animal.setEspecie(especie);
        animal.setPeso(peso);

        System.out.println("-----------ANIMAL-----------");
        System.out.println(animal.getNome());
        System.out.println(animal.getEspecie());
        System.out.println(animal.getIdade());
        System.out.println(animal.getPeso());
    }

}
