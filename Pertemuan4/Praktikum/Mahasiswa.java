public class Mahasiswa {
    String nim;
    String nama;
    String programStudi;
    int semester;

    Mahasiswa(String nim, String nama, String programStudi, int semester){
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
        this.semester = semester;
    }

    void tampilkanInfo(){
        System.out.println("NIM: "+nim);
        System.out.println("Nama: "+nama);
        System.out.println("Program Studi: "+programStudi);
        System.out.println("Semester: "+semester);
    }

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa ("1202507007", "Daffa", "Informatika", 3);
        mhs1.tampilkanInfo();
    }
}