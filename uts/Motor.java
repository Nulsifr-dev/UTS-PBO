public class Motor extends Kendaraan {
    private int cc;

    // Konstruktor
    public Motor(String platNomor, String merk, int tarifHarian, int cc) {
        super(platNomor, merk, tarifHarian);
        this.cc = cc;
    }

    // Override hitungSewa()
    @Override
    public int hitungSewa() {
        int biayaDasar = tarifHarian * hariSewa;
        if (hariSewa >= 7) {
            biayaDasar = (int) (biayaDasar * 0.9);
        }
        return biayaDasar;
    }

    @Override
    public String getJenis() {
        return "Motor";
    }

    public int getCc() {
        return cc;
    }
}
