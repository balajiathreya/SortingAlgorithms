package com.balaji.sort;

/**
 * Created by balaji on 2/12/15.
 *
 * Worst case performance	O(n2)
 * Best case performance	O(n)
 * Average case performance	O(n2)
 * Worst case space complexity	O(1) auxiliary
 *
 */
public class BubbleSort {

    private int[] array;

    BubbleSort(int[] array){
        this.array = array;
    }

    public void bubblesort() {
        int endIndex = array.length;
        int k;
        for (int i = endIndex; i >= 0; i--) {
            for (int j = 0; j < endIndex - 1; j++) {
                k = j + 1;
                if (array[j] > array[k]) {
                    swap(j, k);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] input = {24,2,-45,20,56,75,2,-56,99,53,-12};
        BubbleSort bubbleSort = new BubbleSort(input);
        bubbleSort.bubblesort();

        for (int i : input){
            System.out.println(i);
        }

    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
