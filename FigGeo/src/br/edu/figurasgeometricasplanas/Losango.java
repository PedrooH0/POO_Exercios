package br.edu.figurasgeometricasplanas;

public class Losango {
	public double diagonalMa;
	public double diagonalMe;
	public double area;
	
	public void calcArea() {
		area = (diagonalMa * diagonalMe)/2; 
		System.out.println(area);  
	}
	
	public double calcAreaR() {
		area = (diagonalMa * diagonalMe)/2; 
		return area; 
		}
	
	public void calcArea(double dma, double dme) {
		area = (diagonalMa * diagonalMe)/2;
		System.out.println(area);
	      
		}
	
	 public void ListAtributo() {
		 System.out.println(diagonalMa + " " + diagonalMe);
	 }
}
