package br.edu.principal;

import br.edu.figurasgeometricasplanas.*;

public class Principal {

	public static void main(String[] args) {
		Triangulo objT1 = new Triangulo();
		objT1.altura = 5;
		objT1.base = 3;
		
		System.out.println("-------------");
		System.out.println("TRIÂNGULO");
		objT1.ListAtributo();
		
		objT1.calcArea();
		
		double resultT = objT1.calcAreaR();
		System.out.println(resultT);
		
		objT1.calcArea(objT1.altura,objT1.base);
		
		System.out.println("-------------");
		
		Quadrado objQ1 = new Quadrado();
		objQ1.lado = 2;
		
		System.out.println("QUADRADO");
		objQ1.ListAtributo();
		
		objQ1.calcArea();
		
		double resultQ = objQ1.calcAreaR();
		System.out.println(resultQ);
		
		objQ1.calcArea(objQ1.lado);
		
		System.out.println("-------------");
		
		Retangulo objR1 = new Retangulo();
		objR1.altura = 5;
		objR1.base = 3;
		
		System.out.println("RETÂNGULO");
		objR1.ListAtributo();
		
		objR1.calcArea();
		
		double resultR = objR1.calcAreaR();
		System.out.println(resultR);
		
		objR1.calcArea(objR1.altura,objR1.base);
		
		System.out.println("-------------");
		
		Circulo objC1 = new Circulo();
		objC1.raio = 2;
		
		System.out.println("Círculo");
		objC1.ListAtributo();
		
		objC1.calcArea();
		
		double resultC = objC1.calcAreaR();
		System.out.println(resultC);
		
		objC1.calcArea(objC1.raio);
		
		System.out.println("-------------");
		
		
		
		
	}

}