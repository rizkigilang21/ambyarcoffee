/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambyarcoffee;

/**
 *
 * @author macbookair
 */
public class Pegawai {
     private String idPegawai;
    private String namaPegawai;
    private String alamat;
    private JenisKelamin jk;

    public JenisKelamin getJk() {
        return jk;
    }

    public void setJk(JenisKelamin jk) {
        this.jk = jk;
    }
    
    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}
