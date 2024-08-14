public class Fila {
    private int capacidade;
    private int inicio;
    private int fim;
    private int[] dados;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.inicio = 0;
        this.fim = 0;
    }

    public boolean cheia() {
        return (fim + 1) % capacidade == inicio;
    }

    public boolean vazia() {
        return fim == inicio;
    }

    public void insere(int elemento) {
        if (!cheia()) {
            dados[fim] = elemento;
            fim = (fim + 1) % capacidade;
        } else {
            System.out.println("A fila está cheia.");
        }
    }
    public int remove() {
        if (!vazia()) {
            int elemento = dados[inicio];
            inicio = (inicio + 1) % capacidade;
            return elemento;
        } else {
            System.out.println("A fila está vazia.");
            return -1;
        }
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("A fila está vazia.");
        } else {
            int i = inicio;
            while (i != fim) {
                System.out.print(dados[i] + " ");
                i = (i + 1) % capacidade;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Fila fila = new Fila(5);

        fila.insere(10);
        fila.insere(20);
        fila.insere(30);
        fila.insere(40);

        fila.imprime();

        fila.insere(50);

        fila.remove();
        fila.remove();
        fila.imprime();

        fila.remove();
        fila.remove();
        fila.imprime();
    }
}
