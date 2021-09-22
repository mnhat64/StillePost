public class Player{

    private String name;
    private String opinion;
    private int x;
    private int y;

    public Player (String opinion, int x, int y){
        this.opinion = opinion;
        this.x = x;
        this.y = y;
    }

    public Player (String name, String opinion, int x, int y){
        this.name = name;
        this.opinion = opinion;
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public String getOpinion(){
        return opinion;
    }

    public void setOpinion(String opinion){
        this.opinion = opinion;
    }

    public int move (String direction){
        if (direction == "up") {
            y = y-1;
            return 1;
        } else if (direction == "down"){
            y = y+1;
            return 2;
        } else if (direction == "left"){
            x = x-1;
            return 3;
        } else if (direction == "right"){
            return 4;
        } else return 0;
    }
}