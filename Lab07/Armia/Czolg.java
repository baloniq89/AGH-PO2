package Armia;
import java.util.ArrayList;

interface CzolgInterface {

    void odbierzRozkaz(Rozkaz order);
    void wezIdentyfikator(Identyfikator id);

}

public class Czolg implements CzolgInterface{

    private ArrayList<Rozkaz> listOfOrders;

    public Czolg(){
        this.listOfOrders = new ArrayList<Rozkaz>();
    }


    public String ostatniRozkaz(){
        return "Ostatni rozkaz do mnie: " + listOfOrders.get(listOfOrders.size() - 1);
    }

    public void odbierzRozkaz(Rozkaz order) {
        this.listOfOrders.add(order);
    }

    public void wezIdentyfikator(Identyfikator id) {

    }

    @Override
    public String toString() {

        String output = "";
        for(Rozkaz order : this.listOfOrders)
        {
            output += order + "\n";
        }
        return output.toString();

    }

}
