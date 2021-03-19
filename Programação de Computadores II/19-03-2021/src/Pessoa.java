

public class Pessoa {
    private String nome; //null
    private int idade; //0
    private double altura; //0.0
    private Sexo sexo;

    private Pessoa(String nome, int idade, double altura, Sexo sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if(nome != null) {
            this.nome = nome;
            return true;
        }

        return false;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static Pessoa create(String nome, int idade, double altura, Sexo sexo) {
        if(nome == null || idade <= 0 || altura <= 0 || sexo == null) {
            return null;
        }

        return new Pessoa(nome, idade, altura, sexo);
    }
}
