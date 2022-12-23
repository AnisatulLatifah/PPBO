/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_Anisa;

public class PC extends Komputer implements Mouse, Keyboard, Printer{
    
        public PC(){
        }

        @Override
        void hidupkan_os() {
            if(this.status == false){
               this.status = true;
                System.out.println("PC dinyalakan!");
            }else{
                System.out.println("PC sudah menyala!");
            }
        }

        @Override
        void matikan_os() {
            if(status == true){
                this.status = false;
                System.out.println("PC dimatikan!");
            }else{
                System.out.println("PC sudah dimatikan!");
            }

        }

        @Override
        public void klik_kanan() {
            if(this.status == true){
                System.out.println("Klik Kanan dilakukan");
            }else{
                System.out.println("Silahkan menyalakan PC !");
            }
        }

        @Override
        public void klik_kiri() {
               if(this.status == true){
                System.out.println("Klik Kiri dilakukan");
            }else{
                System.out.println("Silahkan menyalakan PC !");
            }
        }
        @Override
        public void tekan_enter() {
           if(this.status == true){
                System.out.println("Klik Enter dilakukan");
            }else{
                System.out.println("Silahkan menyalakan Netbook !");
            }
        }

        @Override
        public void cetak_data() {
            if(status == false){
                System.out.println("Silahkan menyalakan PC !");
            }else{
                System.out.println("=================================");
                System.out.println("Merk        : "+super.merk);
                System.out.println("Warna       : "+super.warna);
                System.out.println("Processor   : "+super.processor);
            }
        }
}
