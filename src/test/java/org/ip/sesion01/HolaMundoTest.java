package org.ip.sesion01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class HolaMundoTest {

	@Test
	public void testHolaMundo() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		try {
			System.setOut(new PrintStream(outContent));
			HolaMundo.main(new String[]{});
			assertEquals("Hola Mundo" + System.lineSeparator(), outContent.toString());
		} finally {
			System.setOut(originalOut);
		}
	}

}
