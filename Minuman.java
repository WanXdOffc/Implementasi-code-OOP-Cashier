public class Minuman extends Produk {

    private int ukuranMl;
    private boolean dingin;
    private boolean hangat;

    public Minuman(String nama, double harga, int ukuranMl) {
        super(nama, harga);
        this.ukuranMl = ukuranMl;
    }

    @Override
    public double hitungHarga(){
        return getHarga() * 1.1; //pajak 10%
    }

    public int getUkuranMl(){
        return ukuranMl; 
    }
}
