package faccat;
import java.util.Scanner;

public class ExercicioJava5 {

	public static void main(String[] args) {
		int numero;
		int antecessor;
		Scanner escaneia = new Scanner(System.in);

		System.out.println("Digite um número: ");
		numero = escaneia.nextInt();
		antecessor = numero - 1;
		System.out.println("Número antecessor: " + antecessor);
		escaneia.close();
	}
}