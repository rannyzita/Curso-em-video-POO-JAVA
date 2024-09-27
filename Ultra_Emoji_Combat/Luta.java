package curso_em_video.Ultra_Emoji_Combat;
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador numero_1, Lutador numero_2) {
        if (numero_1.getCategoria().equals(numero_2.getCategoria()) && numero_1 != numero_2) {
            this.aprovada = true;
            this.desafiado = numero_1;
            this.desafiante = numero_2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("\n\n|| DESAFIADO ||");
            this.desafiado.apresentarLutador();
            System.out.println("\n\n|| DESAFIANTE ||");
            this.desafiante.apresentarLutador();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2 
            switch (vencedor) {
                case 0: // empate
                    System.out.println("\nEmpatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // desafiado vence
                    System.out.println("\nVitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // desafiante vence
                    System.out.println("\nVitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        } else {
            System.out.println("\nA luta não pode acontecer.");
        }
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }

}