import java.util.Random;

public class SnakeAndLadder {

    int position = 0;

    public void startGame() {
        System.out.println("Player starting at position: " + position);

        int die = rollDie();
        System.out.println("Die rolled: " + die);
    }

    public int rollDie() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
