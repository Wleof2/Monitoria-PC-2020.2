
public class Agenda {
    private Pessoa[] pessoas;

    public Agenda() {
        this(10);
    }

    private Agenda(int tamanho) {
        pessoas = new Pessoa[tamanho];
    }

    //ARMAZENAR

    public void armazenar(Pessoa pessoa){
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i] == null) {
                pessoas[i] = pessoa;
                break;
            }
        }
    }

    //ARMAZENAR
    //ACOMPLAMENTO ENTRE CLASSES !!

    public void armazenar(String nome, int idade, double altura){
        Pessoa pessoa = Pessoa.getInstance(nome, idade, altura);
        armazenar(pessoa);
    }

    //REMOVER

    public void remover(String nome) {
        for (int i = 0; i < pessoas.length; i++) {
            Pessoa auxPessoa = pessoas[i];
            if(auxPessoa != null) {
                String auxNome = auxPessoa.getNome();
                if(auxNome.equals(nome)) {
                    pessoas[i] = null;
                    break;
                }
            }
        }
    }

    //BUSCAR

    public int buscar(String nome) {
        for (int i = 0; i < pessoas.length; i++) {
            Pessoa auxPessoa = pessoas[i];
            if(auxPessoa != null) {
                String auxNome = auxPessoa.getNome();
                if(auxNome.equals(nome)) {
                    return i;
                }
            }
        }

        return -1;
    }

    //IMPRIMIR

    public void imprimir(int indice) {
        if (indice >= 0 && indice < pessoas.length) {
            Pessoa pessoa = pessoas[indice];
            if (pessoa != null) {
                System.out.println("--------------------------------");
                System.out.println("Nome " + pessoa.getNome());
                System.out.println("Idade " + pessoa.getIdade());
                System.out.println("Altura " + pessoa.getAltura());
                System.out.println("--------------------------------");
            }
        }
    }

    //IMPRIMIR TODOS

    public void imprimir() {
        System.out.println("------- LISTA DE PESSOAS -------");
        for (int i = 0; i < pessoas.length; i++) {
            imprimir(i);
        }
    }

    public static Agenda getInstance(int tamanho) {
        if(tamanho > 0) {
            return new Agenda(tamanho);
        }

        return null;
    }
}
