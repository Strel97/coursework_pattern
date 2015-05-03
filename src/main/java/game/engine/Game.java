package game.engine;

/**
 * Created by sergey on 27.04.2015.
 */
public class Game implements Runnable {

    private boolean running;


    public Game() {
        running = false;
    }

    public void start() {
        running = true;
        run();
    }

    @Override
    public void run() {
        while (running) {

        }
    }

    public void stop() {
        running = false;
    }
}
