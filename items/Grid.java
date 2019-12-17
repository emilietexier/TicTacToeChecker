public class Grid {

    public char[][] grid;

    public Grid(char[][] grid){
        this.grid = grid; //each element is filled with 'X', 'O' or a blank
    }

    public char checkState(){ //returns X if player X wins, O if player O wins or ? if the outcome is tbd
        for(int i = 0; i < 3; ++i){ //check lines and columns
            boolean line_win = true;
            boolean column_win = true;
            for(int j = 0; j < 3; ++j){
                if(grid[i][j] != grid[i][0]){line_win = false;}
                if(grid[j][i] != grid[0][i]){column_win = false;}
            }
            if(line_win){
                if(grid[i][0] == 'X'){return 'X';}
                else if(grid[i][0] == 'O'){return 'O';}
            }
            if(column_win){
                if(grid[0][i] == 'X'){return 'X';}
                else if(grid[0][i] == 'O'){return 'O';}
            }
        }
        if((grid[0][0] == grid[1][1]  && grid[1][1] == grid[2][2]) ||
        (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0])){
            if(grid[1][1] == 'X'){return 'X';}
            else if(grid[1][1] == 'O'){return 'O';}
        }
        return '?'; //outcome is tbd if no win or if three aligned is always three blanks
    }
}
