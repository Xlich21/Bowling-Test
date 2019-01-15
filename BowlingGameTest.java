import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingGameTest {
    @Test
    public void testGutterGame(){
        BowlingGame game = new BowlingGame();
        for (int i=0; i<20; i++){
            game.roll(0);
        }
        assertEquals(0,game.score());
    }

    @Test
    public void testNormalGame(){
        BowlingGame game = new BowlingGame();
        for (int i=0; i<20; i++){
            game.roll(3);
        }
        assertEquals(60,game.score());
    }
    @Test
    public void testSpare(){
        BowlingGame game = new BowlingGame();
        game.roll(3);
        game.roll(7);
        game.roll(5);

        assertEquals(20,game.score());
    }
    @Test
    public void testStrike(){
        BowlingGame game = new BowlingGame();
        game.roll(10);
        game.roll(0);
        game.roll(3);
        game.roll(5);

        assertEquals(26,game.score());
    }

}