package rpgPastaPrincipal;

import java.util.Map;

public class Inimigo{

    //DECLARAÇÃO DE ATRIBUTOS DA CLASSE INIMIGOS

    private String nome;
    private int vida;
    private int ataqueBase;
    private int ataqueAtual;
    private String habitatNatural;
    private boolean buffAtivo;

    public Inimigo(String nome, int vida, int ataqueBase, int ataqueAtual, String habitatNatural) {

        this.nome = nome;
        this.vida = vida;
        this.ataqueBase = ataqueBase;
        this.ataqueAtual = ataqueAtual;
        this.habitatNatural = habitatNatural;
        this.buffAtivo = false;

    }

    public String getNome(){
        return nome;
    }
    public int getVida(){
        return vida;
    }
    public int getAtaqueAtual(){
        return ataqueAtual;
    }
    public String getHabitatNatural(){
        return habitatNatural;
    }

    /**
     * @param bioma
     */
    public void aplicarBuffBioma(Bioma bioma) {
        if (bioma.inimigoEnativo(this) && !buffAtivo){
            Map<String, integer> modificadores = bioma.getModificadores();
        
        if (modificadores.containsKey("dano")) {
            final int bonus = (ataqueBase * modificadores.get("dano")) / 100;
            ataqueAtual += bonus;
        }

        buffAtivo = true;
        System.out.println(nome + " está no seu habitat natural (" + habitatNatural + " e recebeu um buff de ataque");
        }
    }

    public void resetarBuffs(){
        this.ataqueAtual = this.ataqueBase;
        this.buffAtivo = false;
    }

    public void atacar(){
        System.out.println(nome + " ataca com " + ataqueAtual + " de dano!");
    }


}