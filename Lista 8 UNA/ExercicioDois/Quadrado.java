public class Quadrado {
    private double tamanhoLado;

	public double getTamanhoLado() {
		return tamanhoLado;
	}

	public void setTamanhoLado(double tamanhoLado) {
		this.tamanhoLado = tamanhoLado;
	}

    public double mudarValorLado(double tamanhoLado) {
		setTamanhoLado(tamanhoLado);
		return tamanhoLado;
	}

	public double retornarValorLado() {
		return tamanhoLado;
	}

	public double calcularArea() {
		return tamanhoLado * tamanhoLado;
	}    
}
