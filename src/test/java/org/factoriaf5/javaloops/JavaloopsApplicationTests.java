package org.factoriaf5.javaloops;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaloopsApplicationTests {

	@Test
	void looptest() {
		int num = 5;
		int[] multiplicadores = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i = 0;  i < multiplicadores.length; i++) {
			System.out.println(num + " x " + multiplicadores[i] + " = " + num);
		}
		String result = JavaloopsApplication.tabla(num, multiplicadores);

		assertEquals("5 x 0 = 0\n" +
            "5 x 1 = 5\n" +
            "5 x 2 = 10\n" +
            "5 x 3 = 15\n" +
            "5 x 4 = 20\n" +
            "5 x 5 = 25\n" +
        	"5 x 6 = 30\n" +
            "5 x 7 = 35\n" +
            "5 x 8 = 40\n" +
            "5 x 9 = 45\n" +
            "5 x 10 = 50\n", result);
	}

	@Test
	void looptest2() {
		int num = -5;
		int[] multiplicadores = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i = 0;  i < multiplicadores.length; i++) {
			System.out.println(num + " x " + multiplicadores[i] + " = " + num);
		}
		String result = JavaloopsApplication.tabla(num, multiplicadores);

		assertEquals("-5 x 0 = 0\n" +
            "-5 x 1 = -5\n" +
            "-5 x 2 = -10\n" +
            "-5 x 3 = -15\n" +
            "-5 x 4 = -20\n" +
            "-5 x 5 = -25\n" +
        	"-5 x 6 = -30\n" +
            "-5 x 7 = -35\n" +
            "-5 x 8 = -40\n" +
            "-5 x 9 = -45\n" +
            "-5 x 10 = -50\n", result);
	}
}
