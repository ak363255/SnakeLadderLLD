package SnakesAndLadderGame;

import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class SnakeLadderGame {
    private Dice dice;
    private Queue<Player> players;
    private int boardSize;
    private HashMap<Integer,Integer> currentPlayerPosition;

    private List<Snake> snakes;

    private List<Ladder> ladder;
    private Board board;

    public SnakeLadderGame(
            Dice dice,
            Queue<Player> players,
            int boardSize, HashMap<Integer, Integer> currentPlayerPosition,
            List<Snake> snakes,
            List<Ladder> ladder
    ){
        this.dice = dice;
        this.boardSize = boardSize;
        this.players = players;
        this.currentPlayerPosition = currentPlayerPosition;
        this.ladder = ladder;
        this.snakes = snakes;
        board = new Board(boardSize,snakes,ladder);
    }

    public void startGame(){
        while(players.size() > 1){
            Player currentPlayer = players.poll();
            int rollDice = dice.rollDice();
            System.out.println("Rolled Dice "+ rollDice);
            int newPos = currentPlayerPosition.get(currentPlayer.id) + rollDice;

            if(newPos == boardSize){
                System.out.println("Player "+currentPlayer.playerName+" Won Game");
                continue;
            }
            else if(board.isSnake(newPos)){
                System.out.println("Player "+currentPlayer.playerName+" bitten by snake at "+newPos);
                newPos = board.getSnakeEndPoint(newPos);
                currentPlayerPosition.put(currentPlayer.id,newPos);
                System.out.println("Player "+currentPlayer.playerName+" New Pos "+newPos);
            }else if(board.isLadder(newPos)){
                System.out.println("Player "+currentPlayer.playerName+" got Ladder at "+newPos);
                newPos = board.getLadderEndPoint(newPos);
                currentPlayerPosition.put(currentPlayer.id,newPos);
                System.out.println("Player "+currentPlayer.playerName+" New Pos "+newPos);
            }else if(newPos <= boardSize){
                currentPlayerPosition.put(currentPlayer.id,newPos);
                System.out.println("Player "+currentPlayer.playerName+" New Pos "+newPos);
            }else{
                System.out.println("Player "+currentPlayer.playerName+" New Pos is Invalid "+newPos);
            }
            players.add(currentPlayer);
        }
    }
}
