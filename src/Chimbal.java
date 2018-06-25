public class Chimbal extends Prato {
//herança
    //Os pratos do tipo chimbal são usados em pares.
    private Integer quantidadeDePratos;

    public Chimbal(String materialDoPrato, Integer tamanhoDoPrato) {
        super(materialDoPrato, tamanhoDoPrato);
        this.quantidadeDePratos =2;
    }

}
