import java.util.Scanner;
public class ObjetoAviao {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Aviao Aviao = new Aviao();

        String tipo;
        String cor;
        int velocidade;
        int qtdeAssento;

        System.out.println("Insira o tipo do avião: ");
        tipo = ler.nextLine();
        System.out.println("Insira a cor do avião: ");
        cor = ler.nextLine();
        System.out.println("Insira a velocidade do avião: ");
        velocidade = ler.nextInt();
        System.out.println("Insira a quantidade de assentos do avião: ");
        qtdeAssento = ler.nextInt();

        Aviao.setCor(cor);
        Aviao.setTipo(tipo);
        Aviao.setVelocidade(velocidade);
        Aviao.setQtdeAssento(qtdeAssento);

        System.out.println("---DADOS DO AVIÃO---");
        System.out.println("Tipo: " + Aviao.getTipo());
        System.out.println("Cor: " + Aviao.getCor());
        System.out.println("Velocidade: " + Aviao.getVelocidade());
        System.out.println("Quantidade de Assentos: " + Aviao.getQtdeAssento());

    }
}
