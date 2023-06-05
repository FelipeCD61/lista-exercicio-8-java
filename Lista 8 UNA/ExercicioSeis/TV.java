public class TV {
    private int volume;
    private String canal;
    private int mudarVolume;

    public String getCanal() {
        return canal;
    }
    public void setCanal(String canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getMudarVolume() {
        return mudarVolume;
    }
    public void setMudarVolume(int mudarVolume) {
        this.mudarVolume = mudarVolume;
    }

    public String Canal() {
        switch(canal) {
            case "1":
            return "Você está vendo Rede tv";
            case "2":
            return "Você está vendo SBT";
            case "3":
            return "Você está vendo Record";
            case "4":
            return "Você está vendo Band";
            case "5":
            return "Você está vendo Globo";
            case "6":
            return "Você está vendo Tv brasil";
            default:
            return "Erro";

        }
    }
    
    public String Volume() {
        if (volume <= 100) {
            return "Novo volume definido: " + volume;
        } else {
            return "Digite um dos números dentro da escala";
        }
    }
    
}
