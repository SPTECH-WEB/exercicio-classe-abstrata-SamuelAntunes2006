package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem extends Figura{
private List<Figura> figuras = new ArrayList<>(7);

    public void adicionar(Figura figura){

            figuras.add(figura);


    }
    public Double calcularSomaDasAreas() {
        Double somadetodasaslistas = 0.0;
        for (Figura f : figuras) {
            somadetodasaslistas += f.calcularArea();
        }
        return somadetodasaslistas;
    }

    public List<Figura>buscarPorAreaMaiorQue20(){
        List<Figura> areaMaior = new ArrayList<>();
        for(Figura f: figuras){
            if(f.calcularArea() > 20){
                areaMaior.add(f);
            }
        }
        return areaMaior;
    }

    public List<Quadrado> buscarQuadrados() {
        List<Quadrado> quadrados = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura instanceof Quadrado q) {
                quadrados.add(q);
            }
        }
        return quadrados;
    }



    @Override
    public Double calcularArea() {
        return 0.0;
    }
}
