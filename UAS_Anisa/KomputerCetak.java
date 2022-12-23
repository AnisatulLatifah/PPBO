/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_Anisa;
public final class KomputerCetak {
    public static void main(String[] args){
        Komputer[] komp = new Komputer[3];
        komp[0] = new PC();
        komp[0].merk = "Asus";
        komp[0].warna = "Gold";
        komp[0].processor = "Intel Celeron J4025 ";
        
        komp[1] = new Laptop();
        komp[1].merk = "Asus";
        komp[1].warna = "Silver";
        komp[1].processor = "Intel Core i3-1005G1";

        komp[2] = new Netbook();
        komp[2].merk = "Acer";
        komp[2].warna = "Hitam";
        komp[2].processor = "Celeron Quad Core N3450";
        
        KomputerCetak.cetak(komp);
    }
    
    final static void cetak(Komputer[] data){
        for(int i = 0; i<data.length; i++){
            if(data[i] instanceof PC){
                PC pc = (PC) data[i];
                pc.hidupkan_os();
                pc.klik_kanan();
                pc.klik_kiri();
                pc.tekan_enter();
                pc.cetak_data();
                pc.matikan_os();
                System.out.println();
            }else if(data[i] instanceof Laptop) {
                Laptop lp = (Laptop) data[i];
                lp.hidupkan_os();
                lp.klik_kanan();
                lp.klik_kiri();
                lp.tekan_enter();
                lp.cetak_data();
                lp.matikan_os();
                System.out.println();
            }else if(data[i] instanceof Netbook) {
                Netbook nb = (Netbook) data[i];
                nb.hidupkan_os();
                nb.klik_kanan();
                nb.klik_kiri();
                nb.tekan_enter();
                nb.cetak_data();
                nb.matikan_os();
                System.out.println();
        }
    }
}
}