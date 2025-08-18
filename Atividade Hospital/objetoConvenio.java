import java.util.Scanner;
public class objetoConvenio {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        convenio convenio = new convenio();

        String nome, plano, tarifa;

        System.out.println("Digite o nome do convênio: ");
        nome = ler.nextLine();
        System.out.println("Digite o plano do convenio: ");
        plano = ler.nextLine();
        System.out.println("Digite a tarifa do convenio: ");
        tarifa = ler.nextLine();

        convenio.setNome(nome);
        convenio.setPlano(plano);
        convenio.setTarifa(tarifa);

        System.out.println("---Informações do convênio---");
        System.out.println("Nome: " + convenio.getNome());
        System.out.println("Plano: " + convenio.getPlano());
        System.out.println("Tarifa: " + convenio.getTarifa());

    }
}
