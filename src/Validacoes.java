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
    public static boolean validarTamanho(int minimo, int maximo, 
        String valor) {
        if (valor.length() < minimo || valor.length() > maximo) {
            return false;
        }
        return true;
    }
}
