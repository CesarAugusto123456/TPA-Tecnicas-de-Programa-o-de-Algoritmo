package somatoria;

public class soma {
 public static void main(String[] args) {
	int i =1, somar=0;
	while (i<101) {
		
		somar+=i; //soma = soma +i
		i++; // i=i+1, i+=1
	}
	System.out.println("A somatoria de 1 a 100 é " +somar);
}
}
