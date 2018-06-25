import java.util.ArrayList;

public class Bateria extends Instrumento {
//herança

    //Encapsulamento
    private ArrayList<Prato> listaPrato = new ArrayList<Prato>();
    private ArrayList<Tom>  listaTom = new ArrayList<Tom>();
    private final String tipoDoInstrumento ="Percursão";

    public Bateria(ArrayList<Prato> listaPrato, ArrayList<Tom> listaTom) {
        this.listaPrato = listaPrato;
        this.listaTom = listaTom;
    }

    //Polimorfismo
    @Override
    public void tocarInstrumento() {
        System.out.println("Você toca um classico, Led Zeppelin Rock And Roll!");
    }

    public ArrayList<Prato> getListaPrato() {
        return listaPrato;
    }

    public ArrayList<Tom> getListaTom() {
        return listaTom;
    }

    public String getTipoDoInstrumento() {
        return tipoDoInstrumento;
    }
}
