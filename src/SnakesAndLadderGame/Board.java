package SnakesAndLadderGame;

import java.util.HashMap;
import java.util.List;

public class Board {
    private HashMap<Integer,Integer> snakesVsPos;
    private HashMap<Integer,Integer> ladderVsPos;
    private int size;
    Board(int size,List<Snake> snakes,List<Ladder> ladders){
        this.size = size;
        snakesVsPos = new HashMap();
        ladderVsPos = new HashMap<>();
        for(Snake snake:snakes){
            snakesVsPos.put(snake.snakeStartPoint(), snake.getEndPoint());
        }
        for(Ladder ladder:ladders){
            ladderVsPos.put(ladder.ladderStartPoint(), ladder.getEndPoint());
        }
    }

    public boolean isSnake(int pos){
        return snakesVsPos.containsKey(pos);
    }

    public boolean isLadder(int pos){
        return ladderVsPos.containsKey(pos);
    }
    public int getSnakeEndPoint(int pos){
        if(snakesVsPos.containsKey(pos)){
            return snakesVsPos.get(pos);
        }
        return -1;
    }
    public int getLadderEndPoint(int pos){
        if(ladderVsPos.containsKey(pos)){
            return ladderVsPos.get(pos);
        }
        return -1;
    }

}
