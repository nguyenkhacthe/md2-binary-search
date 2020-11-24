package com.codegym;

public class Main {
    static int[] list = {1,2,3,4,5,6,7,8,9};
    public static void main(String[] args) {
	// write your code here
        System.out.println(find(list,10));
    }

    private static int find(int[] arr, int number) {
        int low = 0;
        int high = arr.length -1;

        while (low <= high){
            int mid = (low+ high)/2;
            int val = arr[mid];

            if(val > number){
                high = mid -1;
            }else if(val < number){
                low = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
