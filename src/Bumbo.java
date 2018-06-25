public class Bumbo extends Tom {
//herança
    public Bumbo(Integer tamanhoDoTom, String tipoDaPele) {
        super(tamanhoDoTom, tipoDaPele);
    }

    //Polimorfirmo
    @Override
    public void afinarTom() {
        System.out.println("Você passa uma hora girando esses malditos parafusos pra ver se da uma afinada dahora, dai " +
                "quando ta mais ou menos tu teima achadno q consegue fazer melhor então perde outra hora." +
                "Amo isso");;
    }
}
