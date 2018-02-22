/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpo4;

import java.util.Scanner;

/**
 *
 * @author VITGR
 */
public class LabPO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите длину массива");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Введите " + (i + 1) + "-й элемент массива");
            array[i] = scanner.nextInt();
        }
        Array arr = new Array(array);
        System.out.println("Преобразованный массив");
        int[] newArray = arr.convertArray();;
        for (int i = 0; i < arrayLength; i++) {
            System.out.println(newArray[i]+" ");
        }

    }
}
