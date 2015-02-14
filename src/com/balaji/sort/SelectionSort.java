package com.balaji.sort;

/**
 * Created by balaji on 2/12/15.
 *
 * Worst case performance	O(n2)
 * Best case performance	O(n2)
 * Average case performance	O(n2)
 * Worst case space complexity	О(n) total, O(1) auxiliary
 *
 */
public class SelectionSort {

    int[] array;

    SelectionSort(int[] array){
        this.array = array;
    }


    public void selectionSort(){
        int min;
        for(int i = 0 ; i < array.length; i++){
            min = i;
            for(int j = i+1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            if(min != i){
                swap(min, i);
            }
        }

    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args){
        int[] input = {24,2,-45,20,56,75,2,-56,99,53,-12};
        SelectionSort sort = new SelectionSort(input);
        sort.selectionSort();
        for(int i:input){
            System.out.println(i);
        }
    }
}
