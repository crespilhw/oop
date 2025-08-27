package atividades;
import java.util.Scanner;
public class ConstrutorConsulta {
   public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       String data;
       String nomePcnte;
       String nomeDents;

       System.out.println("Insira a data: ");
       data = ler.nextLine();
       System.out.println("Insira o nome do paciente: ");
       nomePcnte = ler.nextLine();
       System.out.println("Insira o nome do dentista: ");
       nomeDents = ler.nextLine();

       Consulta banana = new Consulta(data, nomePcnte, nomeDents);
       System.out.println(banana.getData());
       System.out.println(banana.getNomePcnte());
       System.out.println(banana.getNomeDents());
   }
   }


