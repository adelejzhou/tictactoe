package adele.tictactoe;

import java.awt.event.MouseEvent;
import javax.swing.Box;
import org.junit.*;
import static org.junit.Assert.*;

public class ClickHandlerTest {
	/**
	 * Run the ClickHandler(TicTacToe) constructor test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testClickHandlerConstructorWithNullGame() 
			throws Exception {
		TicTacToe game = new TicTacToe();

		ClickHandler result = new ClickHandler(game);

		assertNotNull(result);
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testMouseClicked()
		throws Exception {
		ClickHandler fixture = new ClickHandler(new TicTacToe());
		MouseEvent e = new MouseEvent(Box.createGlue(), 1, 1L, 1, 1, 1, 1, true);

		fixture.mouseClicked(e);

	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testMouseEntered()
		throws Exception {
		ClickHandler fixture = new ClickHandler(new TicTacToe());
		MouseEvent e = new MouseEvent(Box.createGlue(), 1, 1L, 1, 1, 1, 1, true);

		fixture.mouseEntered(e);
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testMouseExited()
		throws Exception {
		ClickHandler fixture = new ClickHandler(new TicTacToe());
		MouseEvent e = new MouseEvent(Box.createGlue(), 1, 1L, 1, 1, 1, 1, true);

		fixture.mouseExited(e);

	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testMousePressed()
		throws Exception {
		ClickHandler fixture = new ClickHandler(new TicTacToe());
		MouseEvent e = new MouseEvent(Box.createGlue(), 1, 1L, 1, 1, 1, 1, true);

		fixture.mousePressed(e);

	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testMouseReleased()
		throws Exception {
		ClickHandler fixture = new ClickHandler(new TicTacToe());
		MouseEvent e = new MouseEvent(Box.createGlue(), 1, 1L, 1, 1, 1, 1, true);

		fixture.mouseReleased(e);

	}

}