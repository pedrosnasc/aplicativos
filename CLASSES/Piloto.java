package CLASSES;
public class Piloto extends Pessoa {
    private String breve;


    public String toString() {
        String texto = " ";
        texto += "Nome: " + nome;
        texto += "- Cpf: " + cpf;
        texto += " - Brevê: " + breve;
        return texto;

    }

    public String getBreve() {
        return breve;
    }

    public void setBreve(String breve) {
        this.breve = breve;
    }
    

   
}
