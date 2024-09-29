
import java.util.Scanner;

public class fator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Digite um número inteiro: ");
        int n = scanner.nextInt();
        
        
        int f = 1;
        int i = n;

        while ( i > 1) {
            f *= i;
            i--;            
        }

        System.out.println("O fatorial de " + n + " é " + f);
        
        scanner.close();
}
    
}