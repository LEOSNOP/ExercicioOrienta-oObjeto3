package Treino;

public class Exec {
    public static void main(String[] args) {
        Transporte t = new Transporte();
        Automovel a = new Automovel();
        Aviao v = new Aviao();

        t.exibir();
        a.exibir();
        v.exibir();

        //t.mover(3);
        //a.mover(8);
        //v.mover(9);

        t.abastecer(4);
        a.abastecer(2);
        v.abastecer(4);
        t.exibir();
        a.exibir();
        v.exibir();
    }
}
