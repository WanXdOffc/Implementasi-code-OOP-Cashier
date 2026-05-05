public abstract class Produk {

    private String nama;   
    private double harga;
    private String kualitas;

    public Produk(String nama, double harga) {
        this.nama  = nama;
        this.harga = harga;
    }

    public abstract double hitungHarga();

    public String getNama(){
        return nama; 
    }
    public double getHarga(){
        return harga;
    }
}