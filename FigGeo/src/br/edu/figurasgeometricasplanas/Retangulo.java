package br.edu.figurasgeometricasplanas;

public class Retangulo {
	public double altura;
	public double base;
	public double area;
	
	public void calcArea() {
	area = base * altura; 
	System.out.println(area);  
	}
	
	public double calcAreaR() {
		area = base * altura; 
		return area; 
		}
	
	public void calcArea(double b, double h) {
		area = b * h;
		System.out.println(area);
	      
		}
	
	 public void ListAtributo() {
		 System.out.println(base + " " + altura);
	 }
}
