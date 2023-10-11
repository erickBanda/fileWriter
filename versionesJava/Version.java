package versiones;

import java.util.Scanner;

public class Version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("¿En qué año naciste?");
		Scanner an = new Scanner(System.in);
		int anni = an.nextInt();
		int edad = 2023 - anni;
		System.out.printf("tu edad es de %d%n", edad);
	}

}
