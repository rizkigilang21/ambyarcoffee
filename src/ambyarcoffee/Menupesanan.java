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
public class Menupesanan {
     private Menu namaMenu;
    private int harga;
    private int qty;

    public Menu getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(Menu namaMenu) {
        this.namaMenu = namaMenu;
        if(this.namaMenu==Menu.CAPUCCINO){
            this.harga = 20000;
        }
        else if(this.namaMenu==Menu.MOCCACINO){
            this.harga = 20000;
        }
        else if(this.namaMenu==Menu.KOPI_HITAM){
            this.harga = 10000;
        }
        else if(this.namaMenu==Menu.KOPI_SUSU){
            this.harga = 15000;
        }
    }

    public int getHarga() {
        return harga;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
