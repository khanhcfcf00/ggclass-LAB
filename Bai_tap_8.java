/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_tap_8;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai_tap_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       int n=0;
       int i=1;
       int s=1;
       do{
            System.out.println("nhap so : ");
             n=input.nextInt();
             if(n<0){
                 System.out.println("loi!!! vui long nhap lai!!!");
             }
       }while(n<0);
       if(n==0){
           s = 1;
       }
       else{
           do{
           s=n*i;
           i++;
       }while(i<=n);
       }
       System.out.println(n+"! = "+s);
    }
    
}
