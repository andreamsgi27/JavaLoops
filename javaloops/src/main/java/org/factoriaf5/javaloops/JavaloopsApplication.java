package org.factoriaf5.javaloops;
	
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaloopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaloopsApplication.class, args);
				Scanner scanner = new Scanner(System.in);
				int[] multiplicadores = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
				System.out.println("Escribe un número: ");
				int num = scanner.nextInt();
				tabla(num, multiplicadores);
				scanner.close();
			}

			public static String tabla (int num, int[]multiplicadores){
				String tabla = "";
				for (int i = 0;  i < multiplicadores.length; i++) {
					tabla += num + " x " + i + " = "  + num * multiplicadores[i] + "\n";
			}
			return tabla;
		}
	}