import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplikasiObat {
    private static List<Obat> daftarObat = new ArrayList<>();

    public AplikasiObat() {
        ArrayList<Object> items = new ArrayList<>();
    }

    public void addItem(Medicine item) {
        daftarObat.add((Obat) daftarObat);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menambahkan beberapa obat ke daftar obat
        daftarObat.add(new Obat("Paracetamol", 5000, "Untuk mengurangi rasa demam pada tubuh."));
        daftarObat.add(new Obat("Amoxicillin", 15000, "Untuk membunuh bakteri yang terdapat dalam tubuh. "));
        daftarObat.add(new Obat("Loperamide", 8000, "Untuk mengatasi diare."));
        daftarObat.add(new Obat("Ibu Profen", 10000, "Untuk mengurangi peradangan dan mengurangi rasa sakit."));
        daftarObat.add(new Obat("Omeprazole", 25000, "Untuk menurunkan produksi asam berlebih pada lambung. "));

        // Menampilkan daftar obat yang tersedia
        System.out.println("Daftar Obat Tersedia:");
        for (int i = 0; i < daftarObat.size(); i++) {
            System.out.println((i + 1) + ". " + daftarObat.get(i).getNama() + " - Rp." + daftarObat.get(i).getHarga());
        }

        System.out.println("\nSilakan pilih obat (Masukkan nomor obat):");
        int nomorObat = input.nextInt();

        // Memvalidasi nomor obat yang dipilih
        if (nomorObat < 1 || nomorObat > daftarObat.size()) {
            System.out.println("Nomor obat tidak valid. Aplikasi berhenti.");
            System.exit(0);
        }

        Obat obatDibeli = daftarObat.get(nomorObat - 1);

        System.out.print("Masukkan jumlah obat yang dibeli: ");
        int jumlahObat = input.nextInt();

        int totalHarga = obatDibeli.getHarga() * jumlahObat;

        System.out.println("\n------ RINCIAN PEMBAYARAN ------");
        System.out.println("Nama Obat: " + obatDibeli.getNama());
        System.out.println("Harga Obat: Rp." + obatDibeli.getHarga());
        System.out.println("Jumlah Obat: " + jumlahObat);
        System.out.println("Total Harga: Rp." + totalHarga);
        System.out.println("Deskripsi: " + obatDibeli.getDeskripsi());
        System.out.println("-------------------------------");


        System.out.print("\nMasukkan jumlah uang yang dibayarkan: ");
        int jumlahUang = input.nextInt();

        int kembalian = (int) (jumlahUang - totalHarga);

        System.out.println("Kembalian: Rp." + kembalian);
        System.out.println("Semoga cepat sembuh!");

        input.close();
    }

    static class Obat {
        private String nama;
        private int harga;
        private String deskripsi;


        public Obat(String nama, int harga, String deskripsi) {
            this.nama = nama;
            this.harga = harga;
            this.deskripsi = deskripsi;
        }


        public String getNama() {
            return nama;
        }

        public int getHarga() {
            return harga;
        }

        public String getDeskripsi() {
            return deskripsi;
        }

    }
}
