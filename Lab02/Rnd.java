import java.util.Random;

public class Rnd {

    double tab[];
    int _size;
    Random rand = new Random();
    
    

    Rnd(int size, int n) {

       _size = size;
        tab = new double [size];
        for(int i=0;i<size;i++)
        {
            double result = 0.0;
            for(int j=0;j<n;j++)
            {   
                result += rand.nextDouble();
                
                
            }
            tab[i] = result;
        }

    }

    public void Print(){

        for(int i=0;i<10; i++)
        {
            System.out.println("[" + i + "] = " + tab[i]);
        }

    }

    public double Min() {

        double minTab = tab[0];
        for(int i=1 ;i<_size;i++)
        {
            if(minTab > tab[i])
            {
                minTab = tab[i];
            }
        }
        return minTab;

    }

    public double Max() {

        double maxTab = tab[0];
        for(int i=1 ;i<_size;i++)
        {
            if(maxTab < tab[i])
            {
                maxTab = tab[i];
            }
        }
        return maxTab;

    }

    public double Average() {

        double sumOfTab = 0.0;
        for(int i=0 ;i<_size;i++)
        {
            sumOfTab += tab[i];
        }
        return sumOfTab/_size;
    }

    public void Draw(){

       System.out.println("*Lekki problem*");
    }


}
