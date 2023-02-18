/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_tap_5;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class Bai_tap_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n = new Scanner(System.in);
        System.out.print("xin nhap so nguyen vao day: ");
        int a = n.nextInt();
        if( a == 1){
            System.out.print("a la so chinh phuong");
        }else{
        int i=0;
        while( i <= a/2 ){
            if (Math.pow(i,2) == a) {
                System.out.print("day la so chinh phuong");
            }i++;
            }
        }
    }
}
