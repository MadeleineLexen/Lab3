import java.awt.*;

/**
 * Created by hannacarlsson on 2016-12-08.
 */
public interface GameModel {

    public GameTile getGameboardState(final Position pos);

    public GameTile getGameboardState(final int x, final int y);

    public void gameUpdate(int lastKey) throws GameOverException;

}