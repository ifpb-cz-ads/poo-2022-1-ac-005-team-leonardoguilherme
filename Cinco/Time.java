package Cinco;
public class Time{
    public String nomeTime;
    public String [] jogadores;
    public String tipoEsporte;
    public int pontuacao;
    public String campeonato;

    public void mostrarpontuacao(){
        System.out.println("A pontuação do Time " + this.nomeTime + " no " + this.tipoEsporte + " no campeonato " + this.campeonato + " = " + this.pontuacao + " pontos");
    }
}