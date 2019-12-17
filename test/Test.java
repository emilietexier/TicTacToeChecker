import java.util.Random;

public class Test {
    public static void main(String[] args){
        //We will generate a random character array to be tested by the game verifier
        char[][] arr = new char[3][3];
        for(int i = 0; i < 3; ++i){
            for(int j = 0; j < 3; ++j){
                Random randomGenerator = new Random();
                int randomInt = randomGenerator.nextInt(3); //generates a random int between 0, 1 and 2
                switch(randomInt) {
                    case 0: //0 is equivalent to X
                        arr[i][j] = 'X';
                        break;
                    case 1: //1 is equivalent to O
                        arr[i][j] = 'O';
                        break;
                    case 2: //2 is equivalent to a blank
                        arr[i][j] = ' ';
                }
                System.out.print(arr[i][j]);
                System.out.print('|');
            }
            System.out.println("");
        }Grid grid = new Grid(arr); //declaring our random array as a grid
        char response = grid.checkState();
        switch (response) {
            case 'X':
                System.out.println("Player X wins !");
                break;
            case 'O':
                System.out.println("Player O wins !");
                break;
            case '?':
                System.out.println("The outcome of the game is still to be determined.");
                break;
        }
    }
}
