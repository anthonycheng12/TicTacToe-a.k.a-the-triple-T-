
public class Game {
	static char[][] board = new char[3][3];

	public static void startGame() {
		System.out.println("TicTacToe has begun!");
		for (int i = 0; i < 3; i++)
			for (int p = 0; p < 3; p++)
				board[i][p] = ' ';
	}

	public static void makeMove(char player, int row, int column) {
		board[row][column] = player;
	}

	public static boolean allowed(int row, int column) {
		if (board[row][column] == 'x' || board[row][column] == 'o') {
			return true;
		} else {
			return false;
		}
	}

	public static void displayBoard() {

		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}

	public static char changeTurn(char player) {
		return player == 'o' ? 'x' : 'o';
	}

	public static boolean checkIfWinner() {
		if (board[0][0] == board[1][0] && board[1][0] == board[2][0] && (board[0][0] == 'x' || board[0][0] == 'o')) {
			return true;
		} else if (board[0][1] == board[1][1] && board[1][1] == board[2][1]
				&& (board[0][1] == 'x' || board[0][1] == 'o')) {
			return true;
		} else if (board[0][2] == board[1][2] && board[1][2] == board[2][2]
				&& (board[0][2] == 'x' || board[0][2] == 'o')) {
			return true;
		} else if (board[0][0] == board[0][1] && board[0][1] == board[0][2]
				&& (board[0][0] == 'x' || board[0][0] == 'o')) {
			return true;
		} else if (board[1][0] == board[1][1] && board[1][1] == board[1][2]
				&& (board[1][0] == 'x' || board[1][0] == 'o')) {
			return true;
		} else if (board[2][0] == board[2][1] && board[2][1] == board[2][2]
				&& (board[2][0] == 'x' || board[2][0] == 'o')) {
			return true;
		} else if (board[0][0] == board[1][1] && board[1][1] == board[2][2]
				&& (board[0][0] == 'x' || board[0][0] == 'o')) {
			return true;
		} else if (board[2][0] == board[1][1] && board[1][1] == board[0][2]
				&& (board[2][0] == 'x' || board[2][0] == 'o')) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean checkIfTie() {
        for (int i = 0; i < 3; i++) {
            for (int p = 0; p < 3; p++) {
                if (board[i][p] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }


}
