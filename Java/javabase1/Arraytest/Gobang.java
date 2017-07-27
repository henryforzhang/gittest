/**Description:
  *1027/07/22 ZW
  *purpose:
  *achieve a Gobang
  *
  *
  */

public class Gobang
{
	private String[][] board;
	private static int BOARD_SIZE = 15;
        
	//initiate the board
	public void drawtheboard()
	{
		board = new String[BOARD_SIZE][BOARD_SIZE];
		
		for(int i=0; i<BOARD_SIZE; i++)
		{
			for(int j=0; j<BOARD_SIZE; j++)
			{
				board[i][j]="+";

			}

		}


	}
	//print the board
	public void printboard
	{
		for(int i=0; i<BOARD_SIZE; i++)
		{
			for(int j=0; j<BOARD_SIZE; j++)
			{
				System.out.print(board[i][j]);

			}

				System.out.print("\n");

		}


	}


	public static void main(String[] args) throws Exception
	{
		Gobang gb = new Gobang();
		gb.drawtheboard();
		gb.printboard();
                //establish a BufferedReader case
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String  inputstr = null;

	}
//remain to continue


























}
