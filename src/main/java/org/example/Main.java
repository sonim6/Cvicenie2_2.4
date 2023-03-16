package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr= {10, 20, 2, 56, 66, -19, 120};

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int tmp= 0;
                if(arr[i]>arr[j]){
                   tmp= arr[i];
                   arr[i]=arr[j];
                   arr[j]=tmp;
                }
            }
        }
        System.out.println("Zoradene cisla: ");
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }
}