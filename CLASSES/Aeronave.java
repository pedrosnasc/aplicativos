package CLASSES;

public class Aeronave{

    private String modelo;
    private String numeroSerie;

    Override
    public String toString() {
        String texto = " ";
        texto += "Modelo: " + modelo;
        texto += "- Número De Série: " + numeroSerie;
        return texto;
        //esta dando esse erro no "public" fiz de tudo mas não consegui solucionar esse problema//
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getNumeroSerie() {
        return numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
}


