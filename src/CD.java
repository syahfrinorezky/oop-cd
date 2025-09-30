public class CD {
    private String nama;
    private String tahun;
    private int jumlahCd;

    public CD(String nama, String tahun, int jumlahCd) {
        this.nama = nama;
        this.tahun = tahun;
        this.jumlahCd = jumlahCd;
    }

    public String getNama() {
        return nama;
    }

    public String getTahun() {
        return tahun;
    }

    public int getJumlahCd() {
        return jumlahCd;
    }

    public void info() {
        System.out.println("Nama CD   : " + this.nama);
        System.out.println("Tahun     : " + this.tahun);
        System.out.println("Jumlah CD : " + this.jumlahCd);
    }
}
