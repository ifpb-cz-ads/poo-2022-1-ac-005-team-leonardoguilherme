package Cinco;
public class TesteTime {
    public static void main(String [] args){
        Time time1 = new Time();
        time1.nomeTime = "Loud";
        time1.jogadores = new String[4];
        time1.jogadores[0] = "Mob";
        time1.jogadores[1] = "Coringa";
        time1.jogadores[2] = "Bradock";
        time1.jogadores[3] = "Vinizx";
        time1.tipoEsporte = "free Fire";
        time1.pontuacao = 10;
        time1.campeonato = "ProLeague";
        time1.mostrarpontuacao();
    }
}
