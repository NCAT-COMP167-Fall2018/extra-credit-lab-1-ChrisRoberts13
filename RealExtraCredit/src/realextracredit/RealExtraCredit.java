/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realextracredit;

/**
 *
 * @author cbrobert
 */
public class RealExtraCredit {
private static char [][]gameBoard;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        gameBoard = createBoard('b');
        printBoard();
        // TODO code application logic here
    }
    private static char [][] createBoard(char startingCharacter){
        char[][] returnBoard = new char[6][7];
    for (char[] returnBoard1 : returnBoard) {
        for (int j = 0; j < returnBoard1.length; j++) {
            returnBoard1[j] = startingCharacter;
        }
    }
    return returnBoard;
}
    private static void printBoard(){
    for (char[] gameBoard1 : gameBoard) {
        for (int j = 0; j < gameBoard1.length; j++) {
            System.out.print(gameBoard1[j]);
        }
        System.out.println();
    }
}
}