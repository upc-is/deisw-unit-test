package whitebox;

import java.util.concurrent.ThreadLocalRandom;

public class Helper {
	public static int[] generarArrayAleatorio(int cantidad) {
		int[] array = new int[cantidad];
		for (int n = 0; n < cantidad; n++) {
			array[n] = ThreadLocalRandom.current().nextInt(0, 100000 + 1);
		}
		return array;
	}
}
