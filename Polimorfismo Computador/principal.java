package computado;

public class principal {
    public static void main(String[] args) {
        InterfaceComputador gamer = new gamer();
        InterfaceComputador home = new home();

        System.out.println("-- PC GAMER --");
        gamer.ligar();
        gamer.desligar();
        gamer.reiniciar();
        gamer.carregandoSistema();

        System.out.println("-- PC HOME --");
        home.ligar();
        home.desligar();
        home.reiniciar();
        home.carregandoSistema();
    }
}
