public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private String evento;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
   
    public int envelhecer() {
        return ++idade;
    }

    public double engordar() {
        return ++peso;
    }

    public double emagrecer() {
        return --peso;
    }

    public double crescer() {
        return ++altura;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
    public String getEvento() {
        return evento;
    }

    public String acaoEvento() {
        switch (evento) {
            case "1":
            emagrecer();
            return "Você emagreceu um quilo. \nPeso atual: " + peso;
            case "2":
            engordar();
            return "Você engordou um quilo. \nPeso atual: " + peso; 
            case "3":
            envelhecer();
            if (idade <= 21) {
                altura += 0.005;
                System.out.printf("Você cresceu 0,5 metros. \nAltura atual: %.3f", altura);
            }
            return "\nVocê envelheceu um ano. \nIdade atual: " + idade;
            default:
            return "Erro";
        }
    }
}
