
public class Agenda {
    private Pessoa[] pessoas;
    private static Agenda instance;

    private Agenda() {
        pessoas = new Pessoa[10];
    }

    public boolean adicionar(Pessoa pessoa) {
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i] == null) {
                pessoas[i] = pessoa;
                return true;
            }
        }

        return false;
    }

    public void excluir() {

    }

    public static Agenda getInstance() {
        if(instance == null) {
            instance = new Agenda();
        }

        return instance;
    }
}
