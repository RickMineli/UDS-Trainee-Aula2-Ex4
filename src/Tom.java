
//Tom são os tambores da bateria
//superclasse
public class Tom {
    private Integer tamanhoDoTom; //Tratando só da circumferencia, então o tamnho é dado em polegada
    private String tipoDaPele; //Pele é a parte aonde a baqueta bate para que o som seja produzido

    public Tom(Integer tamanhoDoTom, String tipoDaPele) {
        this.tamanhoDoTom = tamanhoDoTom;
        this.tipoDaPele = tipoDaPele;
    }

    public void afinarTom(){
        System.out.println("Você afina o tom.");
    }
}
