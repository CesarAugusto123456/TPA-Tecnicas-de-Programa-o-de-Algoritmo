
import java.util.Scanner;
public class PesoIdeal {
 public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	double a, f, m;
	String sexo;
	int resposta;
	do {
		System.out.println("insira seu sexo entre masculino (M) ou feminino (F):");
		sexo = ler.next();
		
		if(sexo.equalsIgnoreCase("m")) {
			System.out.println("coloque sua altura, em centimetros, para que  calculo do seu peso mostre.");
			a = ler.nextDouble();
			m = 52 + (0.75 *(a - 152.4));
			System.out.println("Seu peso ideal seria de:"+Math.ceil(m)+"kilos");
		}
		
		else if(sexo.equalsIgnoreCase("f")) {
			System.out.println("coloque sua altura, em centimetros, para que  calculo do seu peso.");
			a = ler.nextDouble();
			f = 52 + (0.67 *(a - 152.4));
			System.out.println("Seu peso ideal seria de:"+Math.ceil(f)+"kilos");
		}
		else {
			System.out.println("por favor, insira um sexo válido");
		}
		System.out.println("Se deseja continuar a verificação do seu peso ideal, iserir: 1, se Caso o ao contrario digite :2"); 
		resposta = ler.nextInt();
		} while(resposta == 1); 
			ler.close(); 
	}
}

 
			
 