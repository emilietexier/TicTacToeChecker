public class Grid {

    public char[][] grid;

    public Grid(char[][] grid){
        this.grid = grid;
    }

    public char checkState(){ //returns X, O or ?
        boolean line_win = true;
        boolean column_win = true;
        boolean diagonal_win = true;
        for(int i = 0; i < Constants.dimension; ++i) {
            for (int j = 0; j < Constants.dimension; ++j) {
                if (grid[i][j] != grid[0][j]) {
                    line_win = false;
                }
                if (grid[j][i] != grid[i][0]) {
                    column_win = false;
                }
                if (i == j && grid[i][j] != grid[0][0]) {
                    diagonal_win = false;
                }
            }
            if(line_win){
                if(grid[i][0] == 'X'){return 'X';}
                else if(grid[i][0] == 'O'){return 'O';}
            }
            if(column_win){
                if(grid[0][i] == 'X'){return 'X';}
                else if(grid[0][i] == 'O'){return 'O';}
            }
            if(diagonal_win){
                if(grid[0][0] == 'X'){return 'X';}
                else if(grid[0][0] == 'O'){return 'O';}
            }
        }
        return '?';
    }
