/**
 * Created by worki on 14.06.2017.
 */
public class IntLover implements Observer {

    private int value;

    public IntLover(Observable o){
        o.registerObserver(this);
    }

    @Override
    public void update(int in) {
        value = in;
        System.out.println(value);
    }
}
