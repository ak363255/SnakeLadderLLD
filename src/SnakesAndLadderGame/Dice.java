package SnakesAndLadderGame;

import java.util.Random;

public class Dice {
    int noOfDice;
    Random random;
    public Dice(int noOfDice){
        this.noOfDice = noOfDice;
        random = new Random();
    }
    public int rollDice(){
        return random.nextInt(noOfDice*6 - 1) + 1;
    }
}
