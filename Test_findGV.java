/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GGV;
import java.util.*;

/**
 *
 * @author THANTHUY
 */
public class Test_findGV {
    public static void dogetGV(){
        XLGV xl = new XLGV();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap don vi cong tac: ");
        String dv = sc.next();
        System.out.println("Nhap so cong trinh: ");
        int ct = sc.nextInt();
        xl.getGV(dv, ct);
    }
    
    public static void main(String[] args) {
        dogetGV();
    }
}
