public class Kendaraan {
    protected String platNomor;
    protected String merk;
    protected int tarifHarian;
    protected int hariSewa;
    protected Pelanggan penyewa;

    // Konstruktor
    public Kendaraan(String platNomor, String merk, int tarifHarian) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.tarifHarian = tarifHarian;
        this.hariSewa = 0;
        this.penyewa = null;
    }

    // Setter & Getter
    public void setPenyewa(Pelanggan penyewa) {
        this.penyewa = penyewa;
    }

    public Pelanggan getPenyewa() {
        return penyewa;
    }

    public void setHariSewa(int hariSewa) {
        this.hariSewa = hariSewa;
    }

    public int getHariSewa() {
        return hariSewa;
    }

    // hitungSewa - bisa di-override oleh subclass
    public int hitungSewa() {
        return tarifHarian * hariSewa;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public String getMerk() {
        return merk;
    }

    public int getTarifHarian() {
        return tarifHarian;
    }

    public String getJenis() {
        return "Kendaraan";
    }
}
