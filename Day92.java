class Solution {
    boolean solved=false;
    public void solveSudoku(char[][] board) {

             solve(board,0,0);
    }


    public void solve(char[][] grid,int row,int col){
          if(row==grid.length){
                solved=true;
               return;
          }

          if(row<0 || col<0 || row>=grid.length || col>=grid.length){
             return;
          }

          int new_row=-1;
          int new_col=-1;
          if(col==grid.length-1){
            new_row=row+1;
            new_col=0;
          }else{
              new_row=row;
              new_col=col+1;
          }

          if(grid[row][col]!='.'){
             solve(grid,new_row,new_col);
          }else{
             for(char i='1';i<='9';i++){
              if(isPossible(grid,row,col,i)){
                  grid[row][col]=i;
                  solve(grid,new_row,new_col);
                  if(solved){
                    return;
                  }
                  //back track
                  grid[row][col]='.';

              }
          }
          }
         
    }

    public boolean isPossible(char[][] grid, int row,int col,char num){
          // col 
          for(int i=0;i<grid.length;i++){
              if(grid[i][col]==num){
                  return false;
              }
          }

          //row
           for(int i=0;i<grid.length;i++){
              if(grid[row][i]==num){
                  return false;
              }
          }

          // square
          int x=(row/3)*3;
          int y=(col/3)*3;
          for(int i=x;i<x+3;i++){
            for(int j=y;j<y+3;j++){
                if(grid[i][j]==num){
                    return false;
                }
            }
          }
          return true;
    }
}