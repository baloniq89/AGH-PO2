package Armia;

public class Rozkaz {

    private String order;

    public Rozkaz(String orderText) {
        this.order = orderText;
    }

    @Override
    public String toString(){
        return this.order;
    }

}