package contoh_ant1;

class Hewan {
    String jenis;
    String jumlahkaki;

    Hewan (String jenis, String jumlahkaki){
        this.jenis = jenis;
        this.jumlahkaki = jumlahkaki;
    }

    void show(){
        System.out.println(this.jenis);
        System.out.println(this.jumlahkaki);
    }

    void setJenis(String jenis){
        this.jenis = jenis;
    }

    String getNama(){
        return this.jenis;
    }

    String sayHello(String pesan){
        return "Halo, " + this.jenis + "! " + pesan;
    }
}

public class Contoh_Ant1  {
    public static void main(String[] args) {
        Hewan hwn1 = new Hewan("Kambing", "4");
        hwn1.show();
        
        // Gunakan hwn1, karena hwn2 belum diinisialisasi
        hwn1.setJenis("Domba");
        hwn1.show();
        
        // Panggil metode getNama()
        System.out.println(hwn1.getNama());

        // Panggil metode sayHello()
        String data = hwn1.sayHello("Ternak");
        System.out.println(data);
    }
}