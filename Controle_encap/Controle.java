package curso_em_video.Controle_encap;

public class Controle implements Controlador{
    // atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // método especial
    public Controle() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    // setters e getters
    public void setVolume(int v) {
        if (this.getLigado()){
            this.volume = v;
        }
    }

    public void setLigado(boolean l) {
        this.ligado = l;
    }

    public void setTocando(boolean t) {
        this.tocando = t;
    }

    public int getVolume() {
        return this.volume;
    }

    public boolean getLigado() {
        return this.ligado;
    }

    public boolean getTocando() {
        return this.tocando;
    }
    // significa sobreescrever
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.printf("\n\nLigado: %s\nTocando: %s\nVolume: %d\n\n", this.getLigado(), this.getTocando(), this.getVolume());

        for (int i = 0; i < this.getVolume(); i+=10 ) {
            System.out.printf("[]");
        }
        System.out.println("\n");
    }

    @Override
    public void fecharMenu() {
        System.out.println("\nFechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("\nControle desligado.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("\nControle desligado");
        }
    }

    @Override 
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        } else {
            System.out.println("\nControle desligado");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        } else {
            System.out.println("\nControle desligado");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override 
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
}
