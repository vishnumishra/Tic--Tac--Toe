import com.company.Game;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;


public class GameTest {
    private static final String GOLD_PATH = "test/Data";

    protected void equalsFile(String message, String fileName, String actualValue) throws IOException {
        BufferedReader file = new BufferedReader (new FileReader(GOLD_PATH + '/' + fileName));
        BufferedReader actualStream = new BufferedReader (new StringReader(actualValue));
        String thisFileLine;
        while  ((thisFileLine = file.readLine()) != null) {
            assertEquals ("in file: " + fileName, thisFileLine, actualStream.readLine());
        }
    }

    @Test
    public void testInitBoardShouldCreateTheBoard() throws IOException {
        Game game = new Game();
//        Map<Integer, String> board = game.getBoard();
//        System.out.println(GameBoard.getBoard(board));
//        equalsFile("createGameBoard","emptyBoard", GameBoard.getBoard(game.initBoard()));
        game.play();
    }


}
