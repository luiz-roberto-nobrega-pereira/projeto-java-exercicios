package salario;
import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		//ESTEIRA CODIGO 01
		//BIKE CODIGO 02
		
		System.out.println("Digite o c�digo do exercicio : ");
		int exer = sc.nextInt();
		
		if(exer == 01) {
		System.out.println("Informe o seu peso: ");
		double peso = sc.nextDouble();
		
		System.out.println("Velocidade m�dia (km/hr): ");
		double velMedia = sc.nextDouble();
		
		System.out.println("Informe a dura��o do exercicio em minutos: ");
		int tempo = sc.nextInt();
		
		double caloriasEst = tempo*velMedia*peso*0.0175;
		System.out.printf("Seu gasto cal�rico foi de %.2f calorias",caloriasEst);
		}
		else if(exer == 02) {
		System.out.println("Informe o seu peso: ");
		double peso = sc.nextDouble();
		
		System.out.println("Velocidade m�dia (km/hr): ");
		double velMedia = sc.nextDouble();
		
		System.out.println("Informe a dura��o do exercicio em minutos: ");
		int tempo = sc.nextInt();
		
		double caloriasBike = tempo*velMedia*peso*0.0055;
		System.out.printf("Seu gasto cal�rico foi de %.2f calorias",caloriasBike);
		}
		else {
		    System.out.println("N�o definido");
		}
		
		
		sc.close();
		}
		
		
	}

