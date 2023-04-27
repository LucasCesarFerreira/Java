/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author lcferreira
 */
public class Tiposprimitivos {

    public static void main(String[] args) {
    /*    Scanner notita = new Scanner (System.in);
        System.out.println("Entre com seu nome: ");
        String nome = notita.nextLine();
        float nota = 7.5f;
        float nota2 = (float) 8.25;
        System.out.println("Entre com sua nota: ");
        float nota3 = notita.nextFloat();
        System.out.println("sua nota é: "+ nota);
        System.out.println("sua nota2 é: "+ nota2);
        System.out.println("sua nota3 é: "+nota3);
        System.out.printf("a nota3 de %s formatada é: %.2f",nome, nota3);
    ---------------------------------------------------------------------------
        int idade;
        Scanner ano= new Scanner(System.in);
        System.out.println("Entre com seu ano de nascimento: ");
        int nasc= ano.nextInt();
        idade=2023-nasc;
        if (idade>=16)
            if(idade<18 ||idade>70)
                System.out.printf("O usuario tem %d anos, seu voto é opcional",idade);
            else
                System.out.printf("O usuario tem %d anos, seu voto não é opcional",idade);
        else
            System.out.printf("O usuario tem %d anos!,não possui a idade minima para votar",idade);
            
      */ 
        Scanner teclado= new Scanner(System.in);
        System.out.println("Insira sua primeira nota:");
        float n1=teclado.nextFloat();
        System.out.println("Insira sua segunda nota:");
        float n2=teclado.nextFloat();
        float m=(n1+n2)/2;
        System.out.printf("Sua média é "+m);
        if (m>=9){
            System.out.println(", Parabens!");
        }else if (m<9 && m>=6){
                System.out.println(", aprovado");  
        }else{
                System.out.println(", reprovado");
            }   
    }
}
