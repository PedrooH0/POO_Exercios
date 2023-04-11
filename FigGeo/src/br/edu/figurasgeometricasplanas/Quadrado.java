package br.edu.figurasgeometricasplanas;

public class Quadrado {
	public double lado;
	public double area;
	
	public void calcArea() {
		area = lado * lado; 
		System.out.println(area);  
		}
		
		public double calcAreaR() {
			area = lado * lado; 
			return area; 
			}
		
		public void calcArea(double l) {
			area = lado * lado;
			System.out.println(area);
		      
			}
		
		 public void ListAtributo() {
			 System.out.println(lado);
		 }
}
