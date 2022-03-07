package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner imdat=new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz= ");
        int n = imdat.nextInt();
        System.out.print("Üs olacak sayıyı giriniz= ");
        int k = imdat.nextInt();
        int total=1;
        for (int i=1;i<=k;i++){
            total=total*n;

        /*while (i<=k){
           total*=n;
           i++;*/
        }
        System.out.println("Cevap="+total);
    }
}
