/**Comentário documental com Java
 * @goal: Converte temperaturas de Fahrenheit para Celsius;
 * @author: Filipe Rios Maciel Maciel
 * @date: 22/01/2022
 * * *
 * @algorithm
 * Formula: celsius = (fahrenheit - Ajuste) x Fator
 * 1) Receber uma temperatura em Fahrenheit e converter pra Celsius
 * 2) Fazer o calculo
 * 3) Mostrar o resultado
 * * *
 * @declarations: 
 * Variáveis (São sepre em minúsculas):
 * c = Para receber o valor em Celsius
 * f = Recebe o valor de Farenheit
 * Constantes (São sempre em maiúsculas):
 * AJUSTE = 32 
 * FATOR = 5/9
 * * *
 * @notes:
 * 1) Java não é como Python; em java precisamos usar.
      Bibliotecas para receber informações do usuario.
      por isso usamos import java.util.Scanner;
   2) Usando a biblioteca.
      E atribuindo o valor recebida a variavel fahrenheit.
   3) Realizando o calculo e mostrnado o resultado.
 */

package fundamentos;

import java.util.Scanner; //(1)

public class ConversordeTemperatura {
	
	public static void main(String[] args) {
		
		double celsius;
		double fahrenheit;
		final double AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		
		System.out.println("Insira os graus em Fahrenheit\n"
				+ "Que serão convertidos para Celsius: ");
		try (Scanner scanner = new Scanner(System.in)) { //(2)
			fahrenheit = scanner.nextDouble();
		}
		System.out.println("Graus em Fahrenheit: " +fahrenheit+"°F."); //(3)
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("Convertidos\n"
				+ "Correspondem a: "+celsius+"°C.");
	}

}
