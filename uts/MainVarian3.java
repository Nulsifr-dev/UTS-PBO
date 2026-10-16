public class MainVarian3 {
    public static void main(String[] args) {
        // 1. Buat Garasi "Rental Arjuno" dengan 4 slot, kepala Mekanik "Pak Joko" (Mesin)
        Garasi garasi = new Garasi("Rental Arjuno", 4);
        Mekanik pakJoko = new Mekanik("Pak Joko", "Mesin");
        garasi.setKepala(pakJoko);

        // 2. Buat Pelanggan ("3573010101", "Dina")
        Pelanggan dina = new Pelanggan("3573010101", "Dina");

        // 3. Mobil ("N 1234 AB", "Toyota Avanza", 350000, true) disewa Dina selama 3 hari
        Mobil mobil = new Mobil("N 1234 AB", "Toyota Avanza", 350000, true);
        mobil.setPenyewa(dina);
        mobil.setHariSewa(3);

        // 4. Motor ("N 5678 CD", "Honda Vario", 80000, 125) disewa Dina selama 7 hari
        Motor motor = new Motor("N 5678 CD", "Honda Vario", 80000, 125);
        motor.setPenyewa(dina);
        motor.setHariSewa(7);

        // 5. garasi.parkir(mobil); garasi.parkir(motor, 4);
        garasi.parkir(mobil);       // parkir di slot kosong pertama
        garasi.parkir(motor, 4);    // parkir di slot 4

        // Cetak nota untuk keduanya
        Kasir kasir = new Kasir("Kasir1");
        kasir.cetakNota(mobil);
        kasir.cetakNota(motor);
        garasi.tampilInfo();
    }
}
