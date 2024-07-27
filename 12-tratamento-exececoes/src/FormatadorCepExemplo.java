public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376564");//sete digitos não atende a regra de negócio
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            //e.printStackTrace();
            System.err.println("\"O cep não atende Às regras de negócio.\"");
        }

    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)//aqui está uma regra de negócio
            throw new CepInvalidoException();

        // simulando um cep formatado
        return "23.765-064";
    }
}
