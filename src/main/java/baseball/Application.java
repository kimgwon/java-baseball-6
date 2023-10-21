package baseball;

public class Application {
    public static void main(String[] args) {
        Game game = new Game();
        int roundResult;
        boolean running = true;

        while (true) {
            if (!running) {
                break;
            }

            game.getGuessNums();
            roundResult = game.getHint();

            if (roundResult == 2) {
                running = game.isRestart();
            }
        }
    }
}
