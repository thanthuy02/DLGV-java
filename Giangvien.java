/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GGV;

/**
 *
 * @author THANTHUY
 */
public class Giangvien extends Person{
    private String donVi;
    private int soCT;

    public Giangvien() {
    }

    public Giangvien(String donVi, int soCT) {
        this.donVi = donVi;
        this.soCT = soCT;
    }

    public Giangvien(String donVi, int soCT, int maDD, String hoTen, String gioiTinh) {
        super(maDD, hoTen, gioiTinh);
        this.donVi = donVi;
        this.soCT = soCT;
    }

    public String getDonVi() {
        return donVi;
    }

    public int getSoCT() {
        return soCT;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public void setSoCT(int soCT) {
        this.soCT = soCT;
    }
    
    @Override
    public String Xetthuong(){
        if(this.soCT>10){
            return "Khen thuong";
        }
        else return null;
    }
    
}
