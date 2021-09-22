import java.util.ArrayList;


public class Field{

    private ArrayList<Player> players;

    public Field(){
        this.players = new ArrayList<>();
    }

    public ArrayList<Player> getPlayers(){
        return new ArrayList<>();
    }

    public int compareOpinion(){

        int opinionA = 0;
        int opinionB = 0;

        for (Player p: players){
            if (p.getOpinion() == "Anton") {
                opinionA++;
            }
            else (p.getOpinion() == "Berta"){
                opinionB++;
            }
        }

        if ()
    }


}