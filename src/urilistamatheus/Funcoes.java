/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urilistamatheus;

import java.util.Scanner;

/**
 *
 * @author pedri
 */
public class Funcoes {
    
    public static void Uri1865(){
        
        String nome;
        int casos, forca;
        
        Scanner ler = new Scanner(System.in);
        
        casos = ler.nextInt();
        
        if (casos > 0){
            
            for (int i = 0; i < casos; i++) {
                
                nome = ler.next();
                forca = ler.nextInt();

                if (nome.equalsIgnoreCase("thor") == true) {
                    System.out.println("Y");
                } else {
                    System.out.println("N");
                }              
            }                 
        }             
    }
    
    public static void Uri1866(){
        
        int casos, quantidade, soma=0;
        
        Scanner ler = new Scanner(System.in);
        
        casos = ler.nextInt();
        
        for (int i = 0; i < casos; i++) {
            
            quantidade = ler.nextInt();
            
            for (int j = 0; j < quantidade; j++) {
                
                if (j % 2 == 0) {
                    soma++;
                } else {
                    soma--;
                }
            }
            System.out.println(soma);
            soma=0;
        }       
    }
    
    public static void Uri1867(){
        
        int numero1, numero2, casas1, casas2, valor1 = 0, valor2 = 0;
        String auxiliar1, auxiliar2;
        char aux1, aux2;
        
        Scanner ler = new Scanner(System.in);
        
        numero1 = ler.nextInt();
        numero2 = ler.nextInt();
        
        auxiliar1 = Integer.toString(numero1);
        auxiliar2 = Integer.toString(numero2);
        
        casas1 = auxiliar1.length();
        casas2 = auxiliar2.length();
        
        if (casas1 != 1) {
            while (auxiliar1.length() > 1){   
                for (int i = 0; i < casas1; i++) {
                    aux1 = auxiliar1.charAt(i);
                    valor1 += aux1 - '0';
                }
                auxiliar1 = Integer.toString(valor1);
                casas1 = auxiliar1.length();
                if (casas1 == 1) {
                    break;
                }
            } 
        }else{
            valor1 = numero1;
        }
        
        System.out.println(valor1);
        
        if (casas2 != 1) {
            while (auxiliar2.length() > 1){   
                for (int j = 0; j < casas2; j++) {
                    aux2 = auxiliar2.charAt(j);
                    valor2 += aux2 - '0';
                }
                auxiliar2 = Integer.toString(valor2);
                casas2 = auxiliar2.length();
                if (casas2 == 1) {
                    break;
                }
            }
        }else{
            valor2 = numero2;
        }
        
        System.out.println(valor2);
        
        if (valor1 > valor2) {
            System.out.println("1");
        } else if(valor2 > valor1){
            System.out.println("2");
        } else {
            System.out.println("0");
        }
        
    }
    
    public static void Uri2863(){
        
        int voltas;
        double tempo, menor=12.00;
        
        Scanner ler = new Scanner(System.in);
        
        while(ler.hasNext()){
            
            voltas = ler.nextInt();
            
            if (voltas >= 2 && voltas <=99) {

                while (voltas > 0){

                    while (voltas-- >0){
                        tempo = ler.nextDouble();

                        if (tempo >= 9 && tempo <= 11) {       
                            if (tempo < menor) {
                                menor = tempo;
                            }       
                        } else {
                            break;
                        }                      
                    } 
                    System.out.printf("%.2f\n",menor);
                    menor = 12.00;
                }               
            } else {
                break;
            }
        }
    }
}
