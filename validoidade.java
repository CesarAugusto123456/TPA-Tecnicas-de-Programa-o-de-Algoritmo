import java.util.Scanner;
public class validoidade {
	
	
		public static void main(String args[]) {
			Scanner ler = new Scanner(System.in);
			int i = 1,an, aa, id;
				System.out.println("Valide a maioridade de até 6 pessoas");
			while(i<=6) {
				System.out.println("Insira o ano atual");
				aa = ler.nextInt();
				System.out.println("Insira o ano que a pessoa nasceu: ");
				an = ler.nextInt();
				id = aa-an;
				System.out.println("A pessoa tem: " + id + " anos.");
				if(id<18) {
					System.out.println("Esta pessoa é de menó.");
				}
				else {
					System.out.println("Essa pessoa é de maió.");
				}
			}
			ler.close();
		}
}

			
	

