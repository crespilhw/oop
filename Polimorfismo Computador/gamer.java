package computado;

public class gamer implements InterfaceComputador {

    @Override
    public void ligar() {
        System.out.println("O computador gamer está ligando.");
    }
    @Override
    public void desligar() {
        System.out.println("O computador gamer está desligando.");
    }
    @Override
    public void reiniciar() {
        System.out.println("O computador gamer está reiniciando.");
    }
    @Override
    public void carregandoSistema() {
        System.out.println("O computador gamer está carregando o sistema.");
    }
}
