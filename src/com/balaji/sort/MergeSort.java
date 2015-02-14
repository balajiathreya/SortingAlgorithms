package com.balaji.sort;

import java.util.Arrays;

/**
 * Created by balaji on 2/12/15.
 *
 *  Worst case performance	O(n log n)
 *  Best case performance   O(n log n) typical,  O(n) natural variant
 *  Average case performance	O(n log n)
 *  Worst case space complexity	O(n) auxiliary
 *
 */

public class MergeSort {
    private int[] array;

    MergeSort(int[] array){
        this.array = array;
    }

    int[] mergesort(int[] input){
        int size = input.length;
        if(size == 1){
            return input;
        }
        int mid = size/2;
        int[] left = Arrays.copyOfRange(input, 0, mid);
        int[] right = Arrays.copyOfRange(input, mid, size);
        int[] sortedleft = mergesort(left);
        int[] sortedright = mergesort(right);
        return merge(sortedleft,sortedright);
    }

    int[] merge(int[] left,int[] right){
        if(left.length == 0){
            return right;
        }
        else if(right.length == 0){
            return left;
        }
        else if(left[0] > right[0]){
            int[] result = new int[left.length + right.length];
            result[0] = right[0];
            int[] mergedResult = merge(left,Arrays.copyOfRange(right, 1 , right.length));
            for(int i = 1; i < result.length; i++){
                result[i] = mergedResult[i - 1];
            }
            return result;
        }
        else{
            int[] result = new int[left.length + right.length];
            result[0] = left[0];
            int[] mergedResult = merge(right,Arrays.copyOfRange(left, 1 , left.length));
            for(int i = 1; i < result.length; i++){
                result[i] = mergedResult[i - 1];
            }
            return result;
        }
    }

    public static void main(String[] args){
        int[] array = new int[]{5,121,0,11,13243,-10};
        MergeSort sort = new MergeSort(array);
        int[] sorted = sort.mergesort(array);
        for(int i:sorted){
            System.out.println(i);
        }
    }

}
