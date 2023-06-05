public class Bola {
    private String cor;

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    private String circunferencia;

    public String getCircunferencia() {
        return circunferencia;
    }
    public void setCircunferencia(String circunferencia) {
        this.circunferencia = circunferencia;
    }

    private String material;

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    
    public String trocaCor(String cor) {
        setCor(cor);
        return cor; 
    }

    public String mostraCor() {
        return "" + cor;
    }
}
