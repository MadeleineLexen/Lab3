import java.beans.PropertyChangeListener;

/**
 * Created by madeleine on 2016-12-14.
 */
public interface IObservable {
    void removeObserver(PropertyChangeListener observer);
    void addObserver(PropertyChangeListener observer);

}
