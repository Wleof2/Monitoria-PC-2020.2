
public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Pessoa pessoa = Pessoa.getInstance("Maria", 60, 1.70);
        agenda.armazenar(pessoa);

        Pessoa pessoa2 = Pessoa.getInstance("João", 40, 1.80);
        agenda.armazenar(pessoa2);

        agenda.imprimir();

        agenda.remover("Maria");

        agenda.imprimir();
    }
}
