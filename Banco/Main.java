package curso_em_video.Banco;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(false);
        // erro pq n tem conta
        c1.setSaldo(5);

        c1.setDono("Rannyzita");
        System.out.println(c1.getDono());

        c1.abrirConta("CP");
        c1.setNumconta(20);

        // add dinheiro
        c1.depositarConta(10);
        c1.depositarConta(10);
        System.out.println(c1.getSaldo());

        // sacando dinheiro
        c1.sacarConta(10);
        c1.sacarConta(10);
        System.out.println(c1.getSaldo());

        // tentativa de fechar a conta
        c1.fecharConta();

        // registro da conta 
        c1.registroConta();

        // fechamento da conta sucessido
        c1.sacarConta(150);
        System.out.println(c1.getSaldo());
        c1.fecharConta();
        c1.registroConta();
    }
}
