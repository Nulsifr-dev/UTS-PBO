public class Mobil extends Kendaraan {
    private boolean denganSopir;

    // Konstruktor
    public Mobil(String platNomor, String merk, int tarifHarian, boolean denganSopir) {
        super(platNomor, merk, tarifHarian);
        this.denganSopir = denganSopir;
    }

    // Override hitungSewa()
    @Override
    public int hitungSewa() {
        int biayaDasar = tarifHarian * hariSewa;
        if (denganSopir) {
            biayaDasar += 150000 * hariSewa;
        }
        return biayaDasar;
    }

    @Override
    public String getJenis() {
        return "Mobil";
    }
}
