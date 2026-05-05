import java.util.ArrayList;

public class Transaksi {

    private Kasir kasir;               
    private ArrayList<Produk> items;     
    private double total;

    public Transaksi(Kasir kasir) {
        this.kasir = kasir;
        this.items = new ArrayList<>();
        this.total = 0;
    }

    public void tambahItem(Produk item) {
        items.add(item);
    }

    public double hitungTotal() {
        total = 0;
        for (Produk item : items) {
            total += item.hitungHarga();  
        }
        return total;
    }

    public void cetakStruk() {
        System.out.println("STRUK BELANJA");
        System.out.println("Kasir : " + kasir.getNama());
        System.out.println("ID : " + kasir.getIdKasir());
        System.out.println("\n");
        for (Produk item : items) {
            System.out.printf("%-20s Rp %.0f%n",
                item.getNama(), item.hitungHarga());
        }
        System.out.println("\n");
        System.out.printf("TOTAL Rp %.0f%n", hitungTotal());
    }
}
