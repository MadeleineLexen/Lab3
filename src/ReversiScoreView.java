import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Created by madeleine on 2016-12-15.
 */
public class ReversiScoreView implements PropertyChangeListener{
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        ReversiModel rm = (ReversiModel) evt.getSource();
        System.out.println(rm.getBlackScore());
        System.out.println(rm.getWhiteScore());
        System.out.println(rm.getTurnColor());
    }
}
