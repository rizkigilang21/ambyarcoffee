/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambyarcoffee;

import java.util.ArrayList;

/**
 *
 * @author macbookair
 */
public class Transaksi {
     private String idTransaksi;
    private Pegawai pegawai;
    private ArrayList<MenuPesanan>daftarMenuPesanan=new ArrayList<>();
    private int totalHarga;

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String id_Transaksi) {
        this.idTransaksi = id_Transaksi;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }
    
    public void tambahMenu(MenuPesanan mp) {
        daftarMenuPesanan.add(mp);
    }
    
    public void hapusMenu(MenuPesanan mp) {
        daftarMenuPesanan.remove(mp);
    }
    
    public MenuPesanan cariMenu(Menu menu){
        for(MenuPesanan mp : daftarMenuPesanan){
            if(menu==mp.getNamaMenu()){
                return mp;
            }
        }
        return null;
    }
    
    public String cetakMenu(Menu menu){
        if (this.cariMenu(menu) != null){
            return(menu + "\t" + String.valueOf(this.cariMenu(menu).getHarga()) + "*(" + String.valueOf(this.cariMenu(menu).getQty()) + ")\t" + String.valueOf(this.cariMenu(menu).getHarga()*this.cariMenu(menu).getQty()) + "\n");
        }
        return("");
    }
    
    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga() {
        int harga = 0;
        for(MenuPesanan mp : daftarMenuPesanan){
            harga = harga + (mp.getHarga()*mp.getQty());
        }
        this.totalHarga = harga;
    }
    
}
