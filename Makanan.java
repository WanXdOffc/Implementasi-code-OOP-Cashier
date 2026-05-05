public class Makanan extends Produk {

    private boolean isPedas;
    /*
    private boolean premium;
    */

    public Makanan(String nama, double harga, boolean isPedas) {
        super(nama, harga);  
        this.isPedas = isPedas;
    }

    @Override
    public double hitungHarga(){
        return getHarga(); 
    }

    public boolean isPedas(){
        return isPedas; 
    }
}
