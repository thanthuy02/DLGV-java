/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GGV;

/**
 *
 * @author THANTHUY
 */
public  abstract class Person {
    private int maDD;
    private String hoTen;
    private String gioiTinh;

    public Person() {
    }

    public Person(int maDD, String hoTen, String gioiTinh) {
        this.maDD = maDD;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
    }

    public int getMaDD() {
        return maDD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setMaDD(int maDD) {
        this.maDD = maDD;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public abstract String Xetthuong();
}
