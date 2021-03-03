
public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    private Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade > 0) {
            this.idade = idade;
        }
    }

    public void setAltura(double altura) {
        if(altura > 0) {
            this.altura = altura;
        }
    }

    public double getAltura() {
        return altura;
    }

    public static Pessoa getInstance(String nome, int idade, double altura) {
        if(nome != null && idade > 0 && altura > 0) {
            return new Pessoa(nome, idade, altura);
        }

        return null;
    }
}
