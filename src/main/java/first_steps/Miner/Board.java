package first_steps.Miner;

/**
 * Created by user on 19.02.2016.
 */
public interface Board {

    void drawBoard(Cell[][] cell);

    void drawCell(int x, int y);

    void drawBang();

    void drawCongratulate();
}
