package tictactoe;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Tic-Tac-Toe
 *
 * @author  krzezinski
 * @version 1.0
 * @since   2020-07-29
 */

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    private static int xoDiff = 0;
    public static boolean noWinners = true;
    public static char userXO = 'O';
    public static char[][] boardPositions = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    private static void userMove() {
        boolean validMove = false;
        int colPos = 0;
        int rowPos = 0;
        while (!validMove) {
            validMove = true;
            try {
                System.out.print("Enter the coordinates: ");
                colPos = scanner.nextInt();
                rowPos = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                validMove = false;
                System.out.println("You should enter numbers!");
            }
            if (colPos < 0 || colPos > 3 || rowPos < 0 || rowPos > 3) {
                validMove = false;
                System.out.println("Coordinates should be from 1 to 3!");
            } else {
                if (boardPositions[3 - rowPos][colPos - 1] == ' ') {
                    validMove = true;
                } else {
                    validMove = false;
                    System.out.println("This cell is occupied! Choose another one!");
                }
            }
        }
        if (validMove) {
            userXO = (userXO == 'O') ? 'X' : 'O';
            boardPositions[3 - rowPos][colPos - 1] = userXO; // 'X';
        }
    } // userMove

    private static void findState() {
        boolean emptyCell = false;
        boolean oWins = false;
        boolean xWins = false;
        for (int i = 0; i < 3; i++){
            if (boardPositions[i][0] == boardPositions[i][1] && boardPositions[i][1] == boardPositions[i][2]){
                if (boardPositions[i][0] == 'X'){
                    xWins = true;
                } else if (boardPositions[i][0] == 'O'){
                    oWins = true;
                } else
                    emptyCell = true;
            }
            if (boardPositions[0][i] == boardPositions[1][i] && boardPositions[1][i] == boardPositions[2][i]){
                if (boardPositions[0][i] == 'X'){
                    xWins = true;
                } else if (boardPositions[0][i] == 'O'){
                    oWins = true;
                } else
                    emptyCell = true;
            }
            for (int j = 0; j < 3; j++) {
                if (boardPositions[i][j] == ' ') {
                    emptyCell = true;
                }
                if (boardPositions[j][i] == ' ') {
                    emptyCell = true;
                }
            }
        }
        if (boardPositions[0][0] == boardPositions[1][1] && boardPositions[1][1] == boardPositions[2][2]){
            if (boardPositions[1][1] == 'X'){
                xWins = true;
            } else if (boardPositions[1][1] == 'O'){
                oWins = true;
            } else
                emptyCell = true;
        }
        if (boardPositions[2][0] == boardPositions[1][1] && boardPositions[1][1] == boardPositions[0][2]){
            if (boardPositions[1][1] == 'X'){
                xWins = true;
            } else if (boardPositions[1][1] == 'O'){
                oWins = true;
            } else
                emptyCell = true;
        }
        if (xoDiff > 1) {
            System.out.println("Impossible");
            noWinners = false;
        } else if (!emptyCell && !oWins && !xWins) {
            System.out.println("Draw");
            noWinners = false;
        } else if (xWins && oWins) {
            System.out.println("Impossible");
            noWinners = false;
        } else if (xWins){
            System.out.println("X wins");
            noWinners = false;
        } else if (oWins){
            System.out.println("O wins");
            noWinners = false;
        }
    } // findState

    private static void printBoard() {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + boardPositions[i][j]);
            }
            System.out.println(" |");
        }
        System.out.println("---------");
    } // printBoard

    private static char[][] userInput() {
        String boardPositionsStr = "";
        int counter = 0;
        xoDiff = 0;
        do {
            if (!boardPositionsStr.isEmpty()) {
                System.out.println("Only 'X', '_', ' ' and 'O' are allowed, 9 positions total");
            }
            System.out.print("Enter cells: ");
            boardPositionsStr = scanner.nextLine().toUpperCase();
        } while (!boardPositionsStr.matches("[X_ O]+") || boardPositionsStr.length() != 9);
        int xCount = 0;
        int oCount = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boardPositions[i][j] = boardPositionsStr.charAt(counter);
                counter++;
                if (boardPositions[i][j] == 'X') {
                    xCount++;
                } else if (boardPositions[i][j] == 'O') {
                    oCount++;
                } else {
                    boardPositions[i][j] = ' ';
                }
            }
        }
        xoDiff = Math.abs(xCount - oCount);
        return boardPositions;
    } // userInput

    public static void main(String[] args) {
        printBoard();
        while (noWinners) {
            userMove();
            printBoard();
            findState();
        }
    } // main
}