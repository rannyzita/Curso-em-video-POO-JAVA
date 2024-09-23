package curso_em_video.Controle_encap;

public class Main {
    public static void main(String[] args) {
        Controle c1 = new Controle();

        c1.abrirMenu();
        c1.setVolume(100);
        c1.abrirMenu();
        c1.ligarMudo();
        c1.abrirMenu();

        c1.desligarMudo();
        c1.abrirMenu();
        c1.fecharMenu();
    }
}
