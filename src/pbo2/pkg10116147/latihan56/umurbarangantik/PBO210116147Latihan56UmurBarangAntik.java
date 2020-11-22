package pbo2.pkg10116147.latihan56.umurbarangantik;

/*
 * @author
 * Nama      : Garry Prang
 * Kelas     : PBO-2
 * NIM       : 10119065
 * Deskripsi : Program untuk menampilkan umur barang antik.
 */
public class PBO210116147Latihan56UmurBarangAntik {
    
    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        System.out.println("Nama barang antik: "+radio.getName());
        radio.tampilUmur();
    }
    
}
