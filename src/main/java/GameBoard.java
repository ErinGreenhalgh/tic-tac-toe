import java.lang.reflect.Array;

public class GameBoard {
    int[] userInput;
    int[] computerInput;
    String[][] currentBoard;

    public GameBoard(int[] user, int[] computer){
        userInput = user;
        computerInput = computer;
    }

    public GameBoard(){
        userInput = null;
        computerInput = null;
    }

    void setCurrentBoard(){
        currentBoard = new String[3][3];
    }

    int[] getUserInput(){
        return userInput;
    }

    int[] getComputerInput(){
        return computerInput;
    }

    String[][] getCurrentBoard(){
        //returns the latest version of the current board
        return currentBoard;
    }
}
