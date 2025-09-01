package computado;

public class home implements InterfaceComputador {

    @Override
    public void ligar() {
        System.out.println("O computador home está ligando.");
    }
    @Override
    public void desligar() {
        System.out.println("O computador home está desligando.");
    }
    @Override
    public void reiniciar() {
        System.out.println("O computador home está reiniciando.");
    }
    @Override
    public void carregandoSistema() {
        System.out.println("O computador home está carregando o sistema.");
    }
}
