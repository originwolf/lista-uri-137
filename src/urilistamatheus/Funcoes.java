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
        int valor1, valor2, n=0;
        String numero1, numero2, auxiliar1, auxiliar2;
        
        Scanner ler = new Scanner(System.in);

        while(true){
            numero1 = ler.next();
            numero2 = ler.next();
            
            if (Integer.parseInt(numero1) == 0 && Integer.parseInt(numero2) == 0) {
                break;
            }
            
            valor1 = 0;
            valor2 = 0;
            
            if (numero1.length() > 1) {
                while (numero1.length() > 1){   
                    for (int i = 0; i < numero1.length(); i++) {
                        valor1 += numero1.charAt(i) - '0'; 
                    }
                    numero1 = Integer.toString(valor1);
                    if (numero1.length() > 1) {
                        valor1 = 0;
                    }
                }
            } else {
                valor1 = Integer.parseInt(numero1);
            }
                    
            if (numero2.length() > 1) {
                while (numero2.length() > 1){   
                    for (int i = 0; i < numero2.length(); i++) {
                        valor2 += numero2.charAt(i) - '0'; 
                    }
                    numero2 = Integer.toString(valor2);
                    if (numero2.length() > 1) {
                        valor2 = 0;
                    } 
                }
            } else {
                valor2 = Integer.parseInt(numero2);
            }            

            if (valor1 > valor2) {
                System.out.println("1");
            } else if(valor2 > valor1){
                System.out.println("2");
            } else {
                System.out.println("0");
            } 
        }
    }
    
    public static void Uri1871(){
        int numero1, numero2, numero;
        String auxiliar, numeroFinal;
        
        Scanner ler = new Scanner(System.in);
        
        numero1 = ler.nextInt();
        numero2 = ler.nextInt();
        
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
    
    public static int Uri2149(){
        double posicao, resultado;
        
        Scanner ler = new Scanner(System.in);
        
        posicao = ler.nextDouble();
   
        double sequencia (int posicao) {
            if (posicao == 1){
                return 0;
            } else if (posicao == 2){
                return 1;
            }

            if (posicao % 2 == 0){
                return sequencia(posicao-2) * sequencia(posicao-1);
            } 
                
            if (posicao % 2 != 0){
                return sequencia(posicao-2) + sequencia(posicao-1);
            }        
        }
        
        resultado = sequencia(posicao);
    }
    
    public static void Uri2152(){
        int casos, estado, horas, minutos;
        String situacao, horasAux, minutosAux;
        
        Scanner ler = new Scanner(System.in);
        
        casos = ler.nextInt();
        
        for (int i = 0; i < casos; i++) {
            horas = ler.nextInt();
            minutos = ler.nextInt();
            estado = ler.nextInt();
            switch (estado) {
                case 1:
                    situacao = "A porta abriu!";
                    break;
                case 0:
                    situacao = "A porta fechou!";
                    break;
                default:
                    situacao = "Erro";
                    break;
            }
            
            if (horas < 10) {
                horasAux = Integer.toString(horas);
                horasAux = "0" + horasAux;
            } else {
                horasAux = Integer.toString(horas);
            }
            
            if (minutos < 10) {
                minutosAux = Integer.toString(minutos);
                minutosAux = "0" + minutosAux;
            } else {
                minutosAux = Integer.toString(minutos);
            }
            System.out.println(horasAux + ":" + minutosAux + " - " + situacao);
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
    
    public static void Uri2582(){
        int casos, numero1, numero2;
        
        Scanner ler = new Scanner(System.in);
        
        casos = ler.nextInt();
        
        for (int i = 0; i < casos; i++) {
            numero1 = ler.nextInt();
            numero2 = ler.nextInt();
            switch (numero1 + numero2) {
                case 0:
                    System.out.println("PROXYCITY");
                    break;
                case 1:
                    System.out.println("P.Y.N.G.");
                    break;
                case 2:
                    System.out.println("DNSUEY!");
                    break;
                case 3:
                    System.out.println("SERVERS");
                    break;
                case 4:
                    System.out.println("HOST!");
                    break;
                case 5:
                    System.out.println("CRIPTONIZE");
                    break;
                case 6:
                    System.out.println("OFFLINE DAY");
                    break;
                case 7:
                    System.out.println("SALT");
                    break;
                case 8:
                    System.out.println("ANSWER!");
                    break;
                case 9:
                    System.out.println("RAR?");
                    break;
                case 10:
                    System.out.println("WIFI ANTENNAS");
                    break;
                default:
                    break;
            }
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
    
    public static void Uri2866(){
        int casos;
        String mensagem;
        
        Scanner ler = new Scanner(System.in);
        
        casos = ler.nextInt();
        
        for (int i = 0; i < casos; i++) {
            mensagem = ler.next();
            for (int j = mensagem.length() - 1; j >= 0; j--) {
                if (Character.isLowerCase(mensagem.charAt(j))) {
                    System.out.printf("%c",mensagem.charAt(j));
                }
            }
            System.out.printf("\n");
        }
    }
}
