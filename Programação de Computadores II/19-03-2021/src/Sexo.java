

public enum Sexo {
    MASCULINO("M"), FEMININO("F");

    String sigla;

    Sexo(String sigla) {
        this.sigla = sigla;
    }

    public static Sexo getValue(String sigla) {
        Sexo[] values = Sexo.values();
        for (int i = 0; i < values.length; i++) {
            if(values[i].sigla.equals(sigla)) {
                return values[i];
            }
        }

        return null;
    }
}
