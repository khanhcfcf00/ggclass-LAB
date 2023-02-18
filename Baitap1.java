/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Baitap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n = new Scanner(System.in);
        
        System.out.print("nhap a: ");
        float a = n.nextFloat();
        System.out.print("nhap b: ");
        float b = n.nextFloat();
        if(a == 0){
           if(b==0){
               System.out.println("phuong trinh vo so nghiem");
           } 
           else{
               System.out.println("phuong trinh vo nghiem");
           }
        }
        else{
            if (b == 0){
                System.out.println("pt co 1 nghiem la x=0");
            }
            else{
                float c;
                c = -b/a;
                System.out.printf("pt co nghiem la: x= %2f", c);
            }
        }
    }
    
}
