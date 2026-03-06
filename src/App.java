import java.util.Scanner;

import extras.Validacoes;

public class App {
    public static void main(String[] args) throws Exception {
        String cep = "";
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o CEP: ");
        cep = ler.nextLine();
        if (Validacoes.validarCEP(cep)) {
            System.out.println("CEP válido.");
        } else {
            System.out.println("CEP inválido.");
        }
        System.out.println("Argumento 1: " + args[0]);
        System.out.println("Argumento 2: " + args[1]);
    }
}
