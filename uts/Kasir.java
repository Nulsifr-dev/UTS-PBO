public class Kasir {
    private String nama;

    // Konstruktor
    public Kasir(String nama) {
        this.nama = nama;
    }

    // Cetak nota sewa kendaraan
    public void cetakNota(Kendaraan k) {
        // Guard clause: cek apakah kendaraan atau penyewa null
        if (k == null) {
            System.out.println("Kendaraan tidak valid.");
            return;
        }
        if (k.getPenyewa() == null) {
            System.out.println("Kendaraan " + k.getPlatNomor() + " belum memiliki penyewa.");
            return;
        }

        System.out.println("Nota [" + k.getJenis() + "] " + k.getPlatNomor() + " " + k.getMerk());
        System.out.println("Penyewa : " + k.getPenyewa().getNama()
                + " | Lama : " + k.getHariSewa() + " hari"
                + " | Total : " + k.hitungSewa());
    }

    public String getNama() {
        return nama;
    }
}
