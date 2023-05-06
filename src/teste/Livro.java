package teste;

public class Livro {

    private String nome;
    private String isbn;
    private int anoLancamento;
    private String nomeAutor;

    public Livro(String nome, String isbn, int anoLancamento, String nomeAutor) {
        this.nome = nome;
        this.isbn = isbn;
        this.anoLancamento = anoLancamento;
        this.nomeAutor = nomeAutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    @Override
    public String toString() {
        return "\nLivro{" +
                "nome='" + nome + '\'' +
                ", isbn='" + isbn + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", nomeAutor='" + nomeAutor + '\'' +
                '}' + "\n";
    }
}
