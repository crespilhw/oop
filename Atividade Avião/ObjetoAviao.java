import java.util.Scanner;
public class ObjetoAviao {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Aviao Aviao1 = new Aviao();
        Aviao Aviao2 = new Aviao();
        Aviao Aviao3 = new Aviao();

        String tipo1, tipo2, tipo3;
        String cor1, cor2, cor3;
        int velocidade1, velocidade2, velocidade3;
        int qtdeAssento1, qtdeAssento2, qtdeAssento3;

        System.out.println("Insira o tipo do avião 1: ");
        tipo1 = ler.nextLine();
        System.out.println("Insira a cor do avião 1: ");
        cor1 = ler.nextLine();
        System.out.println("Insira a velocidade do avião 1: ");
        velocidade1 = ler.nextInt();
        System.out.println("Insira a quantidade de assentos do avião 1: ");
        qtdeAssento1 = ler.nextInt();

        System.out.println("Insira o tipo do avião 2: ");
        tipo2 = ler.nextLine();
        ler.nextLine();
        System.out.println("Insira a cor do avião 2: ");
        cor2 = ler.nextLine();
        System.out.println("Insira a velocidade do avião 2: ");
        velocidade2 = ler.nextInt();
        System.out.println("Insira a quantidade de assentos do avião 2: ");
        qtdeAssento2 = ler.nextInt();

        System.out.println("Insira o tipo do avião 3: ");
        tipo3 = ler.nextLine();
        ler.nextLine();
        System.out.println("Insira a cor do avião 3: ");
        cor3 = ler.nextLine();
        System.out.println("Insira a velocidade do avião 3: ");
        velocidade3 = ler.nextInt();
        System.out.println("Insira a quantidade de assentos do avião 3: ");
        qtdeAssento3 = ler.nextInt();


        Aviao1.setCor(cor1);
        Aviao1.setTipo(tipo1);
        Aviao1.setVelocidade(velocidade1);
        Aviao1.setQtdeAssento(qtdeAssento1);

        Aviao2.setCor(cor2);
        Aviao2.setTipo(tipo2);
        Aviao2.setVelocidade(velocidade2);
        Aviao2.setQtdeAssento(qtdeAssento2);

        Aviao3.setCor(cor3);
        Aviao3.setTipo(tipo3);
        Aviao3.setVelocidade(velocidade3);
        Aviao3.setQtdeAssento(qtdeAssento3);

        System.out.println("---DADOS DO AVIÃO 1---");
        System.out.println("Tipo: " + Aviao1.getTipo());
        System.out.println("Cor: " + Aviao1.getCor());
        System.out.println("Velocidade: " + Aviao1.getVelocidade());
        System.out.println("Quantidade de Assentos: " + Aviao1.getQtdeAssento());

        System.out.println("---DADOS DO AVIÃO 2---");
        System.out.println("Tipo: " + Aviao2.getTipo());
        System.out.println("Cor: " + Aviao2.getCor());
        System.out.println("Velocidade: " + Aviao2.getVelocidade());
        System.out.println("Quantidade de Assentos: " + Aviao2.getQtdeAssento());

        System.out.println("---DADOS DO AVIÃO 3---");
        System.out.println("Tipo: " + Aviao3.getTipo());
        System.out.println("Cor: " + Aviao3.getCor());
        System.out.println("Velocidade: " + Aviao3.getVelocidade());
        System.out.println("Quantidade de Assentos: " + Aviao3.getQtdeAssento());

    }
}
