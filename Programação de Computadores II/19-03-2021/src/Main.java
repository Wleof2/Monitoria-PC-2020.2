import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Agenda agenda = Agenda.getInstance();

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu sexo (M/F):");
        String sigla = scanner.nextLine();
        sigla = sigla.toUpperCase();
        Sexo sexo = Sexo.getValue(sigla);

        Pessoa pessoa = Pessoa.create(nome, idade, altura, sexo);

        if(pessoa != null) {
            agenda.adicionar(pessoa);
        }
    }
}
