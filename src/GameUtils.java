import java.awt.*;

/**
 * Created by hannacarlsson on 2016-12-08.
 */
public class GameUtils {

    protected void setGameboardState(final int x, final int y, final GameTile tile, final GameTile[][] gameboardState) {
        gameboardState[x][y] = tile;
    }

    protected void setGameboardState(final Position pos, final GameTile tile, final GameTile[][] gameboardState) {
        setGameboardState(pos.getX(), pos.getY(), tile, gameboardState);
    }


}
