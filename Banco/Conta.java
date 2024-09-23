package curso_em_video.Banco;

public class Conta {
    // atributos e sua visibilidade
    public int num_conta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // construtor somente de status para testar os setters e getters e se quiser...
    public Conta(boolean status) {
        this.status = status;
    }

    // construtor
    public Conta(int num_conta, String tipo, String dono, float saldo,  Boolean status) {
        this.num_conta = num_conta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = false;
    }

    public int getNumconta() {
        return this.num_conta;
    }

    public void setNumconta(int num_conta) {
        this.num_conta = num_conta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        if (getStatus()) {
            this.saldo += saldo;
        } else {
            System.out.println("\nAbra uma conta");
        } 
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    // abrir
    // temos que saber se é poupança (ganha 150 reais) ou corrente (ganha 50 reais)
    public void abrirConta(String tipo) {
        // set
        setTipo(tipo);
        setStatus(true);
        if (tipo == "CC") {
            this.setSaldo(50);
            System.out.println("\nA sua conta corrente foi criada com sucesso!");
        } else if (tipo == "CP") {
            this.setSaldo(150);
            System.out.println("\nA sua conta poupança foi criada com sucesso!");
        } else {
            System.out.println("\nO tipo da conta não existe nesse sistema.");
        }
    }
    // fechar 
    // tem que ter o saldo vazio e não ter saldo negativo
    public void fecharConta() {
        if (getStatus()) {
            if (saldo > 0) {
                System.out.println("\nA conta tem dinheiro.");
            } else if (saldo < 0) {
                System.out.println("A conta está em débito");
            } else {
                status = false;
                System.out.println("Conta fechada com sucesso");
            }
        } else {
            System.out.println("\nA conta já está fechada.");
        }
    }

    // depositar 
    public void depositarConta(float dinheiro) {
        if (getStatus()) {
            if (dinheiro >= 0) {
                this.setSaldo(dinheiro);
            } else {
                System.out.println("\nDigite um valor positivo.");
            }
        } else {
            System.out.println("\nAbra a sua conta.");
        }
    }

    // sacar
    public void sacarConta(float dinheiro) {
        if (getStatus()){
            if (this.getSaldo() >= dinheiro) {
                this.setSaldo(this.getSaldo() - dinheiro);
                // set.saldo(get.saldo() - dinheiro)
            } else {
                System.out.println("\nImpossível sacar essa quantia.");
            }
        } else {
            System.out.println("\nAbra a sua conta.");
        }
    }

    // pagar mensal
    // tipo corrente == 12 reais
    // tipo poupança == 5 reais
    public void pagarMensal() {
        float valor = 0;

        if (this.getTipo() == "CC") {
            valor = 12;
            if (getStatus()) {
                if (this.getSaldo() > valor) {
                    System.out.println("\nVocê precisa pagar 12 reais ao mês.");
                } else {
                    System.out.println("\nSaldo insuficiente.");
                }
            }
        } else if (this.getTipo() == "CP") {
            valor = 5;
            if (getStatus()) {
                if (this.getSaldo() > valor) {
                    System.out.println("\nVocê precisa pagar 12 reais ao mês.");
                } else {
                    System.out.println("\nSaldo insuficiente.");
                }
            }
        }
    }

    public void registroConta() {
        System.out.printf("\n\n||Registro da conta ||\n\nNúmero da conta: %d\nTipo: %s\nDono(a): %s\nSaldo: %.2f\nStatus: %s\n\n", this.getNumconta(), this.getTipo(), this.getDono(), this.getSaldo(), this.getStatus());
    }
}
