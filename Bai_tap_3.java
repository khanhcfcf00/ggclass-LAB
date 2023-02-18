/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_tap_3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai_tap_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n = new Scanner(System.in);
        
        System.out.print("nhap so dien da dung: ");
        float a = n.nextFloat();
        if (a<=0){
        System.out.println("so dien khong duoc be hon 0 nha!");}
        else if (a>0 && a <= 50){
            float b;
            b= a*1000;
            System.out.printf("tien dien thang nay la: %3f", b);
        }
        else{
            float c;
            c = 50*1000+(a-50)*1200;
            System.out.printf("tien dien thang nay la: %3f", c);
        }
       
    }
    
}
