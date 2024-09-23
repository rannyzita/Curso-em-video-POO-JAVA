package curso_em_video.Caneta;

public class Caneta {
    // public, private e protected são as visibilidades
    public String modelo;
    private String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    // método construtor, sem void 
    public Caneta(String cor, String modelo, float ponta) {
        setCor(cor);
        setModelo(modelo);
        setPonta(ponta);
        // this.cor = cor;
        // this.modelo = modelo;
        // this.ponta = ponta;
    }
    // tem que ser public string pois é str q vai retornar
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void status() {
        System.out.printf("|| Status da caneta ||\n \nModelo: %s\nCor: %s\nPonta: %.2f\nCarga: %d\nTampada: %s\n", this.getModelo(), this.getCor(), this.getPonta(), this.carga, this.getTampado());
    }   

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("\nA caneta está fechada.");
        }
        else {
            System.out.println("\nEstou rabiscando.");
        }
    }

    public void tampar() {
        // nesse caso o c1 vai ficar no lugar do this
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public boolean getTampado() {
        return this.tampada;
    }

}
