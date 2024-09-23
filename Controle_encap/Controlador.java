package curso_em_video.Controle_encap;

public interface Controlador {
    // métodos abstratos, ou seja, não to preocupada com o seu processamento ainda  
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();

}
