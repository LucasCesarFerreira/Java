/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binaryinsertsort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author ailto
 */
public class LereEscrever {
    public static int[] leitor(String path, int[] num) throws IOException {
      BufferedReader buffread = new BufferedReader(new FileReader(path));
      String linha = "";
      int i = 0;
      int BufSiz=10;
      while(true){
          buffread.mark(BufSiz);
          linha = buffread.readLine();
          buffread.reset();
          if (linha != null){
              num[i] = Integer.parseInt(buffread.readLine());
              //System.out.println(num[i]);
              i++;
          }
          else{
              break;
          }
      }
      buffread.close();
      return num;
    }
}
