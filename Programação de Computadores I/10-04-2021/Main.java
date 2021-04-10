import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o valor em binário:");
        String binario = recebeBin();

        while(binario == null) {
            System.out.println("Valor incorreto! Digite novamente:");
            binario = recebeBin();
        }
    }

    public static String recebeBin() {
        Scanner scanner = new Scanner(System.in);
        String valor = scanner.nextLine();

        for(char caracter: valor.toCharArray()) {
            if(caracter != '1' &&  caracter != '0') {
                return null;
            }
        }

        return valor;
    }
}
