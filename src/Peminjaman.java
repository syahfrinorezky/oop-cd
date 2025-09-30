public class Peminjaman {
    private CD cd;
    private Customer peminjam;

    public Peminjaman(CD kaset, Customer orang) {
        this.cd = kaset;
        this.peminjam = orang;
    }

    public void info() {
        System.out.println("========== INFORMASI PEMINJAMAN ==========");
        System.out.println("CD            : " + this.cd.getNama() + " (" + this.cd.getTahun() + ")");
        System.out.println("Jumlah Pinjam : " + this.cd.getJumlahCd());
        System.out.println();
        System.out.println("Peminjam      : " + this.peminjam.getNama() + " (" + this.peminjam.getNoKtp() + ")");
        System.out.println("Alamat        : " + this.peminjam.getAlamat());

    }
}
