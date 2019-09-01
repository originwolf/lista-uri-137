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
        
        int numero1, numero2, valor1, valor2, n=0;
        String auxiliar1, auxiliar2;
        
        Scanner ler = new Scanner(System.in);
        
        numero1 = ler.nextInt();
        numero2 = ler.nextInt();
  
        while(n == 0){
            if (numero1 == 0 && numero2 == 0) {
                n++;
            }
            auxiliar1 = Integer.toString(numero1);
            auxiliar2 = Integer.toString(numero2);
            
            valor1 = 0;
            valor2 = 0;
            
            if (auxiliar1.length() > 1) {
                while (auxiliar1.length() > 1){   
                    for (int i = 0; i < auxiliar1.length(); i++) {
                        valor1 += auxiliar1.charAt(i) - '0'; 
                    }
                    auxiliar1 = Integer.toString(valor1);
                    if (auxiliar1.length() > 1) {
                        valor1 = 0;
                    }
                }
            } else {
                valor1 = numero1;
            }
                    
            if (auxiliar2.length() > 1) {
                while (auxiliar2.length() > 1){   
                    for (int i = 0; i < auxiliar2.length(); i++) {
                        valor2 += auxiliar2.charAt(i) - '0'; 
                    }
                    auxiliar2 = Integer.toString(valor2);
                    if (auxiliar2.length() > 1) {
                        valor2 = 0;
                    } 
                }
            } else {
                valor2 = numero2;
            }            

            if (valor1 > valor2) {
                System.out.println("1");
            } else if(valor2 > valor1){
                System.out.println("2");
            } else {
                System.out.println("0");
            }

            numero1 = ler.nextInt();
            numero2 = ler.nextInt();  
        }
    }
    
    public static void Uri1871(){
        int numero1, numero2, numero;
        String auxiliar, numeroFinal;
        
        Scanner ler = new Scanner(System.in);
        
        numero1 = ler.nextInt();
        numero2 = ler.nextInt();
        
        /*while(ler.hasNext()) {
            numero1 = ler.nextInt();
            numero2 = ler.nextInt();

            if(m == 0 && n == 0) {
                break;
            }

            auxiliar = Integer.toString(numero1 + numero2);
            auxiliar = auxiliar.replace("0", "");
            System.out.println(auxiliar);
        }*/
        
        while(true){
            if (numero1 == 0 && numero2 == 0) {
                break;
            }
            numero = numero1 + numero2;
            auxiliar = Integer.toString(numero);
            
            auxiliar = auxiliar.replace("0", "");
            
            System.out.println(auxiliar);
            numero1 = ler.nextInt();
            numero2 = ler.nextInt();
        }
    }
    
    public static void Uri1873(){
        
        int casos;
        String sheldon, rajesh;
        
        Scanner ler = new Scanner(System.in);
        
        casos = ler.nextInt();
        
        while(casos > 0){
            sheldon = ler.next();
            rajesh = ler.next();
            
            if(rajesh.equalsIgnoreCase(sheldon)){
                System.out.println("empate");
            } else if (rajesh.equalsIgnoreCase("tesoura") && sheldon.equalsIgnoreCase("papel")){
                System.out.println("sheldon");
            } else if (rajesh.equalsIgnoreCase("papel") && sheldon.equalsIgnoreCase("pedra")){
                System.out.println("sheldon");
            }else if (rajesh.equalsIgnoreCase("pedra") && sheldon.equalsIgnoreCase("lagarto")){
                System.out.println("sheldon");
            }else if (rajesh.equalsIgnoreCase("lagarto") && sheldon.equalsIgnoreCase("spock")){
                System.out.println("sheldon");
            }else if (rajesh.equalsIgnoreCase("spock") && sheldon.equalsIgnoreCase("tesoura")){
                System.out.println("sheldon");
            }else if (rajesh.equalsIgnoreCase("tesoura") && sheldon.equalsIgnoreCase("lagarto")){
                System.out.println("sheldon");
            }else if (rajesh.equalsIgnoreCase("lagarto") && sheldon.equalsIgnoreCase("papel")){
                System.out.println("sheldon");
            }else if (rajesh.equalsIgnoreCase("papel") && sheldon.equalsIgnoreCase("spock")){
                System.out.println("sheldon");
            }else if (rajesh.equalsIgnoreCase("spock") && sheldon.equalsIgnoreCase("pedra")){
                System.out.println("sheldon");
            }else if (rajesh.equalsIgnoreCase("pedra") && sheldon.equalsIgnoreCase("tesoura")){
                System.out.println("sheldon");
            } else {
                System.out.println("rajesh");
            }        
            casos--;
        }    
    }
    
    public static void Uri2146(){
        int senha;
        Scanner ler = new Scanner(System.in);

        while(ler.hasNext()){
            senha = ler.nextInt();
            System.out.println(--senha);
        }
    }
    
    public static void Uri2147(){    
        int casos;
        double resultado;
        String palavra;
        
        Scanner ler = new Scanner(System.in);
        
        casos = ler.nextInt();
        
        for(int i = 0; i < casos; i++){
            palavra = ler.next();
            resultado = palavra.length()*0.01;
            System.out.printf("%.2f\n",resultado);
        }
    }
    
    public static void Uri2581(){
        int casos;
        String pergunta;
        
        Scanner ler = new Scanner(System.in);
        
        casos = ler.nextInt();
        
        for(int i = 0; i < casos; i++){ 
            pergunta = ler.next();
            System.out.println("I am Toorg!");        
        }
    }
    
    public static void Uri2591(){
        int casos, contador, contador1, contador2, posicao;
        String ataque;
        
        contador1 = 0;
        contador2 = 0;
        posicao = 0;
        
        Scanner ler = new Scanner(System.in);
        
        casos = ler.nextInt();
        
        for(int i = 0; i < casos; i++){
            ataque = ler.next();
            for (int j = 1; j < ataque.length(); j++) {
                if (ataque.charAt(j) != 'a') {                  
                    posicao = j;
                    break;
                } else {
                    contador1++;
                }
            }
            
            for (int j = posicao + 3; j < ataque.length(); j++) {
                if (ataque.charAt(j) != 'a') {
                    break;
                } else {
                    contador2++;
                }
            }
            
            contador = contador1 * contador2;
            System.out.printf("k");
            
            for (int k = 0; k < contador; k++) {              
                System.out.printf("a");
            }
            System.out.printf("\n");
            contador1 = 0;
            contador2 = 0;
        }
    }
    
    public static void Uri2861(){    
        int casos;
        String pergunta;
        
        Scanner ler = new Scanner(System.in);
        
        casos = ler.nextInt();
        
        for(int i = 0; i < casos; i++){
            pergunta = ler.next();
            System.out.println("gzuz");
        }      
    }
    
    public static void Uri2862(){
        int casos, poderDeLuta;
        
        Scanner ler = new Scanner(System.in);
        
        casos = ler.nextInt();
        
        for(int i = 0; i < casos; i++){
            poderDeLuta = ler.nextInt();
            
            if(poderDeLuta <= 8000){
                System.out.println("Inseto!");
            } else {
                System.out.println("Mais de 8000!");
            }
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
