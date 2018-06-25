//superclasse
public class Prato {
    private String materialDoPrato; //Geralmente é Bronze ou Cobre
    private Integer tamanhoDoPrato; //O tamanho dos pratos é dado em polegadas

    public Prato(String materialDoPrato, Integer tamanhoDoPrato) {
        this.materialDoPrato = materialDoPrato;
        this.tamanhoDoPrato = tamanhoDoPrato;
    }


    public String getMaterialDoPrato() {
        return materialDoPrato;
    }

    public Integer getTamanhoDoPrato() {
        return tamanhoDoPrato;
    }
}
