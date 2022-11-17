package unico;

public class Ej_03 {

	public static void main(String[] args) {
		/* Implementar un método que calcule y muestre el área o el volumen de un cilindro, 
		 según se especifique. Para distinguir un caso de otro se le pasará un número 1 (para área) o 2 (para volumen). 
		 Además, hemos de pasarle al método el radio de la base y la altura.

		Área total: 2 PI r (h+r)
		Volumen: PI r^2 h
		*/
		int num1;
		double num2;
		double num3 = 0;
		
		num1= Util.leerInt("Escribe la altura: ");
		num2= Util.leerInt("Escribe el radio: ");
		Util.leerInt("Que quiere calcular? (1-Volumen o 2-Área):");
		double resultado = calculo (num1,num2,num3);
		Util.escribir(resultado);
		
		
	}

	public static double calculo (int codigo, double radio, double altura) {
		double resultado= 0.0;
		if (codigo ==1) {
			resultado = Math.PI*Math.pow(radio, 2)* altura; 
		}
		if (codigo ==2) {
			resultado=  Math.PI * radio *(altura * radio);
		}
		return resultado;
		
	}
}