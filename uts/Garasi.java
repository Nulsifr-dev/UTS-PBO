public class Garasi {
    private String nama;
    private SlotParkir[] daftarSlot; // Relasi komposisi: SlotParkir dibuat di dalam Garasi
    private Mekanik kepala;

    // Konstruktor
    public Garasi(String nama, int jumlahSlot) {
        this.nama = nama;
        // Komposisi: objek SlotParkir dibuat di dalam constructor Garasi
        this.daftarSlot = new SlotParkir[jumlahSlot];
        for (int i = 0; i < jumlahSlot; i++) {
            daftarSlot[i] = new SlotParkir(i + 1);
        }
    }

    // Set kepala mekanik
    public void setKepala(Mekanik kepala) {
        this.kepala = kepala;
    }

    // Parkir kendaraan ke slot kosong pertama
    public void parkir(Kendaraan k) {
        for (int i = 0; i < daftarSlot.length; i++) {
            if (daftarSlot[i].isKosong()) {
                daftarSlot[i].parkir(k);
                return;
            }
        }
        System.out.println("Garasi penuh! Tidak ada slot kosong.");
    }

    // Parkir kendaraan ke slot tertentu (overloading)
    public void parkir(Kendaraan k, int nomorSlot) {
        // Guard clause: cek indeks valid
        if (nomorSlot < 1 || nomorSlot > daftarSlot.length) {
            System.out.println("Nomor slot tidak valid.");
            return;
        }
        if (!daftarSlot[nomorSlot - 1].isKosong()) {
            System.out.println("Slot " + nomorSlot + " sudah terisi.");
            return;
        }
        daftarSlot[nomorSlot - 1].parkir(k);
    }

    // Tampilkan info garasi
    public void tampilInfo() {
        System.out.println("Garasi " + nama + " (kepala: " + (kepala != null ? kepala.getNama() : "-") + ")");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < daftarSlot.length; i++) {
            if (i > 0) sb.append(" | ");
            sb.append("Slot " + (i + 1) + ": ");
            if (daftarSlot[i].isKosong()) {
                sb.append("kosong");
            } else {
                sb.append(daftarSlot[i].getKendaraan().getPlatNomor());
            }
        }
        System.out.println(sb.toString());
    }

    // Getter
    public SlotParkir getSlot(int nomor) {
        if (nomor < 1 || nomor > daftarSlot.length) {
            return null;
        }
        return daftarSlot[nomor - 1];
    }

    public String getNama() {
        return nama;
    }
}
