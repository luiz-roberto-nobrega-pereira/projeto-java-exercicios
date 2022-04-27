package salario;
import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		//ESTEIRA CODIGO 01
		//BIKE CODIGO 02
		
		System.out.println("Digite o código do exercicio : ");
		int exer = sc.nextInt();
		
		if(exer == 01) {
		System.out.println("Informe o seu peso: ");
		double peso = sc.nextDouble();
		
		System.out.println("Velocidade média (km/hr): ");
		double velMedia = sc.nextDouble();
		
		System.out.println("Informe a duração do exercicio em minutos: ");
		int tempo = sc.nextInt();
		
		double caloriasEst = tempo*velMedia*peso*0.0175;
		System.out.printf("Seu gasto calórico foi de %.2f calorias",caloriasEst);
		}
		else if(exer == 02) {
		System.out.println("Informe o seu peso: ");
		double peso = sc.nextDouble();
		
		System.out.println("Velocidade média (km/hr): ");
		double velMedia = sc.nextDouble();
		
		System.out.println("Informe a duração do exercicio em minutos: ");
		int tempo = sc.nextInt();
		
		double caloriasBike = tempo*velMedia*peso*0.0055;
		System.out.printf("Seu gasto calórico foi de %.2f calorias",caloriasBike);
		}
		else {
		    System.out.println("Não definido");
		}
		
		
		sc.close();
		}
		
		
	}

