import java.util.Scanner;
public class IdadeDezUsuarios {
	
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int aa, an, id, idnovo = 1000, idvelho = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Insira o ano Atual : ");
            aa = ler.nextInt();
            System.out.println("Insira teu ano de nascimento: ");
            an = ler.nextInt();
            id = aa - an;

            System.out.println("Essa pessoa tem " + id + " anos de idade.");
            if (id < idnovo) {
                idnovo = id;
            }
            if (id > idvelho) {
            	idvelho = id;
            }
        }
        System.out.println("A pessoa mais nova possui " + idnovo + " anos, e o mais velho possui " + idvelho + " anos");
        ler.close();	
    }
}