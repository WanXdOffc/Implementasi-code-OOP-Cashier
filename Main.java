import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // Input data kasir
        System.out.println("INPUT DATA KASIR");
        System.out.print("Nama kasir : ");
        String namaKasir = sc.nextLine();
        System.out.print("ID kasir  : ");
        String idKasir = sc.nextLine();
 
        Kasir kasir = new Kasir(namaKasir, idKasir);
        Transaksi transaksi = new Transaksi(kasir);
 
        // Input item belanja
        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\nTAMBAH ITEM");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("0. Selesai / Cetak Struk");
            System.out.print("Pilih jenis item: ");
            int pilih = Integer.parseInt(sc.nextLine());
 
            if (pilih == 0) {
                lanjut = false;
 
            } else if (pilih == 1) {
                System.out.print("Nama makanan : ");
                String nama = sc.nextLine();
                System.out.print("Harga          : ");
                double harga = Double.parseDouble(sc.nextLine());
                System.out.print("Pedas? (y/n) : ");
                boolean pedas = sc.nextLine().equalsIgnoreCase("y");
                transaksi.tambahItem(new Makanan(nama, harga, pedas));
                System.out.println("Makanan ditambahkan!");
 
            } else if (pilih == 2) {
                System.out.print("Nama minuman : ");
                String nama = sc.nextLine();
                System.out.print("Harga : ");
                double harga = Double.parseDouble(sc.nextLine());
                System.out.print("Ukuran (ml) : ");
                int ukuran = Integer.parseInt(sc.nextLine());
                transaksi.tambahItem(new Minuman(nama, harga, ukuran));
                System.out.println("Minuman ditambahkan!");
 
            } else {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
 
        transaksi.cetakStruk();
        sc.close();
    }
}
