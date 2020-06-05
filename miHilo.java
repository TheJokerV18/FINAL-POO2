package Final;

public class miHilo extends Thread {

	private Integer nIteraciones;
	private Integer nCarro;

	public miHilo(Integer nIteraciones, Integer nCarro) {
		super();
		this.nIteraciones = nIteraciones;
		this.nCarro = nCarro;
	}

	public void run() {

		for (int i = 1; i <= nIteraciones; i++) {

			System.out.println("El carro " + nCarro + " avanzó " + i + " Km.");

		}

		System.out.println("El carro " + nCarro + " llego a su destino.");

	}

}
