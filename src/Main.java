import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Minha ideia foi que existe os instrumentos e cada instrumento pode ser tocado
        //e categorizado com um tipo, então criei uma bateria que possui varios pratos e toms
        //estes pratos e toms em si possuem classes filhos como ride e chimbal para os pratos
        //e Surdo e Bumbo para os toms.



        //Você pode observar os quatro pilares de OO vasculhando as classes,
        //coloquei comentarios para ajudar, as chamadas do main não são necessarias
        //para dizer que existe os quatro pilares, mas elas são provas de que sim

        Surdo surdo1 = new Surdo(20,"Hidráulica");
        Bumbo bumbo1 = new Bumbo(22,"Hidráulica");

        Ride ride1 = new Ride("Cobre",22);
        Chimbal chimbal1 = new Chimbal("Cobre",14);

        ArrayList<Prato> pratos = new ArrayList();
        pratos.add(chimbal1);
        pratos.add(ride1);

        ArrayList<Tom> toms = new ArrayList();
        toms.add(surdo1);
        toms.add(bumbo1);

        Bateria minhaBateria = new Bateria(pratos,toms);
        System.out.println(minhaBateria.getTipoDoInstrumento());

        //chamei o afinal do bumbo1. sei que ele é o 1 pois passei ele por segundo.
        minhaBateria.getListaTom().get(1).afinarTom();

        minhaBateria.tocarInstrumento();

    }
}
