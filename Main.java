package Final;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese la distancia que va a recorrer el carro 1.");

		int x1 = scan.nextInt();

		System.out.println("Ingrese la distancia que va a recorrer el carro 2.");

		int x2 = scan.nextInt();

		System.out.println("Ingrese la distancia que va a recorrer el carro 3.");

		int x3 = scan.nextInt();

		miHilo hilo1 = new miHilo(x1, 1);
		miHilo hilo2 = new miHilo(x2, 2);
		miHilo hilo3 = new miHilo(x3, 3);

		hilo1.start();
		hilo2.start();
		hilo3.start();

	}

}
