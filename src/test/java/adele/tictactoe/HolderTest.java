package adele.tictactoe;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

public class HolderTest {
	/**
	 * Run the Color getColor() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetColor()
		throws Exception {
		Holder fixture = Holder.ANY;

		Color result = fixture.getColor();

		assertNotNull(result);
		assertEquals("java.awt.Color[r=255,g=255,b=255]", result.toString());
		assertEquals(255, result.getBlue());
		assertEquals(255, result.getGreen());
		assertEquals(255, result.getRed());
		assertEquals(1, result.getTransparency());
		assertEquals(255, result.getAlpha());
		assertEquals(-1, result.getRGB());
	}

	/**
	 * Run the Holder getOpposite() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetOpposite()
		throws Exception {
		Holder fixture = Holder.ANY;

		Holder result = fixture.getOpposite();

		assertNotNull(result);
		assertEquals(" ", result.getText());
		assertEquals("GAME", result.name());
		assertEquals("GAME", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the String getText() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetText()
		throws Exception {
		Holder fixture = Holder.ANY;

		String result = fixture.getText();

		assertEquals(" ", result);
	}

	/**
	 * Run the Color getTextColor() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetTextColor()
		throws Exception {
		Holder fixture = Holder.ANY;

		Color result = fixture.getTextColor();

		assertNotNull(result);
		assertEquals("java.awt.Color[r=255,g=0,b=255]", result.toString());
		assertEquals(255, result.getBlue());
		assertEquals(0, result.getGreen());
		assertEquals(255, result.getRed());
		assertEquals(1, result.getTransparency());
		assertEquals(255, result.getAlpha());
		assertEquals(-65281, result.getRGB());
	}

}