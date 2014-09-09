package adele.tictactoe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.swing.JFrame;

import org.junit.Test;

public class TicTacToeTest {
	/**
	 * Run the TicTacToe() constructor test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testTicTacToeConstructor()
		throws Exception {

		TicTacToe result = new TicTacToe();

		assertNotNull(result);
		assertEquals(64, result.getFontSize());
		assertEquals(false, result.allFull());
	}

	/**
	 * Run the boolean allFull() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testAllFull()
		throws Exception {
        TicTacToe game = new TicTacToe();

        boolean result = game.allFull();

		assertEquals(false, result);
	}

	/**
	 * Run the void attemptClaim(int,int) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testAttemptClaim()
		throws Exception {
        TicTacToe game = new TicTacToe();
		int x = 1;
		int y = 1;

        game.attemptClaim(x, y);

		// add additional test code here
	}

	/**
	 * Run the int getFontSize() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetFontSize()
		throws Exception {
        TicTacToe game = new TicTacToe();

        int result = game.getFontSize();

		assertEquals(64, result);
	}

	/**
	 * Run the JFrame getGameframe() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetGameframe()
		throws Exception {
        TicTacToe game = new TicTacToe();

        JFrame result = game.getGameframe();

		assertNotNull(result);
		assertEquals(3, result.getDefaultCloseOperation());
		assertEquals(null, result.getJMenuBar());
		assertEquals(null, result.getTransferHandler());
		assertEquals(0, result.getState());
		assertEquals(0, result.getCursorType());
		assertEquals(0, result.getExtendedState());
		assertEquals(null, result.getIconImage());
		assertEquals(null, result.getMaximizedBounds());
		assertEquals(false, result.isUndecorated());
		assertEquals(false, result.isResizable());
		assertEquals("Tic-Tac-Toe", result.getTitle());
		assertEquals(null, result.getMenuBar());
		assertEquals(true, result.isOpaque());
		assertEquals(null, result.getOwner());
		assertEquals(false, result.isActive());
		assertEquals(1.0f, result.getOpacity(), 1.0f);
		assertEquals(null, result.getShape());
		assertEquals(true, result.getFocusableWindowState());
		assertEquals(null, result.getWarningString());
		assertEquals(false, result.isAlwaysOnTop());
		assertEquals(true, result.isAlwaysOnTopSupported());
		assertEquals(true, result.isAutoRequestFocus());
		assertEquals(false, result.isFocused());
		assertEquals(false, result.isLocationByPlatform());
		assertEquals(null, result.getFocusOwner());
		assertEquals(null, result.getBufferStrategy());
		assertEquals(null, result.getFocusCycleRootAncestor());
		assertEquals(true, result.isFocusCycleRoot());
		assertEquals(true, result.isFocusableWindow());
		assertEquals(true, result.isValidateRoot());
		assertEquals(false, result.isShowing());
		assertEquals(1, result.countComponents());
		assertEquals(0.5f, result.getAlignmentX(), 1.0f);
		assertEquals(0.5f, result.getAlignmentY(), 1.0f);
		assertEquals(1, result.getComponentCount());
		assertEquals(false, result.isFocusTraversalPolicyProvider());
		assertEquals(true, result.isFocusTraversalPolicySet());
        //		assertEquals("javax.swing.JFrame[frame0,0,0,295x304,hidden,layout=java.awt.BorderLayout,title=Tic-Tac-Toe,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,3,25,289x276,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", result.toString());
		assertEquals("frame0", result.getName());
		assertEquals(null, result.getParent());
		assertEquals(true, result.isValid());
		assertEquals(true, result.isEnabled());
		assertEquals(false, result.isVisible());
        //assertEquals(0, result.getY());
		assertEquals(0, result.getX());
		assertEquals(304, result.getHeight());
		assertEquals(null, result.getDropTarget());
		assertEquals(true, result.getFocusTraversalKeysEnabled());
		assertEquals(false, result.getIgnoreRepaint());
		assertEquals(null, result.getInputMethodRequests());
		assertEquals(null, result.getMousePosition());
		assertEquals(true, result.isBackgroundSet());
		assertEquals(true, result.isCursorSet());
		assertEquals(true, result.isDisplayable());
		assertEquals(false, result.isDoubleBuffered());
		assertEquals(false, result.isFocusOwner());
		assertEquals(true, result.isFocusTraversable());
		assertEquals(true, result.isFocusable());
		assertEquals(true, result.isFontSet());
		assertEquals(true, result.isForegroundSet());
		assertEquals(false, result.isLightweight());
		assertEquals(true, result.isMaximumSizeSet());
		assertEquals(true, result.isMinimumSizeSet());
		assertEquals(false, result.isPreferredSizeSet());
		assertEquals(false, result.requestFocusInWindow());
		assertEquals(295, result.getWidth());
		assertEquals(false, result.hasFocus());
	}

	/**
	 * Run the Tile[] getTiles() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetTiles()
		throws Exception {
        TicTacToe game = new TicTacToe();

        Tile[] result = game.getTiles();

		assertNotNull(result);
		assertEquals(9, result.length);
		assertNotNull(result[0]);
		assertEquals(0, result[0].getY());
		assertEquals(0, result[0].getX());
		assertEquals(96, result[0].getHeight());
		assertEquals(96, result[0].getWidth());
		assertEquals(false, result[0].isClaimed());
		assertNotNull(result[1]);
		assertEquals(96, result[1].getY());
		assertEquals(0, result[1].getX());
		assertEquals(96, result[1].getHeight());
		assertEquals(96, result[1].getWidth());
		assertEquals(false, result[1].isClaimed());
		assertNotNull(result[2]);
		assertEquals(192, result[2].getY());
		assertEquals(0, result[2].getX());
		assertEquals(96, result[2].getHeight());
		assertEquals(96, result[2].getWidth());
		assertEquals(false, result[2].isClaimed());
		assertNotNull(result[3]);
		assertEquals(0, result[3].getY());
		assertEquals(96, result[3].getX());
		assertEquals(96, result[3].getHeight());
		assertEquals(96, result[3].getWidth());
		assertEquals(false, result[3].isClaimed());
		assertNotNull(result[4]);
		assertEquals(96, result[4].getY());
		assertEquals(96, result[4].getX());
		assertEquals(96, result[4].getHeight());
		assertEquals(96, result[4].getWidth());
		assertEquals(false, result[4].isClaimed());
		assertNotNull(result[5]);
		assertEquals(192, result[5].getY());
		assertEquals(96, result[5].getX());
		assertEquals(96, result[5].getHeight());
		assertEquals(96, result[5].getWidth());
		assertEquals(false, result[5].isClaimed());
		assertNotNull(result[6]);
		assertEquals(0, result[6].getY());
		assertEquals(192, result[6].getX());
		assertEquals(96, result[6].getHeight());
		assertEquals(96, result[6].getWidth());
		assertEquals(false, result[6].isClaimed());
		assertNotNull(result[7]);
		assertEquals(96, result[7].getY());
		assertEquals(192, result[7].getX());
		assertEquals(96, result[7].getHeight());
		assertEquals(96, result[7].getWidth());
		assertEquals(false, result[7].isClaimed());
		assertNotNull(result[8]);
		assertEquals(192, result[8].getY());
		assertEquals(192, result[8].getX());
		assertEquals(96, result[8].getHeight());
		assertEquals(96, result[8].getWidth());
		assertEquals(false, result[8].isClaimed());
	}

	/**
	 * Run the Holder getTurn() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetTurn()
		throws Exception {
        TicTacToe game = new TicTacToe();

        Holder result = game.getTurn();

		assertNotNull(result);
		assertEquals("X", result.getText());
		assertEquals("X", result.name());
		assertEquals("X", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the boolean hasWon(Holder) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testHasWon()
		throws Exception {
        TicTacToe game = new TicTacToe();
		Holder h = Holder.ANY;

        boolean result = game.hasWon(h);

		assertEquals(false, result);
	}

    /**
     * Run the boolean hasWon(Holder) method test.
     * 
     * @throws Exception
     * 
     */
    @Test
    public void testHasWonX() throws Exception {
        TicTacToe game = new TicTacToe();
        Holder h = Holder.X;

        game.attemptClaim(0, 0);
        boolean result = game.hasWon(h);
        assertEquals(false, result);

        game.attemptClaim(0, 96);
        result = game.hasWon(h);
        assertEquals(false, result);

        game.attemptClaim(0, 192);
        result = game.hasWon(h);
        assertEquals(true, result);

    }

	/**
	 * Run the void loadTiles() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testLoadTiles()
		throws Exception {
        TicTacToe game = new TicTacToe();

        game.loadTiles();

	}
}