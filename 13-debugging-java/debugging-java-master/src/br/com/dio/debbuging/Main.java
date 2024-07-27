package br.com.dio.debbuging;

public class Main {// programa Java e C# começa e termina pelo main
    public static void main(String[] args) {
        System.out.println("Iniciou do programa no método main.");
        a();
        System.out.println("Finalizou do programa no método main.");
    }

    static void a() {// não há problema em omitir o public (omtido por default)
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    static void b() {
        System.out.println("Entrou no método b.");
        for (int i = 0; i <= 4; i++)
            System.out.println(i);
        c();
        System.out.println("Finalizou o método b.");
    }

    static void c() {
        System.out.println("Entrou no método c.");
        // Thread.dumpStack();//usa-se qdo se quer fazer explicitamenente o debug. Se a
        // IDE tem debug, não precisa
        System.out.println("Finalizou o método c.");
    }

}
