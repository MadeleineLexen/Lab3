import java.awt.*;

/**
 * Created by hannacarlsson on 2016-12-08.
 */
public interface GameModel extends IObservable {

    GameTile getGameboardState(final Position pos);

    GameTile getGameboardState(final int x, final int y);

    void gameUpdate(int lastKey) throws GameOverException;

    int getUpdateSpeed();

}