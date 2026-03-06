import java.util.Scanner;

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
    }
}
