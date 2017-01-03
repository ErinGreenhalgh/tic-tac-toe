import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class GameBoardTest {
    @Test
    public void representsCurrentBoard(){
        String[][] expectedBoard = new String[3][3];
        GameBoard board = new GameBoard();
        board.setCurrentBoard();
        assertArrayEquals(board.getCurrentBoard(), expectedBoard);
    }

    @Test
    public void canBeInitializedWithInputs(){
        int[] user = new int[2];
        user[0] = 0;
        user[1] = 0;

        int[] computer = new int[2];
        computer[0] = 1;
        computer[1] = 1;
        GameBoard board = new GameBoard(user, computer);
        assertArrayEquals(board.getUserInput(), user);
        assertArrayEquals(board.getComputerInput(), computer);
    }
}
