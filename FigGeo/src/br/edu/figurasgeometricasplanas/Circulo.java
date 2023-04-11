package br.edu.figurasgeometricasplanas;

public class Circulo {
	public double pi = 3.14;
	public double raio;
	public double area;
	
	public void calcArea() {
		area = pi * (raio * raio); 
		System.out.println(area);  
	}
	
	public double calcAreaR() {
		area = pi * (raio * raio); 
		return area; 
		}
	
	public void calcArea(double r) {
		area = pi * (raio * raio);
		System.out.println(area);
	      
		}
	
	 public void ListAtributo() {
		 System.out.println(pi + " " + raio);
	 }
}
