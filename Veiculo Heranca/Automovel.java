package Moto;

public class Automovel extends Veiculo {
    private String motor;
    private String numPortas;

    public Automovel(String marca, String modelo, int ano, String cor, String motor, String numPortas) {
        super(marca, modelo, ano, cor);
        this.motor = motor;
        this.numPortas = numPortas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(String numPortas) {
        this.numPortas = numPortas;
    }
}
