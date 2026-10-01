import java.util.Scanner;
public class Mahasiswa2 {
    String nim;
    String nama;
    String programStudi;

    Mahasiswa2(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }
    void tampilkanBiodata(){
        System.out.println("NIM:"+nim);
        System.out.println("Nama:"+nama);
        System.out.println("ProgramStudi:"+programStudi);
    }
}
class Nilai{
    double tugas;
    double uts;
    double uas;
    Nilai(double tugas, double uts, double uas) {
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    double hitungNilaiAkhir(){
        return (tugas * 0.30) + (uts * 0.30) + (uas * 0.40);
    }

    String tentukanKategori(){
        double akhir = hitungNilaiAkhir();
        if (akhir >= 90) return "A";
        else if (akhir >= 75) return "B";
        else if (akhir >= 50) return "C";
        else return "D";
    }

    void tampilkanNilai(){
        System.out.println("Nilai Tugas:"+tugas);
        System.out.println("Nilai UTS:"+uts);
        System.out.println("Nilai UAS:"+uas);
        System.out.printf("Nilai Akhir:%.2f\n",hitungNilaiAkhir());
        System.out.println("Kategori:"+tentukanKategori());
    }
}
class MainMahasiswaNilai{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("NIM: ");
        String nim = input.nextLine();
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("ProgramStudi: ");
        String programStudi = input.nextLine();
        Mahasiswa2 mhs = new Mahasiswa2(nim, nama, programStudi);

        System.out.print("Nilai Tugas:");
        double tugas = input.nextDouble();
        System.out.print("Nilai UTS:");
        double uts = input.nextDouble();
        System.out.print("Nilai UAS:");
        double uas = input.nextDouble();
        Nilai n = new Nilai(tugas, uts, uas);

        System.out.println("\n=== DATA MAHASISWA ===");
        mhs.tampilkanBiodata();
        System.out.println("\n=== DATA NILAI ===");
        n.tampilkanNilai();
        input.close();
    }
}