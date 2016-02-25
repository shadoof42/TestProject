package first_steps.Miner;

/**
 * Created by user on 19.02.2016.
 */
public interface Cell<T> {
    boolean isBomb();

    boolean isSuggestBomb();

    boolean isSuggestEmpty();

    void suggestEmpty();

    void suggestBomb();

    void draw(T paint, boolean real);
}
