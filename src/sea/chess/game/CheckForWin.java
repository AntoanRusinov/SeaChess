package sea.chess.game;
public class CheckForWin {

static void checkIfWin(final int matrix[][], int playerId, String playerName) {
	
		//check for horizontal
		if (matrix[0][0] == playerId && matrix[0][1] == playerId && matrix[0][2] == playerId) {
			System.err.println("Player " + playerName + " is winner!");
			System.exit(0);
		}
		
		if (matrix[1][0] == playerId && matrix[1][1] == playerId && matrix[1][2] == playerId) {
			System.err.println("Player " + playerName + " is winner!");
			System.exit(0);
		}
		
		if (matrix[2][0] == playerId && matrix[2][1] == playerId && matrix[2][2] == playerId) {
			System.err.println("Player " + playerName + " is winner!");
			System.exit(0);
		}
		
		//check for vertical
		if (matrix[0][0] == playerId && matrix[1][0] == playerId && matrix[2][0] == playerId) {
			System.err.println("Player " + playerName + " is winner!");
			System.exit(0);
		}

		if (matrix[0][1] == playerId && matrix[1][1] == playerId && matrix[2][1] == playerId) {
			System.err.println("Player " + playerName + " is winner!");
			System.exit(0);
		}

		if (matrix[0][2] == playerId && matrix[1][2] == playerId && matrix[2][2] == playerId) {
			System.err.println("Player " + playerName + " is winner!");
			System.exit(0);
		}
		
		//check for diagonal
		if (matrix[0][0] == playerId && matrix[1][1] == playerId && matrix[2][2] == playerId) {
			System.err.println("Player " + playerName + " is winner!");
			System.exit(0);
		}
		
		if (matrix[0][2] == playerId && matrix[1][1] == playerId && matrix[2][0] == playerId) {
			System.err.println("Player " + playerName + " is winner!");
			System.exit(0);
		}
	}
	
}