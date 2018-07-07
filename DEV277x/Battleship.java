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


    private static boolean check2DArrayList(ArrayList<int[]> arr, int[] row) {
        for (int i = 0; i < arr.size(); i++) {
            if (Arrays.equals(arr.get(i), row)) {
                return true;
            }
        }
        return false;
    }


    private static ArrayList<int[]>  initUserShipLocation() {
        ArrayList<int[]> shipLocations = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        //user input must be casted between 2 && 11;
        int x = -1;
        int y = -1;
        int[] userShipCoordinates = new int[2];
        int numberOfShipsDeployed = 0;
        boolean outOfBounds = true;
        while (numberOfShipsDeployed < 5) {
            while (outOfBounds) {
                System.out.print("Enter X coordinate for your ship: ");
                x = input.nextInt();
                System.out.print("Enter Y coordinate for your ship: ");
                y = input.nextInt();
                userShipCoordinates[0] = x + 2;
                userShipCoordinates[1] = y + 2;
                if (check2DArrayList(shipLocations, userShipCoordinates) == false) {
                    if ((userShipCoordinates[0] >= 2 && userShipCoordinates[0] <= 11) && (userShipCoordinates[1] >= 2 && userShipCoordinates[1] <= 11)) {
                        break;
                    } else {
                        System.out.println("location out of bounds");
                    }
                } else {
                    System.out.println("You have already placed a ship at that location");
                }
            }
            shipLocations.add(Arrays.copyOf(userShipCoordinates, 2));
            numberOfShipsDeployed ++;
            System.out.println(numberOfShipsDeployed);
            x = -1;
            y = -1;
        }
        return shipLocations;
    }

    private static ArrayList <int[]>  initComputerShips(ArrayList <int[]> userShipLocations) {
        ArrayList<int[]> computerShipLocations = new ArrayList<>();
        Random random = new Random();
        int count = 0;
        int innerCount = 0;
        int xCoord = -1;
        int yCoord = -1;
        int[] coords = new int[2];
        while (count < 5) {
            while (innerCount < 1 ) {
                xCoord = random.nextInt(9) + 2;
                yCoord = random.nextInt(9) + 2;
                coords[0] = xCoord;
                coords[1] = yCoord;
                if (check2DArrayList(computerShipLocations, coords) == false && check2DArrayList(userShipLocations, coords)) {
                    break;
                };
            }
            computerShipLocations.add(Arrays.copyOf(coords, 2));
            count ++;
        }
        return computerShipLocations;
    }

    private static String initGame() {
        System.out.println("*** Welcome to the Battleships game ***");
        System.out.println("Right now the sea is empty");
        int[][] board = Arrays.copyOf(makeBoard(10), 13);
        printInitialBoard(board);
        int xCoordinate;
        ArrayList <int[]> userShipLocations = initUserShipLocation();
        ArrayList <int[]> computerShipLocations = initComputerShips(userShipLocations);
        int yCoordinate;

        System.out.println(userShipLocations.get(1)[0] + "Sting");

        for (int i = 0; i < userShipLocations.size(); i++) {
            xCoordinate = userShipLocations.get(i)[0];
            yCoordinate = userShipLocations.get(i)[1];
            System.out.println((char) xCoordinate + " " + (char)yCoordinate);
            board[xCoordinate][yCoordinate] = -3;
            System.out.println(board[xCoordinate][yCoordinate]);

        }
        int[][] updatedBoard = Arrays.copyOf(board, 13);
        printInitialBoard(updatedBoard);
        System.out.println(updatedBoard[2][2]);
        int[] numbers = {3, 3};
        for (int i = 0; i < userShipLocations.size(); i++) {
            if (Arrays.equals(numbers, userShipLocations.get(i))) {
                System.out.println("String");
            }
        }
        System.out.println((Arrays.equals(numbers, userShipLocations.get(0))));
        System.out.println(Arrays.toString(userShipLocations.get(0)));
        System.out.println(Arrays.toString(userShipLocations.get(1)));
        System.out.println(Arrays.toString(userShipLocations.get(2)));
        System.out.println(Arrays.toString(userShipLocations.get(3)));
        System.out.println(Arrays.toString(userShipLocations.get(4)));

        int[] guessCoordinates = new int[2];
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        boolean guess;
        while (userShipLocations.size() > 0 && computerShipLocations.size() > 0) {
            System.out.println("YOUR TURN");
            System.out.print("Enter X coordinate for your ship: ");
            guessCoordinates[0] = input.nextInt();
            System.out.print("Enter Y coordinate for your ship: ");
            guessCoordinates[1] = input.nextInt();
            guess = check2DArrayList(computerShipLocations, guessCoordinates);
            if (guess == true) {
                System.out.println("You sank there battle ship at " + guessCoordinates[0] + "," + guessCoordinates[1] );
                for (int i = 0; i < computerShipLocations.size(); i++) {
                    if (Arrays.equals(guessCoordinates, computerShipLocations.get(i))) {
                        computerShipLocations.remove(i);
                    }
                }
            } else {
                System.out.println("You missed! at " + guessCoordinates[0] + "," + guessCoordinates[1]);
            }
            System.out.println("Computer's turns");
            guessCoordinates[0] = rand.nextInt(9) + 2;
            guessCoordinates[0] = rand.nextInt(9) + 2;
            guess = check2DArrayList(userShipLocations, guessCoordinates);
            if (guess == true) {
                System.out.println("They sank your battle ship at " + guessCoordinates[0] + "," + guessCoordinates[1] );
                for (int i = 0; i < computerShipLocations.size(); i++) {
                    if (Arrays.equals(guessCoordinates, userShipLocations.get(i))) {
                        userShipLocations.remove(i);
                    }
                }
            } else {
                System.out.println("They missed! at " + guessCoordinates[0] + "," + guessCoordinates[1]);
            }
        }
        if (computerShipLocations.size() == 0) {
            System.out.println("You win");
        } else {
            System.out.println("You lost");
        }
        return "hello";
    }



    public static void main(String[] args) {
        initGame();

    }
}
