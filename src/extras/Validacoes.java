package extras;
public class Validacoes {
    public static boolean validarCEP(String cep) {
        // Verificar se todos os caracteres são dígitos
        // for (char c : cep.toCharArray()) {
        //     if (!Character.isDigit(c)) {
        //         return false;
        //     }
        // }
        if(!validarTamanho(9, 9, cep) ) return false;
        if(cep.charAt(5) != '-')   return false;
        // ou return validarTamanho(9, 9, cep);
        return true;
    }
    private static boolean validarTamanho(int minimo, int maximo, 
        String valor) {
        if (valor.length() < minimo || valor.length() > maximo) {
            return false;
        }
        return true;
    }
    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem.toUpperCase());
    }
    public void mostrarParImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
    public boolean validarParImpar(int numero) {
        return numero % 2 == 0;
    }
    public void mostrarAutor(){
        System.out.println("Autor: Luciene Rodrigues");
    }
    void fazNada(){}
}
