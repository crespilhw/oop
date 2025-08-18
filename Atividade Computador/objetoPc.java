import java.util.Scanner;
public class objetoPc {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        pc pc1 = new pc();
        pc pc2 = new pc();
        pc pc3 = new pc();

        String cpu1, cpu2, cpu3;
        String gpu1, gpu2, gpu3;
        String ram1, ram2, ram3;
        String placamae1, placamae2, placamae3;
        String armazenamento1, armazenamento2, armazenamento3;
        String gabinete1, gabinete2, gabinete3;
        String fonte1, fonte2, fonte3;

        System.out.println("Insira o processador do 1° computador: ");
        cpu1 = ler.nextLine();
        System.out.println("Insira a placa de vídeo do 1° computador: ");
        gpu1 = ler.nextLine();
        System.out.println("Insira a memória ram do 1° computador: ");
        ram1 = ler.nextLine();
        System.out.println("Insira a placa mãe do 1° computador: ");
        placamae1 = ler.nextLine();
        System.out.println("Insira o armazenamento do 1° computador: ");
        armazenamento1 = ler.nextLine();
        System.out.println("Insira a fonte do 1° computador: ");
        fonte1 = ler.nextLine();
        System.out.println("Insira o gabinete do 1° computador: ");
        gabinete1 = ler.nextLine();

        System.out.println("Insira o processador do 2° computador: ");
        cpu2 = ler.nextLine();
        System.out.println("Insira a placa de vídeo do 2° computador: ");
        gpu2 = ler.nextLine();
        System.out.println("Insira a memória ram do 2° computador: ");
        ram2 = ler.nextLine();
        System.out.println("Insira a placa mãe do 2° computador: ");
        placamae2 = ler.nextLine();
        System.out.println("Insira o armazenamento do 2° computador: ");
        armazenamento2 = ler.nextLine();
        System.out.println("Insira a fonte do 2° computador: ");
        fonte2 = ler.nextLine();
        System.out.println("Insira o gabinete do 2° computador: ");
        gabinete2 = ler.nextLine();

        System.out.println("Insira o processador do 3° computador: ");
        cpu3 = ler.nextLine();
        System.out.println("Insira a placa de vídeo do 3° computador: ");
        gpu3 = ler.nextLine();
        System.out.println("Insira a memória ram do 3° computador: ");
        ram3 = ler.nextLine();
        System.out.println("Insira a placa mãe do 3° computador: ");
        placamae3 = ler.nextLine();
        System.out.println("Insira o armazenamento do 3° computador: ");
        armazenamento3 = ler.nextLine();
        System.out.println("Insira a fonte do 3° computador: ");
        fonte3 = ler.nextLine();
        System.out.println("Insira o gabinete do 3° computador: ");
        gabinete3 = ler.nextLine();

        pc1.setGpu(gpu1);
        pc1.setCpu(cpu1);
        pc1.setRam(ram1);
        pc1.setPlacamae(placamae1);
        pc1.setArmazenamento(armazenamento1);
        pc1.setFonte(fonte1);
        pc1.setGabinete(gabinete1);

        pc2.setGpu(gpu2);
        pc2.setCpu(cpu2);
        pc2.setRam(ram2);
        pc2.setPlacamae(placamae2);
        pc2.setArmazenamento(armazenamento2);
        pc2.setFonte(fonte2);
        pc2.setGabinete(gabinete2);

        pc3.setGpu(gpu3);
        pc3.setCpu(cpu3);
        pc3.setRam(ram3);
        pc3.setPlacamae(placamae3);
        pc3.setArmazenamento(armazenamento3);
        pc3.setFonte(fonte3);
        pc3.setGabinete(gabinete3);

        System.out.println("---- CONFIGURAÇÕES DO 1° COMPUTADOR ----");
        System.out.println("Processador: " + pc1.getCpu());
        System.out.println("Placa de vídeo: " + pc1.getGpu());
        System.out.println("Memória RAM: " + pc1.getRam());
        System.out.println("Placa mãe: " + pc1.getPlacamae());
        System.out.println("Armazenamento: " + pc1.getArmazenamento());
        System.out.println("Fonte: " + pc1.getFonte());
        System.out.println("Gabinete: " + pc1.getGabinete());

        System.out.println("---- CONFIGURAÇÕES DO 2° COMPUTADOR ----");
        System.out.println("Processador: " + pc2.getCpu());
        System.out.println("Placa de vídeo: " + pc2.getGpu());
        System.out.println("Memória RAM: " + pc2.getRam());
        System.out.println("Placa mãe: " + pc2.getPlacamae());
        System.out.println("Armazenamento: " + pc2.getArmazenamento());
        System.out.println("Fonte: " + pc2.getFonte());
        System.out.println("Gabinete: " + pc2.getGabinete());

        System.out.println("---- CONFIGURAÇÕES DO 3° COMPUTADOR ----");
        System.out.println("Processador: " + pc3.getCpu());
        System.out.println("Placa de vídeo: " + pc3.getGpu());
        System.out.println("Memória RAM: " + pc3.getRam());
        System.out.println("Placa mãe: " + pc3.getPlacamae());
        System.out.println("Armazenamento: " + pc3.getArmazenamento());
        System.out.println("Fonte: " + pc3.getFonte());
        System.out.println("Gabinete: " + pc3.getGabinete());
    }
}
