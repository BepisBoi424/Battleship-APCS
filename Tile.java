public class Tile 
{
    private boolean isOccupied;
    private String[][] board;
    
    public Tile() 
    {
        isOccupied = false;
        board = new String[10][10];
    }

    public void printBoard() 
    {
        System.out.println("    A     B     C     D     E     F     G     H     I     J");
        for(int i = 0; i < board.length; i++) 
        {
            System.out.print(i + " ");
            for(int j = 0; j < board[i].length; j++) 
            {
                if(board[i][j] == null) 
                {
                    board[i][j] = "[ O ] ";
                }
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
