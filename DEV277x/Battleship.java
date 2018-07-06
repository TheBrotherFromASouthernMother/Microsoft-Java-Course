package DEV277x;
import java.util.*;

public class Battleship {


    private static int[][] makeBoard(int boardSize) {
        int boardTile = 10;
        int count = 0;
        int[][] board = new int[boardSize + 3][boardSize + 4];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == 0 || i == board.length -1 ) {
                    if(j < 2 || j > 11) {
                        board[i][j] = -1;
                    } else {
                        board[i][j] = count;
                        count ++;
                    }
                } //first and last rows

                if (i > 0 && i < board.length -1 ) {
                    if (j == 0 || j ==  board[i].length-1) {
                        board[i][j] = i;
                    } else if(j == 1 || j ==  board[i].length-2)  {
                        board[i][j] = -2;
                    } else {
                        board[i][j] = -1;
                    }
                }

            }
            count = 0;

        }
        return board;
    }

    private static String printInitialBoard(int board[][])  {
        String initialStateOfTheBoard = "";
        for (int i = 0; i < board.length; i ++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == board.length - 3 || i == board.length -2) {
                    continue;
                }

                if(board[i][j] == -1) {
                    initialStateOfTheBoard += " ";
                } else if (board[i][j] == -2) {
                    initialStateOfTheBoard += "|";
                } else if (board[i][j] == -3) {
                    initialStateOfTheBoard += "x";
                }

                else {
                    initialStateOfTheBoard += board[i][j];
                }
                if (j == board[i].length-1) {
                    initialStateOfTheBoard += "\n";
                }
            }
        }
        System.out.println(initialStateOfTheBoard);
        return initialStateOfTheBoard;
    }

    private static String initGame() {
        System.out.println("*** Welcome to the Battleships game ***");
        System.out.println("Right now the sea is empty");
        int[][] board = makeBoard(10);
        printInitialBoard(board);
        Scanner input = new Scanner(System.in);

        //user input must be casted between 2 && 11;
        int x = -1;
        int y = -1;
        int numberOfShipsDeployed = 0;
        boolean outOfBounds = true;
        System.out.println(board[0][11]);
        while (numberOfShipsDeployed < 5) {
            while (outOfBounds) {
                System.out.print("Enter X coordinate for your ship: ");
                x = input.nextInt();
                System.out.print("Enter Y coordinate for your ship: ");
                y = input.nextInt();
                if (!(x < 0 || x > 9 ) && !(y < 0 || y > 9 )) {
                    outOfBounds = false;
                    board[x + 2][y + 2] = -3;
                }
            }
            numberOfShipsDeployed ++;
            outOfBounds = true;
            System.out.println(numberOfShipsDeployed);
            x = -1;
            y = -1;
        }
        printInitialBoard(board);
        return "hello";


    }


    public static void main(String[] args) {
        initGame();
    }
}
