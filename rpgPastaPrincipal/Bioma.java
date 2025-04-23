package rpgPastaPrincipal;

import java.util.List;
import java.util.Map;

public class Bioma{

    private String nome;
    private List<String> inimigosNativos;
    private Map<String, integer> modificadores;

    public Bioma (String nome, List<String> inimigosNativos) {
        this.nome = nome;
        this.inimigosNativos = inimigosNativos;
    }
    
    public String getNome(){
        return nome;
    }
    public List<String> getinimigosNativos(){
        return inimigosNativos;
    }
    public boolean inimigoEnativo(Inimigo inimigo) {
        return inimigosNativos.contains(inimigo.getNome());
    }

    public Map<String, integer> getModificadores() {
        return modificadores;
    }
}
