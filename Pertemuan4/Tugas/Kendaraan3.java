import java.util.Scanner;
public class Kendaraan3 {
    String merk;
    String warna;
    int tahun;
    boolean statusMesin;
    Kendaraan3(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
        this.statusMesin = false;
    }
    void nyalakanMesin(){
        if(statusMesin) {
            System.out.println("Mesin sudah menyala.");
        }else{
            statusMesin = true;
            System.out.println("Mesin" + merk + "berhasil dinyalakan.");
        }
    }
    void matikanMesin(){
        if(statusMesin) {
            System.out.println("Mesin sudah mati.");
        }else{
            statusMesin = false;
            System.out.println("Mesin" + merk + "berhasil dimatikan.");
        }
    }
    void tampilkanInfo(){
        System.out.println("Merk:"+merk);
        System.out.println("Warna:"+warna);
        System.out.println("Tahun:"+tahun);
        System.out.println("StatusMesin:"+(statusMesin? "Menyala" : "Mati"));
    }
}

class MainKendaraan3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Merk:");
        String merk = input.nextLine();
        System.out.print("Warna:");
        String warna = input.nextLine();
        System.out.print("Tahun:");
        int tahun = input.nextInt();
        input.nextLine();
        Kendaraan3 k = new Kendaraan3(merk,warna,tahun);

        int pilihan;
        do {
            System.out.println("\n=== MENU KENDARAAN ===");
            System.out.println("1. Nyalakan Mesin");
            System.out.println("2. Matikan Mesin");
            System.out.println("3. Tampilkan Informasi");
            System.out.println("4. Keluar");
            System.out.println("Pilih menu:");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1 -> k.nyalakanMesin();
                case 2 -> k.matikanMesin();
                case 3 -> k.tampilkanInfo();
                case 4 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
        input.close();
    }
}