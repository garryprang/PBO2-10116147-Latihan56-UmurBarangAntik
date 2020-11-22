package pbo2.pkg10116147.latihan56.umurbarangantik;

/*
 * @author
 * Nama      : Garry Prang
 * Kelas     : PBO-2
 * NIM       : 10119065
 * Deskripsi : Program untuk menampilkan umur barang antik.
 */
public class Radio extends BarangAntik{
    public String name;
    
    public Radio(int umur) {
        super(umur);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
