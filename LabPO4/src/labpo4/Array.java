/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpo4;

import java.util.Arrays;

/**
 *
 * @author VITGR
 */
public class Array {

    private int[] value;

    Array(int[] value) {
        this.value = value;
    }

    public int[] convertArray() {
        int max = value[0];
        int min = value[0];
        int indexOfMaxElement = 0;
        int indexOfMinElement = 0;
        for (int i = 0; i < value.length; i++) {
            if (max <= value[i]) {
                max = value[i];
                indexOfMaxElement = i;
            }
            if (min >= value[i]) {
                min = value[i];
                indexOfMinElement = i;
            }
        }

        int lowIndex;
        int highIndex;
        if (indexOfMaxElement > indexOfMinElement) {
            lowIndex = indexOfMinElement;
            highIndex = indexOfMaxElement;
        } else {
            lowIndex = indexOfMaxElement;
            highIndex = indexOfMinElement;
        }

        int buffer;
        for (int i = lowIndex + 1; i < highIndex - i; i++) {
            buffer = value[i];
            value[i] = value[highIndex - i];
            value[highIndex - i] = buffer;
        }
        return value;
    }
}
