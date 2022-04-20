import java.util.Random;

public class Game {

    private int sizeX;
    private int sizeY;
    private int [][]board;
    private Random generateRandom = new Random();

    Game(int x, int y) {
        this.sizeX = x;
        this.sizeY = y;
        this.board = new int[this.sizeX] [this.sizeY];
    }

    void generateRandom()
    {
        for(int i=0;i<this.sizeX;i++)
        {
            for(int j=0;j<this.sizeY;j++)
            {
                this.board[i][j] = generateRandom.nextInt(2);
            }
        }
    }
    void generateBoat(){

        int x2 = this.sizeX / 2;
        int y2 = this.sizeY / 2;

        this.board[x2 -1][y2] = 1;
        this.board[x2 +1][y2] = 1;
        this.board[x2][y2 -1] = 1;
        this.board[x2][y2 +1] = 1;
        this.board[x2 -1][y2 -1] = 1;

    }

    void generateBlinker() {

        int x2 = this.sizeX / 2;
        int y2 = this.sizeY / 2;

        this.board[x2][y2] = 1;
        this.board[x2 -1][y2]  = 1;
        this.board[x2 +1][y2] = 1;
    }

    void generateSpaceship() {

        int x2 = this.sizeX / 2;
        int y2 = this.sizeY / 2;

        this.board[x2 -1][y2 -1] = 1;
        this.board[x2 -1][y2] = 1;
        this.board[x2 -1][y2 +1] = 1;
        this.board[x2][y2 -1] = 1;
        this.board[x2 + 1][y2] = 1;

    }

    void print(int step) {

        System.out.println("------" + step + "------");
        for(int i=0;i<this.sizeX;i++)
        {
          for(int j=0;j<this.sizeY;j++)
          {
            if(board[i][j] == 0)
            {
                System.out.print(".");  
            }else{
                System.out.print("X"); 
            }
          }
          System.out.println();
        }
    }

    void newBoard() {

        int [][]newBoard = new int [this.sizeX][this.sizeY];

        for(int i=1;i<this.sizeX - 1;i++)
        {
            for(int j=1;j<this.sizeY - 1;j++)
            {   
                int lifeNeighbours = 0;
                for(int k=-1;k<=1;k++)
                    for(int l=-1;l<=1;l++)
                        lifeNeighbours += this.board[i + k][j + l];
                        

                lifeNeighbours -= this.board[i][j];
                if(this.board[i][j] == 0 && lifeNeighbours == 3)
                {
                    newBoard[i][j] =1;
                }else if(this.board[i][j] == 1 && lifeNeighbours < 2)
                {
                    newBoard[i][j] = 0;
                }else if(this.board[i][j] == 1 && lifeNeighbours > 3)
                {
                    newBoard[i][j] = 0;
                }else {
                    newBoard[i][j] = this.board[i][j];
                }
            }
            
        }
        this.board = newBoard;
    }

}