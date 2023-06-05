public class Retangulo {
    private double ladoA;
    private double ladoB;
    private double area;
    private double perimetro;
    private double comprimentoRodape;
    private double areaPiso;

    public double getLadoA() {
        return ladoA;
    }
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double mudarValorLado(double ladoA, double ladoB){
        setLadoA(ladoA);
        setLadoB(ladoB);
        double[] lados = new double[1];
        lados[0] = ladoA;
        lados[1] = ladoB;
        return lados;
    }

    public double retornarValorLado(){
        return ladoA + "" + ladoB;
    }

    public void calcularArea() {
        area = ladoA * ladoB;
    }
    public double getArea() {
        return area;
    }

    public void calcularPerimetro() {
        perimetro = 2 * (ladoA + ladoB);
    }
    public double getPerimetro() {
        return perimetro;
    }
    
    public double getAreaPiso() {
        return areaPiso;
    }
    public void setAreaPiso(double areaPiso) {
        this.areaPiso = areaPiso;
    }

    
    public double getComprimentoRodape() {
        return comprimentoRodape;
    }
    public void setComprimentoRodape(double comprimentoRodape) {
        this.comprimentoRodape = comprimentoRodape;
    } 

    public double quantidadePisos() {
        return area / areaPiso;
    }

    public double quantidadeRodape() {
        return perimetro / comprimentoRodape;
    }
}
