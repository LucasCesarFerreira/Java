/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.binaryinsertsort;

import java.io.IOException;

/**
 *
 * @author ailto
 */
public class BinaryInsertSort {

    public static void main(String[] args) throws IOException {
        String caminho = "C:/Users/ailto/OneDrive/Área de Trabalho/Faculdade/APS/2023-2semestre/txts/1000_numbers.txt";
        int[] num ;
        num = new int[1000];
        num = LereEscrever.leitor(caminho, num);
        bIs.binaryInsertionSort(num);
    }

}