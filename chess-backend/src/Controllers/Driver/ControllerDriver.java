package Controllers.Driver;

import Controllers.Game.GameController;

import java.util.Scanner;

public class ControllerDriver {

    public static void main (String[] args) {
        GameController game = new GameController();
        System.out.println("## Starting Board ##");
        game.displayBoard();
        System.out.println("----------------------");
        while(true) {
            int player = game.getPlayerTurn();
            if(player == 0) {
                System.out.println("~~ WHITE'S MOVE ~~");
            }
            else {
                System.out.println("~~ BLACK'S MOVE ~~");
            }
            Scanner s = new Scanner(System.in);
            System.out.println("# Enter position of piece to move: ");
            String input1 = s.nextLine();
            int row = Integer.parseInt(String.valueOf(input1.charAt(0)));
            int col = Integer.parseInt(String.valueOf(input1.charAt(1)));
            System.out.println("# Enter position to move the piece: ");
            String input2 = s.nextLine();
            int newRow = Integer.parseInt(String.valueOf(input2.charAt(0)));
            int newCol = Integer.parseInt(String.valueOf(input2.charAt(1)));
            try {
                game.playerMove(player, new int[]{row, col}, new int[]{newRow, newCol});
            }
            catch(Exception e) {
                System.out.println("Error: " + "'" + e.getMessage() + "'");
            }
            if(player == 0) {
                player = 1;
            }
            else {
                player = 0;
            }
            game.displayBoard();
            System.out.println("----------------------");
        }
    }
}
