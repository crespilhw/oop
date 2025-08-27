package atividades;
import java.util.Scanner;
public class ConstrutorAnimal {
 public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
    String cor;
    float tamanho;
     System.out.println("Insira a cor do animal: ");
     cor = ler.nextLine();
    System.out.println("Insira o tamanho do animal: ");
    tamanho = ler.nextFloat();

    Animal animal = new Animal(tamanho, cor);
    System.out.println(animal.getCor());
    System.out.println(animal.getTamanho());
 }
}
