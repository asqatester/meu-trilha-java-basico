
public class Conta {
    //variavel da classe conta

    double saldo = 10.0;

    public void sacar(Double valor) {
        //variavel local de método
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo() {
        System.out.println(saldo);//var saldo é global: disponível em toda classe Conta
        System.out.println(novoSaldo);//somente o método sacar conhece a var novoSaldo pois é local	
    }

    public double calcularDividaExponencial() {
        //variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0; // começando a variável com valor zero
        for (int x = 1; x <= 5; x++) {//x variável de escopo de fluxo
		//esta variável será reiniciada a cada execução for
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }
        //escopo de fluxo
        //x e valorCalculado nunca estarão disponíveis fora do for

        return valorMontante;
    }
}
