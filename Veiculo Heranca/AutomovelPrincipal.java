package Moto;

public class AutomovelPrincipal {
    public static void main(String[] args){
        Moto moto = new Moto("BMW", "Gs1250", 2025,"Branca", 1250);
        System.out.println(moto.getMarca() +" "+ moto.getModelo());
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Cilindradas: " + moto.getCilindradas());
        System.out.println("----------------------------------------------");
        Automovel automovel = new Automovel("BMW", "M3 Competition", 2025, "Preta", "i  6 3.0 turbo de 510 cv e 66,3 kgfm", "4 portas");
        System.out.println(automovel.getMarca() +" "+ automovel.getModelo());
        System.out.println("Marca: " + automovel.getMarca());
        System.out.println("Modelo: " + automovel.getModelo());
        System.out.println("Ano: " + automovel.getAno());
        System.out.println("Cor: " + automovel.getCor());
        System.out.println("Moto: " + automovel.getMotor());
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Número de Portas: " + automovel.getNumPortas());

    }
}
