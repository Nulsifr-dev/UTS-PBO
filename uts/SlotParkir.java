public class SlotParkir {
    private int nomor;
    private Kendaraan kendaraan;

    // Konstruktor
    public SlotParkir(int nomor) {
        this.nomor = nomor;
        this.kendaraan = null;
    }

    // Parkir kendaraan ke slot
    public void parkir(Kendaraan k) {
        this.kendaraan = k;
    }

    // Cek apakah slot kosong
    public boolean isKosong() {
        return kendaraan == null;
    }

    // Getter
    public int getNomor() {
        return nomor;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }
}
