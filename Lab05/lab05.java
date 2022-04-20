public class lab05 {

    public static void main(String args[]) {

        
        int size_X = Integer.parseInt(args[0]);
        int size_Y =  Integer.parseInt(args[1]);
        int steps = Integer.parseInt(args[2]);
        int preset = Integer.parseInt(args[3]);

        Game gameOfLife = new Game(size_X, size_Y);

        switch(preset)
        {
            case 0:
                gameOfLife.generateRandom();
            break;
            case 1:
                gameOfLife.generateBoat();
            break;
            case 2:
                gameOfLife.generateBlinker();
            break;
            case 3:
                gameOfLife.generateSpaceship();
            break;
            
        }
        for(int i=1;i<=steps;i++)
        {
            gameOfLife.print(i);
            gameOfLife.newBoard();
        }

    }

}
