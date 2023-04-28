import java.util.ArrayList;

public class Heroi {
    private int id;
    private String nome;
    private int quantidadeDeMoedasDeOuro;

    public Heroi(int id, String nome, int quantidadeDeMoedasDeOuro) {
        this.id = id;
        this.nome = nome;
        this.quantidadeDeMoedasDeOuro = quantidadeDeMoedasDeOuro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeMoedasDeOuro() {
        return quantidadeDeMoedasDeOuro;
    }

    public void setQuantidadeDeMoedasDeOuro(int quantidadeDeMoedasDeOuro) {
        this.quantidadeDeMoedasDeOuro = quantidadeDeMoedasDeOuro;
    }
}

public class Grupo {
    private ArrayList<Heroi> herois;
    private int totalMoedasDeOuro;

    public Grupo() {
        this.herois = new ArrayList<>();
        this.totalMoedasDeOuro = 0;
    }

    public void adicionarHeroi(Heroi heroi) {
        for (Heroi h : herois) {
            if (h.getId() == heroi.getId()) {
                System.out.println("O herói já está no grupo");
                return;
            }
        }

        herois.add(heroi);
        totalMoedasDeOuro += heroi.getQuantidadeDeMoedasDeOuro();
        System.out.println("O heroi " + heroi.getNome() + " foi adicionado ao grupo!");
    }

    public void removerHeroi(int idHeroi) {
        for (Heroi h : herois) {
            if (h.getId() == idHeroi) {
                herois.remove(h);
                totalMoedasDeOuro -= h.getQuantidadeDeMoedasDeOuro();
                System.out.println("O heroi " + h.getNome() + " foi removido do grupo!");
                return;
            }
        }
        System.out.println("O herói não está no grupo");
    }

    public ArrayList<Heroi> getHerois() {
        return herois;
    }

    public void setHerois(ArrayList<Heroi> herois) {
        this.herois = herois;
    }

    public int getTotalMoedasDeOuro() {
        return totalMoedasDeOuro;
    }

    public void setTotalMoedasDeOuro(int totalMoedasDeOuro) {
        this.totalMoedasDeOuro = totalMoedasDeOuro;
    }
}
