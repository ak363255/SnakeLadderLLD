import SnakesAndLadderGame.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
         Snake snake1 = new Snake(95,20);
         Snake snake2 = new Snake(85,35);
         Snake snake3 = new Snake(50,10);
        List<Snake> snakes = new ArrayList<>();
        Ladder ladder1 = new Ladder(8,24);
        Ladder ladder2 = new Ladder(23,56);
        Ladder ladder3 = new Ladder(40,94);
        List<Ladder> ladders = new ArrayList<>();
        snakes.add(snake1);
        snakes.add(snake2);
        snakes.add(snake3);
        ladders.add(ladder1);
        ladders.add(ladder2);
        ladders.add(ladder3);
        Dice dice = new Dice(2);
        Queue<Player> players = new LinkedList<>();
        players.add(new Player(1,"Ak"));
        players.add(new Player(2,"Mk"));
        HashMap<Integer,Integer> currentPlayerPos = new HashMap<>();
        currentPlayerPos.put(1,0);
        currentPlayerPos.put(2,0);
        SnakeLadderGame snakeLadderGame = new SnakeLadderGame(
                dice,
                players,
                100,
                currentPlayerPos,
                snakes,
                ladders

        );
        snakeLadderGame.startGame();
    }
}