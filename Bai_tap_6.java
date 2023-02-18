/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_tap_6;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class Bai_tap_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n = new Scanner(System.in);
        System.out.println("nhap ten hoc sinh");
        String ten = n.nextLine();
        System.out.println("nhap diem hoc sinh");
        float diem = n.nextFloat();
        if (diem < 5 ){
            System.out.printf(ten + "hoc  luc: kem");    
        }
        else if(diem >=5 && diem < 7){
            System.out.printf( ten + "hoc  luc: trung binh");
        }
        else if(diem >= 7 && diem < 8){
            System.out.printf(ten + "hoc  luc: kha");
        }
        else if(diem >=8 && diem <=10){
            System.out.printf( ten + "hoc  luc: gioi");
        }
        else{
            System.out.printf("nhap sai diem roi, nhap lai di");
        }
    }
    
}
