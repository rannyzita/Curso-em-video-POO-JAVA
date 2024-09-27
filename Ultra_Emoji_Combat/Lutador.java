package curso_em_video.Ultra_Emoji_Combat;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria; // peso leve, medio e pesado
    private int vitorias;
    private int derrotas;
    private int empates;

    // métodos especiais
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    // setters e getters 
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }
    // métodos
    // apresentar
    public void apresentarLutador() {
        System.out.printf("\n\n|| Apresentação do lutador ||\nNome: %s\nNacionalidade: %s\nIdade: %d anos\nAltura: %.2f m\nPeso: %.2f kg\nCategoria: %s\nVitorias: %d\nDerrotas: %d\nEmpates: %d", this.getNome(), this.getNacionalidade(), this.getIdade(), this.getAltura(), this.getPeso(), this.getCategoria(), this.getVitorias(), this.getDerrotas(), this.getEmpates());
    }
    // status
    public void status() {
        // nome, peso e historico de partidas
        System.out.printf("\n\n|| Status ||\nNome: %s\nPeso: %.2f kg\nVitorias: %d\nDerrotas: %d\nEmpates: %d", this.getNome(), this.getPeso(), this.getVitorias(), this.getDerrotas(), this.getEmpates());
    }
    // ganharluta
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    // perderluta
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    // empatar luta
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
