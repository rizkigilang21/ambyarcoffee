/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambyarcoffee;

import java.util.ArrayList;

/**
 *
 * @author Rizki
 */
public class CoffeeShop {
    private ArrayList<Pegawai>daftarPegawai=new ArrayList<>();
    private ArrayList<Transaksi>daftarTransaksi=new ArrayList<>();

    public void tambahPegawai(Pegawai pgw){
        daftarPegawai.add(pgw);
    }
    
    public void hapusPegawai(Pegawai pgw){
        daftarPegawai.remove(pgw);
    }
    
    public void tambahTransaksi(Transaksi trk){
        daftarTransaksi.add(trk);
    }
    
    public void hapusTransaksi(Transaksi trk){
        daftarTransaksi.remove(trk);
    }
    
    public Pegawai cariPegawai(String input){
        for(Pegawai pgw: daftarPegawai){
            if(input.equalsIgnoreCase(pgw.getIdPegawai())){
                return pgw;
            }
        }
        return null;
    }
    
    public String printPegawai(String input){
        if(this.cariPegawai(input)==null){
            return("DATA PEGAWAI TIDAK ADA");
        }
        else {
            return("ID Pegawai\t: " + this.cariPegawai(input).getIdPegawai() +
                   "\nNama\t: " + this.cariPegawai(input).getNamaPegawai() +
                   "\nAlamat\t: " + this.cariPegawai(input).getAlamat() +
                   "\nJenis Kelamin\t: " + this.cariPegawai(input).getJk());
        }
    }
    
    public Transaksi cariTransaksi(String input){
        for(Transaksi trs: daftarTransaksi){
            if(input.equalsIgnoreCase(trs.getIdTransaksi())){
                return trs;
            }
        }
        return null;
    }
    
    
    ////fungsi baru
    
    public int getIdPegawai(){
        return this.daftarPegawai.size()+1;
    }
    
    public int getIdTransaksi(){
        return this.daftarTransaksi.size()+1;
    }
    
    public String getReport(String id){
        String temp = "";
        int tempTotal = 0;
        for(Pegawai pgw: daftarPegawai){
            if(id.equalsIgnoreCase(pgw.getIdPegawai())){
                for(Transaksi t: daftarTransaksi){
                    if(t.getPegawai().getIdPegawai().equalsIgnoreCase(id)){
                        
                        temp +=     "\n\nTanggal : "+t.getTs()+
                                    "\n--------------------------------------------------------------------\n" +
                                    t.cetakMenu(Menu.KOPI_HITAM) + 
                                    t.cetakMenu(Menu.KOPI_SUSU) + 
                                    t.cetakMenu(Menu.CAPUCCINO) + 
                                    t.cetakMenu(Menu.MOCCACINO) +
                                    "\n--------------------------------------------------------------------\n" ;
                        tempTotal += t.getTotalHarga();
                    }
                }
                temp += "\n--------------------------------------------------------------------\n" + 
                        "\nTOTAL HARGA:\t\t" + tempTotal+
                        "\n--------------------------------------------------------------------\n" ;
                return temp;
            }
        }
        return "DATA PEGAWAI TIDAK ADA";
    }
}
