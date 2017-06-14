import java.util.LinkedList;
import java.util.List;

/**
 * Created by worki on 14.06.2017.
 */
public class Button implements Observable {

    private List<Observer> observers;
    private int value;

    public Button(){
        observers = new LinkedList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observers)
            observer.update(value);
    }

    public void ButtonPress(int in){
        System.out.println("Press registered");
        value = in;
        notifyObservers();
    }
}
