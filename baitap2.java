/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author ADMIN
 */
    import java.util.Scanner;
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // phương trình bật 2 gồm có các hệ số a,b,c
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
}

