/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_tap_4;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class Bai_tap_4 {

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static void Baitap1(){
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
    public static void javaapplication3(){
        Scanner n = new Scanner(System.in);
        
        System.out.print("nhap a: ");
        float a = n.nextFloat();
        System.out.print("nhap b: ");
        float b = n.nextFloat();
        System.out.print("nhap c: ");
        float c = n.nextFloat();
        if(a == 0){
           if(b == 0){
               if(c == 0){
                   System.out.println("pt vo so nghiem");
               } else {
                   System.out.println(" pt khong co nghiem nao");
               }
           }
        }
        else{
            float d = (float) (Math.pow(b,2)-4*a*c);
            if(d == 0 ){
                System.out.printf("phuong trinh co nghiem kep: x1= x2= %f ",-b/2*a );
            }
            else if(d < 0){
                System.out.print("pt vo nghiem");
                        }
            else if(d > 0){
                float x1 = (float) ((-b + Math.sqrt(d))/2*a);
                float x2 = (float) ((-b - Math.sqrt(d))/2*a);
                System.out.printf("pt co 2 nghiem phan biet la " +"x1= "+ x1+ "x2= "+ x2);
            }
        }
    }
    private static void Bai_tap_3(){
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

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n = new Scanner(System.in);
        System.out.println("+---------------------------------------------------+\n" +
                            "1. Giai phuong trinh bac nhat\n" +
                            "2. Giai phuong trinh bac 2\n" +
                            "3. Tinh tien dien\n" +
                            "4. Ket thuc\n" +
                            "+---------------------------------------------------+");
        
        System.out.print("chon muc can tinh: ");
        int chon = n.nextInt();
switch(chon) {
    case 1 : Baitap1();
    break;
    case 2 : javaapplication3();
    break;
    case 3 : Bai_tap_3();
    break;
    case 4 : System.out.println("bai bai");
    break;
    default : System.out.print("nhap sai r");
    return ;
    }
}
}