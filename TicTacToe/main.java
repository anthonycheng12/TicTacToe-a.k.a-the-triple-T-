import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		char player = 'x';
		int row, column;
		Scanner input = new Scanner(System.in);
		Game tic = new Game();
		
		tic.startGame();
		
		while(true){
			player = tic.changeTurn(player);
			System.out.print("\n" + player + " ,choose your location (row, column):");
			row = input.nextInt();
			column = input.nextInt();
			
			while(tic.allowed(row, column)){
				System.out.println("Sorry that spot is taken please pick a different spot");
				tic.displayBoard();
				row = input.nextInt();
				column = input.nextInt();
			}
			
			tic.makeMove(player, row, column);
			tic.displayBoard();
			
			if(tic.checkIfWinner()){
				System.out.println("\nThe winner is " + player + " !");
				break;
			}
			
			if (tic.checkIfTie()) {
                System.out.println("\nThe game is a tie !");
                break;
            }
		}

	}

}
