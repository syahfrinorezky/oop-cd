import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<CD> daftarCD = new ArrayList<>();
        ArrayList<Customer> daftarCustomer = new ArrayList<>();
        ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>();
        int pilih;

        do {
            System.out.println("========= MENU PEMINJAMAN CD ==========");
            System.out.println("1. Input Satu Peminjaman");
            System.out.println("2. Input Banyak Peminjaman");
            System.out.println("3. Tampilkan Semua Data");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu : ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    tambahPeminjaman(input, daftarCD, daftarCustomer, daftarPeminjaman);
                    break;

                case 2:
                    System.out.print("Berapa jumlah data yang ingin diinput: ");
                    int jumlah = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("\nInput data ke-" + (i + 1));
                        tambahPeminjaman(input, daftarCD, daftarCustomer, daftarPeminjaman);
                    }
                    break;

                case 3:
                    if (daftarPeminjaman.isEmpty()) {
                        System.out.println("Belum ada data peminjaman.\n");
                    } else {
                        System.out.println("========== DAFTAR PEMINJAMAN ==========");
                        System.out.println();
                        for (int i = 0; i < daftarPeminjaman.size(); i++) {
                            System.out.println("Peminjaman ke-" + (i + 1));
                            daftarPeminjaman.get(i).info();
                            System.out.println();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.\n");
                    break;
            }
        } while (pilih != 4);
    }

    static void tambahPeminjaman(Scanner input, ArrayList<CD> daftarCD, ArrayList<Customer> daftarCustomer, ArrayList<Peminjaman> daftarPeminjaman) {
        System.out.println("========= INPUT PEMINJAMAN ==========");
        System.out.print("Masukkan Nama CD       : ");
        String namaCd = input.nextLine();
        System.out.print("Masukkan Tahun CD      : ");
        String tahunCd = input.nextLine();
        System.out.print("Masukkan Jumlah Pinjam : ");
        int jumlahPinjam = input.nextInt();
        input.nextLine();

        System.out.print("Nama Peminjam          : ");
        String namaPeminjam = input.nextLine();
        System.out.print("No KTP Peminjam        : ");
        String noKtp = input.nextLine();
        System.out.print("Alamat Peminjam        : ");
        String alamatPeminjam = input.nextLine();

        CD cd = new CD(namaCd, tahunCd, jumlahPinjam);
        Customer customer = new Customer(namaPeminjam, noKtp, alamatPeminjam);
        Peminjaman peminjaman = new Peminjaman(cd, customer);

        daftarCD.add(cd);
        daftarCustomer.add(customer);
        daftarPeminjaman.add(peminjaman);

        System.out.println();
        System.out.println("Data peminjaman berhasil ditambahkan.\n");
    }
}
