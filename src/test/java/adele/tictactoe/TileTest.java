package adele.tictactoe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TileTest {
	/**
	 * Run the Tile(int,int,int,int,TicTacToe) constructor test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testTile()
		throws Exception {
		int x = 1;
		int y = 1;
		int width = 1;
		int height = 1;
		TicTacToe game = new TicTacToe();

		Tile result = new Tile(x, y, width, height, game);

		assertNotNull(result);
		assertEquals(1, result.getY());
		assertEquals(1, result.getX());
		assertEquals(1, result.getHeight());
		assertEquals(false, result.isClaimed());
		assertEquals(1, result.getWidth());
	}

	/**
	 * Run the void claim(Holder) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testClaim()
		throws Exception {
		Tile fixture = new Tile(1, 1, 1, 1, new TicTacToe());
		Holder h = Holder.ANY;

		fixture.claim(h);
	}

	/**
	 * Run the int getHeight() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetHeight()
		throws Exception {
		Tile fixture = new Tile(1, 1, 1, 1, new TicTacToe());

		int result = fixture.getHeight();

		assertEquals(1, result);
	}

	/**
	 * Run the Holder getHolder() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetHolder()
		throws Exception {
		Tile fixture = new Tile(1, 1, 1, 1, new TicTacToe());

		Holder result = fixture.getHolder();

		assertNotNull(result);
		assertEquals(" ", result.getText());
		assertEquals("GAME", result.name());
		assertEquals("GAME", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the int getWidth() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetWidth()
		throws Exception {
		Tile fixture = new Tile(1, 1, 1, 1, new TicTacToe());

		int result = fixture.getWidth();

		assertEquals(1, result);
	}

	/**
	 * Run the int getX() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetX()
		throws Exception {
		Tile fixture = new Tile(1, 1, 1, 1, new TicTacToe());

		int result = fixture.getX();

		assertEquals(1, result);
	}

	/**
	 * Run the int getY() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetY()
		throws Exception {
		Tile fixture = new Tile(1, 1, 1, 1, new TicTacToe());

		int result = fixture.getY();

		assertEquals(1, result);
	}

	/**
	 * Run the boolean inArea(int,int) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testInArea()
		throws Exception {
		Tile fixture = new Tile(1, 1, 1, 1, new TicTacToe());
		int x = 1;
		int y = 1;

		boolean result = fixture.inArea(x, y);

		assertEquals(true, result);
	}

	/**
	 * Run the boolean isClaimed() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testIsClaimed()
		throws Exception {
		Tile fixture = new Tile(1, 1, 1, 1, new TicTacToe());

		boolean result = fixture.isClaimed();

		assertEquals(false, result);
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testReset()
		throws Exception {
		Tile fixture = new Tile(1, 1, 1, 1, new TicTacToe());

		fixture.reset();

	}
}