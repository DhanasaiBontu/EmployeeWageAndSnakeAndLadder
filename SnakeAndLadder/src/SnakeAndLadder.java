import java.util.Random;

public class SnakeAndLadder {

    int position = 0;

    public void startGame() {
        System.out.println("Player starting at position: " + position);

        int die = rollDie();
        System.out.println("Die rolled: " + die);
        checkOption(die);
        if (position < 0) {
            position = 0;
        }
        System.out.println("Player reached position 100");
    }


    public int rollDie() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public void checkOption(int die) {
        int option = new Random().nextInt(3); // 0-No Play, 1-Ladder, 2-Snake

        switch (option) {
            case 0:
                System.out.println("No Play");
                break;
            case 1:
                position += die;
                System.out.println("Ladder! Position: " + position);
                break;
            case 2:
                position -= die;
                System.out.println("Snake! Position: " + position);
                break;
        }
    }
}
