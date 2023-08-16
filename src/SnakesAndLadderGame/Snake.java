package SnakesAndLadderGame;

public class Snake extends  Jumper{
    public Snake(int startPoint, int endPoint){
        setStartPoint(startPoint);
        setEndPoint(endPoint);
    }
    public int snakeStartPoint(){
        return getStartPoint();
    }
    public int snakeEndPoint(){
        return getEndPoint();
    }
}
