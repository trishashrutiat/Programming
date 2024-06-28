
package Matrix;

public class ConwaysGameOfLife {
    public static void main(String[]Args){
          int[][] grid = { 
             { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
            { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };
          int row=grid.length;
          int col=grid[0].length;
          printGrid(grid,row,col);
       
          for (int i=0;i<row;i++){
              for(int j=0;j<col;j++){
                   int a=availableNeighbours(grid,i,j);
                   if(grid[i][j]==1){
                   if(a<2){
                       grid[i][j]=0;
                   }
                   if(a>3){
                       grid[i][j]=0;
                   }}
                   else if(grid[i][j]==0){
                   if (a==3){
                       grid[i][j]=1;
                   }
              }}
          }
          printGrid(grid,row,col);
          
    }
   public static int availableNeighbours(int grid[][],int row,int col) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        // Define the possible directions
        int[][] directions = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };

        // Iterate through each direction
        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if(newRow>=0&&newRow<rows&&newCol>=0&&newCol<cols){
                    if(grid[newRow][newCol]==1)
                        count++;
           }
       }
       return count; 
   }
   public static void printGrid(int grid[][],int row,int col){
       System.out.println();

       for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               if(grid[i][j]==0)
               System.out.print('.');
               else
                  System.out.print('*');  
           }
           System.out.println();
       }
   }
}
