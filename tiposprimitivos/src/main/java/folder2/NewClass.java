/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folder2;

import java.util.Scanner;

/**
 *
 * @author lcferreira
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner entre= new Scanner(System.in);
        System.out.println("Entre com sua idade: ");
        int idade= entre.nextInt();
        String velho= Integer.toString(idade);
        System.out.println("Sua idade é: "+velho);
        String ano = "2032";
        int anual = Integer.parseInt(ano);
        System.out.println("O ano é: "+anual);
    }
}
