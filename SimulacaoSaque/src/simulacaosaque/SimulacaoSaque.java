/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacaosaque;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class SimulacaoSaque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int valor;
        
        int n1=0;
        int n5=0;
        int n10=0;
        int n20=0;
        int n50=0;
        int n100=0;
        
        System.out.println("Digite o valor: ");
        valor = sc.nextInt();
        
        if(valor>1000 || valor <=0){
            System.out.println("Valor Inválido! ");
        }else{
            do{
                if(valor>=100){
                    n100++;
                    valor-=100;
                }else if(valor>=50){
                    n50++;
                    valor-=50;
                }else if(valor>=20){
                    n20++;
                    valor-=20;
                }else if(valor>=10){
                    n10++;
                    valor-=10;
                }else if(valor>=5){
                    n5++;
                    valor-=5;
                }else if(valor>=1){
                    n1++;
                    valor-=1;
                }
            }while(valor>0);
            System.out.println("Quantidades de notas: ");
            System.out.println("1 Real: " +n1);
            System.out.println("5 Reais: " +n5);
            System.out.println("10 Reais: " +n10);
            System.out.println("20 Reais: " +n20);
            System.out.println("50 Reais: " +n50);
            System.out.println("100 Reais: " +n100);
        }
    }
    
}
