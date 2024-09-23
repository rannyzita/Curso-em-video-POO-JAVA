package curso_em_video.Caneta;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Azul", "Bic cristal", 0.5f);
        // c1.tampada = false; n da certo pois é private
        c1.status();

        // acessando atributos privados por meio dos métodos públicos - a ponta; 
        System.out.printf("\nTenho uma caneta %s com %.2f de ponta.", c1.getModelo(), c1.getPonta());
    }
}
