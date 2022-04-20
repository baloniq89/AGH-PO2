package Armia;
import java.util.*;

interface CentrumDowodzeniaInterface {

    void zarejestrujCzolg(Czolg tank);

    void wydajRozkaz(String tankNumber, Rozkaz order);

}

public class CentrumDowodzenia implements CentrumDowodzeniaInterface {

    private ArrayList<Czolg>tanks;

    public CentrumDowodzenia(){
        this.tanks = new ArrayList<Czolg>();
    }

    public void zarejestrujCzolg(Czolg tank) {
        this.tanks.add(tank);
    }

    public void wydajRozkaz(String tankNumber, Rozkaz order) {

        this.tanks.get(Integer.parseInt(tankNumber) - 1).odbierzRozkaz(order);

    }

    @Override
    public String toString(){

        String output = "Do tej pory centrum dowodzenia wyslalo nastepujace rozkazy:\n\n";
        
        for(int i=1;i<=this.tanks.size();i++)
        {
            output = output + "Czolg nr " + i + " otrzymal rozkazy:\n" + this.tanks.get(i-1) + "\n";
        }

        return output;

    }





}