public class Tamagushi {
    private String nome;
    private int idade;
    private String fome;
    private String saude;
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setFome(String fome) {
        this.fome = fome;
    }
    
    public void setSaude(String saude) {
        this.saude = saude;
    }

    public String alterarNome(String nome) {
        setNome(nome);
        return nome;
    }
    public String retornarNome() {
        return nome;
    }

    public int alterarIdade(int idade) {
        setIdade(idade);
        return idade;
    }
    public String retornarIdade() {
        return idade;
    }

    public String alterarFome(String fome) {
        setFome(fome);
        return fome;
    }
    public String retornarFome() {
        return fome;
    }

    public String alterarSaude(String saude) {
        setSaude(saude);
        return saude;
    }
    public String retornarSaude() {
        return saude;
    }

    public String Humor() {

    }

}
