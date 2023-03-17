package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("****************************");
        System.out.println("* Conversão de Temperatura *");
        System.out.println("****************************");
        System.out.println("\n");
        
       
        Scanner sc = new Scanner(System.in);
        double tempC, tempK, tempF = 0.0;
        int menu = 0;
        int opc = 0;
       
        System.out.println("Selecione o Tipo de Conversão: ");
        do {
            System.out.println("-------------------------------------");
            System.out.println("1 = °C -> °F");
            System.out.println("2 = °C -> °K");
            System.out.println("3 = °F -> °C");
            System.out.println("4 = °F -> °K");
            System.out.println("5 = °K -> °C");
            System.out.println("6 = °K -> °F");
            System.out.println("0 = Sair do Programa");
            System.out.println("-------------------------------------");
           
            menu = sc.nextInt();
           
            if(menu == 1) {
                System.out.println("Digite a temperatura em °C: ");
                tempC = sc.nextDouble();
                tempF = (tempC * 9/5) + 32;
                System.out.println("##################################");
                System.out.println("\n");
                System.out.println("Resultado da Conversão: ");
                System.out.println("°C -> °F: " + tempF);
                System.out.println("\n");
                System.out.println("##################################");
                           
            }
            else if(menu == 2) {
                System.out.println("Digite a temperatura em °C: ");
                tempC = sc.nextDouble();
                tempK = tempC + 273.15;
                System.out.println("##################################");
                System.out.println("\n");
                System.out.println("Resultado da Conversão: ");
                System.out.println("°C -> °K: " + tempK);
                System.out.println("\n");
                System.out.println("##################################");
            
            
            }
            
            else if(menu == 3) {
                System.out.println("Digite a temperatura em °F: ");
                tempF = sc.nextDouble();
                tempC = (tempF - 32) * 5/9;
                System.out.println("##################################");
                System.out.println("\n");
                System.out.println("Resultado da Conversão: ");
                System.out.println("°F -> °C: " + tempC);
                System.out.println("\n");
                System.out.println("##################################");
            }
            
            else if (menu == 4) {
            	System.out.println("Digite a temperatura em °F: ");
                tempF = sc.nextDouble();
                tempK = (tempF - 32) * 5/9 + 273.15;
                System.out.println("##################################");
                System.out.println("\n");
                System.out.println("Resultado da Conversão: ");
                System.out.println("°F -> °K: " + tempK);
                System.out.println("\n");
                System.out.println("##################################");
            }
            
            else if (menu == 5) {
            	System.out.println("Digite a temperatura em °K: ");
                tempK = sc.nextDouble();
                tempC = tempK - 273.15;
                System.out.println("##################################");
                System.out.println("\n");
                System.out.println("Resultado da Conversão: ");
                System.out.println("°K -> °C: " + tempC);
                System.out.println("\n");
                System.out.println("##################################");
            }
            
            else if (menu == 6) {
            	System.out.println("Digite a temperatura em °K: ");
                tempK = sc.nextDouble();
                tempF = (tempK - 273.15) * 9/5 + 32;
                System.out.println("##################################");
                System.out.println("\n");
                System.out.println("Resultado da Conversão: ");
                System.out.println("°K -> °F: " + tempF);
                System.out.println("\n");
                System.out.println("##################################");
            }
            
            
            else if(menu == 0) {
                System.out.println("Você realmemente desja encerrar o programa? \n 1 - Sim \n 2 - Não");
                opc = sc.nextInt();
                if (opc == 1) {
                	break;
                } else {
                	continue;
                }
                
            }
           
        }while(menu >= 0 & menu < 7);
        System.out.println("Fim do programa!");
	}

}
