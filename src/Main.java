import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<CD> daftarCD =  new ArrayList<>();
        ArrayList<Customer> daftarCustomer = new ArrayList<>();
        ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>();

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

        daftarPeminjaman.get(0).info();

    }
}
