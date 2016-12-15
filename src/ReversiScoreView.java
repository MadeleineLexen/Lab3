import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Created by madeleine on 2016-12-15.
 */
public class ReversiScoreView implements PropertyChangeListener{
    PropertyChangeSupport psc = new PropertyChangeSupport(this);

    public void getScore(){
        psc.firePropertyChange("Karlsson", 877, 43903);
    }


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        evt.getSource().g
    }
}
