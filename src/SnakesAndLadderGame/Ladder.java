package SnakesAndLadderGame;

public class Ladder extends Jumper{
    public Ladder(int startPoint, int endPoint){
        setStartPoint(startPoint);
        setEndPoint(endPoint);
    }
    public int ladderStartPoint(){
        return getStartPoint();
    }
    public int ladderEndPoint(){
        return getEndPoint();
    }

}
