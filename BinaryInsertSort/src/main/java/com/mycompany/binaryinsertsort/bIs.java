/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binaryinsertsort;

//import static com.mycompany.binaryinsertsort.achaPosicao;

import java.util.Arrays;


/**
 *
 * @author ailto
 */
public class bIs {
    public static void binaryInsertionSort(int[] nums) {
        int length = nums.length;

        for (int i = 1; i < length; ++i) {
            int key = nums[i];
            int insertedPosition = achaPosicao.findPosition(nums, 0, i - 1, key);

            for (int j = i - 1; j >= insertedPosition; --j) {
                nums[j + 1] = nums[j];
            }

            nums[insertedPosition] = key;
        }
        
        //System.out.println(Arrays.toString(nums));
        //for(int i=0;i<nums.length;i++){
            //System.out.println(nums[i]);
            //i++;
        //}
    }
}
