package atividades;

public class Animal {
    private float tamanho;
    private String cor;

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Animal(float tamanho, String cor){
        this.cor = cor;
        this.tamanho = tamanho;

    }
}
