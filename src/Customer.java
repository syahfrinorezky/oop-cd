public class Customer {
    private String nama;
    private String noKtp;
    private String alamat;

    public Customer(String nama, String noKtp, String alamat) {
        this.nama = nama;
        this.noKtp = noKtp;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void info() {
        System.out.println("Nama   : " + this.nama);
        System.out.println("NoKtp  : " + this.noKtp);
        System.out.println("Alamat : " + this.alamat);
    }
}
