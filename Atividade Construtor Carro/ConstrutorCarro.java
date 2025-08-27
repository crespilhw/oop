package atividades;
import java.util.Scanner;
public class ConstrutorCarro {
    public static void main(String[] args){
        Scanner banana = new Scanner(System.in);
        String placa;
        int numChassi;

        System.out.println("Insira a placa do carro: ");
        placa = banana.nextLine();
        System.out.println("Insira o número do chassi do carro: ");
        numChassi = banana.nextInt();

        Carro carro = new Carro(placa, numChassi);
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Número do chassi" + carro.getNumChassi());
    }

}
