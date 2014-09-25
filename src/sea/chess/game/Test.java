package sea.chess.game;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws NotEmptyCellException {

		Scanner scanner = new Scanner(System.in);

		int[][] matrix = new int[3][3];

		System.out.print("Enter first player name: ");
		String playerOneName = scanner.nextLine();
		System.out.print("Enter second player name: ");
		String playerTwoName = scanner.nextLine();
		
		//assign 1 and 2 to players to optimize because
		//we want to put a numbers into the matrix instead of strings
		int player1 = 1;
		int player2 = 2;

		while (true) {

			System.out.print(playerOneName + " enter position by X: ");
			int positionX = scanner.nextInt();
			System.out.print(playerOneName + " enter position by Y: ");
			int positionY = scanner.nextInt();
			
			Point<Integer, Integer> currentPoint = new Point<Integer, Integer>(positionX, positionY);
			move(currentPoint, matrix, player1);
			CheckForWin.checkIfWin(matrix, player1, playerOneName);
			
			System.out.print(playerTwoName + " enter position by X: ");
			int positionXX = scanner.nextInt();
			System.out.print(playerTwoName + " enter position by Y: ");
			int positionYY = scanner.nextInt();
			
			Point<Integer, Integer> currentPoint2 = new Point<Integer, Integer>(positionXX, positionYY);
			move(currentPoint2, matrix, player2);
			CheckForWin.checkIfWin(matrix, player2, playerTwoName);

		}
		
	}

	public static void move(Point<Integer, Integer> point, int matrix[][],
			int playerId) throws NotEmptyCellException {

		int horizontal = point.getX();
		int vertical = point.getY();

		if (matrix[horizontal][vertical] != 0) {
			//throw new NotEmptyCellException("This cell is already token!");
			System.err.println("This cell is already token! Please chose another one...");
			return;
		}

		matrix[horizontal][vertical] = playerId;
	}

}
