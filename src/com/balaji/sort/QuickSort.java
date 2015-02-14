package com.balaji.sort;

/**
 * Created by balaji on 2/12/15.
 *
 * Worst case performance	O(n2)
 * Best case performance	O(n log n) (simple partition) or O(n) (three-way partition and equal keys)
 * Average case performance	O(n log n)
 * Worst case space complexity	O(n) auxiliary (naive) O(log n) auxiliary (Sedgewick 1978)
 *
 */
public class QuickSort {

    private int array[];

    public QuickSort(int[] array){
        this.array = array;
    }

    public void quickSort(int start, int end) {
        int i = start;
        int j = end;
        int pivot = array[start+(end-start)/2];
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(i, j);
                i++;
                j--;
            }
            else if( i == j){
                i++;
                j--;
            }
        }

        if (start < j)
            quickSort(start, j);
        if (i < end)
            quickSort(i, end);
    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String a[]){
        int[] input = {24,2,-45,20,56,75,2,-56,99,53,-12};
        QuickSort quicksort = new QuickSort(input);
        quicksort.quickSort(0, quicksort.array.length-1);
        for(int i:input){
            System.out.println(i);
        }
    }
}
