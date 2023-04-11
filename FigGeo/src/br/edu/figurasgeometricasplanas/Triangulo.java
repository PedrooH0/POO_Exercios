package br.edu.figurasgeometricasplanas;

public class Triangulo {
	public double altura;
	public double base;
	public double area;
	
	public void calcArea() {
	area = (base * altura) / 2; 
	System.out.println(area);  
	}
	
	public double calcAreaR() {
		area = (base * altura) / 2; 
		return area; 
		}
	
	public void calcArea(double b, double h) {
		area = (b * h)/2;
		System.out.println(area);
	      
		}
	
	 public void ListAtributo() {
		 System.out.println(base + " " + altura);
	 }
}

