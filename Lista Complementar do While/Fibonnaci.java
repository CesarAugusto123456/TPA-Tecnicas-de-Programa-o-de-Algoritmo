import java.util.Scanner;
public class Fibonnaci {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a = 0,at = 1, n, i = 1, temp;
		System.out.println("Insira o termo que definir a sequencia de fibonacci");
		n = ler.nextInt();
		while(i<= n) {
			System.out.println(at);
			temp = at;
			at = a + at;
			a = temp;
			i++;
			ler.close();		
		}
	}
}


