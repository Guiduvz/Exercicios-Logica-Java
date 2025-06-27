package faccat;
import java.util.Scanner;

public class ExercicioJava7 {

	public static void main(String[] args) {

		int anos;
		int meses;
		int dias;
		int idadeEmDias;

		Scanner entradaDados = new Scanner(System.in);
		System.out.println("Qual sua idade em anos completos?: ");
		anos = entradaDados.nextInt();
		System.out.println("E quantos meses completos já se passaram desde seu último aniversário?: ");
		meses = entradaDados.nextInt();
		System.out.println("E quantos dias se passaram desde o início deste mês?: ");
		dias = entradaDados.nextInt();
		idadeEmDias = (anos * 365) + (meses * 30) + dias;
		System.out.println("Sua idade total em dias é: " + idadeEmDias);
		entradaDados.close();
	}
}