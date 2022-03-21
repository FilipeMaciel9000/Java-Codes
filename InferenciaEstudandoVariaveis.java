/**
*  @goal: Programa que mostra todas as variaveis em Java;
*  @author: Filipe Rios Maciel Maciel;
*  @date: 09/02/2022;
* * *
* @algorithm:
* 1) Declarar todos os tipos primitivos em Java usando inferencia;
* String não é tipo primitivo;
* 2) Mostrar todas as variaveis e dizer quais os tipos primitivos na tela;
* * *
*  @Declarations:
* x e y são do tipo boolean;
* a é do tipo char;
* b é do tipo byte; 
* c é do tipo short;
* d é do tipo int;
* e é do tipo long;
* f é do tipo float;
* g é do tipo double;
* * *
* @notes:
* Usei a biblioteca Math pra mostra um numero do tipo long
* (Como mostrava na tabela do Gustavo Guanabara)
*/
package fundamentos;

public class EstudandoVariaveis {

	public static void main(String[] args) {
		var x = true;
		var y = false;
		var a = "A";
		var b = 123;
		var c = 32767;
		var d = 2143578;
		var e = Math.pow(2,63);
		var f = 100.9669f;
		var g = 586932.58694376;
		System.out.println(x);
		System.out.println(y);
    System.out.println("As variaveis x: "+x+
				" e y: "+y+" são do tipo Boolean");
		System.out.println(a);
		System.out.println("A variável a: "+a+" é do tipo char;");
		System.out.println(b);
		System.out.println("A variável b: "+b+" é do tipo byte;");
		System.out.println(c);
		System.out.println("A variável c: "+c+" é do tipo short;");
		System.out.println(d);
		System.out.println("A variável d: "+d+" é do tipo int;");
		System.out.println(e);
		System.out.println("A variável e: "+e+" é do tipo long;");
		System.out.println(f);
		System.out.println("A variável f: "+f+" é do tipo float;");
		System.out.println(g);
		System.out.println("A variável g: "+g+" é do tipo double;");


	}

}
