public class Tile 
{
    // Create instance variables
    private Tile[][] board;
    public String status;
    
    // Constructor for a tile and creating the game board
    public Tile() 
    {
        status = "[ O ] ";
        board = new Tile[10][10];
    }

    // Prints the board
    public void printBoard() 
    {
        System.out.println("    A     B     C     D     E     F     G     H     I     J");
        for(int i = 0; i < board.length; i++) 
        {
            System.out.print(i + " ");
            for(int j = 0; j < board[i].length; j++) 
            {
                System.out.print(board[i][j].status);
            }
            System.out.println();
        }
    }
}
